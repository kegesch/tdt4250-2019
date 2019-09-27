package no.tdt4250.conversion.api;

import java.util.ArrayList;
import java.util.Collection;

public class ConversionRepository {
	
	private Collection<Conversion> conversions;
	
	public ConversionRepository() {
		this.conversions = new ArrayList<Conversion>();
	}
	
	public void addConversion(Conversion conv) {
		conversions.add(conv);
	}
	
	public void removeConversion(Conversion conv) {
		conversions.remove(conv);
	}
	
	public Collection<Conversion> getAvailableConversions() {
		return new ArrayList<Conversion>(this.conversions);
	}
}
