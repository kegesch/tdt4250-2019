package no.tdt4250.conversion.api;

import java.util.ArrayList;
import java.util.Collection;

public class Converter {
	
	private Collection<Conversion> conversions = new ArrayList<Conversion>();
	
	public void addConversion(Conversion conv) {
		this.conversions.add(conv);
	}
	
	public void removeConversion(Conversion conv) {
		this.conversions.remove(conv);
	}
	
	public double convertValue(double value, String fromUnitName, String toUnitName) {
		double convertedValue = Double.NaN;
		for(Conversion conv : this.conversions) {
			if(conv.getFromUnit().getName().equals(fromUnitName) && 
					conv.getToUnit().getName().equals(toUnitName)) {
				convertedValue = conv.convert(value);
			}
		}
		
		return convertedValue;
	}
}
