package no.tdt4250.conversion.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Converter {
	
	private Collection<Conversion> conversions = new ArrayList<Conversion>();
	
	public void addConversion(Conversion conv) {
		this.conversions.add(conv);
	}
	
	public void removeConversion(Conversion conv) {
		this.conversions.remove(conv);
	}
	
	public String convertValue(double value, String fromUnitName, String toUnitName) {
		String convertedValue = "Could not convert"+ " ";
		for(Conversion conv : this.conversions) {
			if(conv.getFromUnit().getName().equals(fromUnitName) && 
					conv.getToUnit().getName().equals(toUnitName)) {
				convertedValue = conv.convert(value) + "" + conv.getToUnit().getSymbol();
			} else if(conv.getFromUnit().getName().equals(toUnitName) &&
					conv.getToUnit().getName().equals(fromUnitName)) {
				convertedValue = conv.convertInverse(value) + "" + conv.getToUnit().getSymbol();
			}
		}
		
		return convertedValue;
	}
	
	public List<Conversion> findTransientConversion(String fromUnitName, String toUnitName) {
		List<Conversion> pathToConversion = new ArrayList<Conversion>();
		
		
		
		return pathToConversion;
	}
}
