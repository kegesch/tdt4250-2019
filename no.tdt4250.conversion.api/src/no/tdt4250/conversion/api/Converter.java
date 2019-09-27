package no.tdt4250.conversion.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Converter {
	public void addConversion(Conversion conv);
	public void removeConversion(Conversion conv);
	public String convertValue(double value, String fromUnitName, String toUnitName);
}
