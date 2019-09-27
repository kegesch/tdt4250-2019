package no.tdt4250.conversion.api;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Converter {
	public ConversionResult convertValue(double value, String fromUnitName, String toUnitName);
	public List<String> listConversions();
	public void setRepository(ConversionRepository repo);
}
