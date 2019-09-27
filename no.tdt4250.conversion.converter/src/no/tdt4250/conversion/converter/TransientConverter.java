package no.tdt4250.conversion.converter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.ConversionRepository;
import no.tdt4250.conversion.api.Converter;

@Component
public class TransientConverter implements Converter {
	
	private ConversionRepository repo;
	
	@Reference
	public void setConversionsRepository(ConversionRepository repo) {
		this.repo = repo;
	}

	
	public String convertValue(double value, String fromUnitName, String toUnitName) {
		String convertedValue = "Could not convert";
		for(Conversion conv : this.repo.getAvailableConversions()) {
			if(conv.getFromUnit().getName().equals(fromUnitName) && 
					conv.getToUnit().getName().equals(toUnitName)) {
				convertedValue = conv.convert(value) + "" + conv.getToUnit().getSymbol();
			} else if(conv.getFromUnit().getName().equals(toUnitName) &&
					conv.getToUnit().getName().equals(fromUnitName)) {
				convertedValue = conv.convertInverse(value) + "" + conv.getFromUnit().getSymbol();
			}
		}
		
		if(convertedValue.equals("Could not convert")) {
			convertedValue = convertTransient(value, fromUnitName, toUnitName);
		}
		
		return convertedValue;
	}
	
	private String convertTransient(double value, String fromUnitName, String toUnitName) {
		Map<String, Integer> dist = new HashMap<String, Integer>();
		Map<String, Conversion> prev = new HashMap<String, Conversion>();
		List<String> units = new ArrayList<String>();

		for(Conversion conv : this.repo.getAvailableConversions()) {
			if(!dist.containsKey(conv.getFromUnit().getName())) {
				dist.put(conv.getFromUnit().getName(), Integer.MAX_VALUE);
			}
			if(!dist.containsKey(conv.getToUnit().getName())) {
				dist.put(conv.getToUnit().getName(), Integer.MAX_VALUE);
			}
		}
		
		units = new ArrayList<>(dist.keySet());
		dist.put(fromUnitName, 0);
		
		while(!units.isEmpty()) {
			Comparator<? super Entry<String, Integer>> valueComparator = (entry1,
		            entry2) -> entry1.getValue().compareTo(entry2.getValue());
		    final List<String> copyUnits = new ArrayList<String>(units);
			String currentUnit = dist.entrySet().stream().filter(entry -> copyUnits.contains(entry.getKey())).min(valueComparator).get().getKey();
			units.remove(currentUnit);
			final List<String> copyUnits2 = new ArrayList<String>(units);
			List<Conversion> neighbors = findUnitNeighbors(currentUnit).stream().filter(conv -> copyUnits2.contains(conv.getFromUnit().getName()) || copyUnits2.contains(conv.getToUnit().getName())).collect(Collectors.toList());
			for(Conversion neighborConversion : neighbors) {
				String toConversion = neighborConversion.getFromUnit().getName().equals(currentUnit) ? neighborConversion.getToUnit().getName() : neighborConversion.getFromUnit().getName();
				Integer newDist = dist.get(currentUnit) + 1;
				if(newDist < dist.get(toConversion)) {
					dist.put(toConversion, newDist);
					prev.put(toConversion, neighborConversion);
				}
				
			}
		}
		
		List<Conversion> conversionChain = calcConversions(toUnitName, prev);
		Double convertedValue = value;
		String lastUnit = fromUnitName;
		boolean inverse = false;
		for(Conversion conv : conversionChain) {
			if(conv.getFromUnit().getName().equals(lastUnit)) {
				convertedValue = conv.convert(convertedValue);
				inverse = false;
				lastUnit = conv.getToUnit().getName();
			} else {
				convertedValue = conv.convertInverse(convertedValue);
				inverse = true;
				lastUnit = conv.getFromUnit().getName();
			}
		}
		
		Conversion lastConv = conversionChain.get(conversionChain.size()-1);
		return  String.format("%4.1f", convertedValue) + (inverse ? lastConv.getFromUnit().getSymbol() : lastConv.getToUnit().getSymbol());
	}
	
	private List<Conversion> calcConversions(String toUnitName, Map<String, Conversion> conversionsTree) {
		List<Conversion> conversionChain = new ArrayList<Conversion>();
		Conversion prev = conversionsTree.get(toUnitName);
		String nextUnitName = toUnitName;
		while(prev != null) {
			conversionChain.add(prev);
			nextUnitName = prev.getFromUnit().getName().equals(nextUnitName) ? prev.getToUnit().getName() : prev.getFromUnit().getName();
			prev = conversionsTree.get(nextUnitName);
		}
		
		Collections.reverse(conversionChain);
		return conversionChain;
	}
	
	private List<Conversion> findUnitNeighbors(String unitFrom) {
		List<Conversion> neighbors = this.repo.getAvailableConversions().stream().filter(conv -> conv.getFromUnit().getName().equals(unitFrom) || conv.getToUnit().getName().equals(unitFrom)).collect(Collectors.toList());
		return neighbors;
	}

	@Override
	public List<String> listConversions() {
		return this.repo.getAvailableConversions().stream().map(conv -> "Conversion [" + conv.getFromUnit().getName() + ", " + conv.getToUnit().getName() + "]").collect(Collectors.toList());
	}


	@Override
	public void setRepository(ConversionRepository repo) {
		this.repo = repo;
	}
}
