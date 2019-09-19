package no.tdt4250.conversion.api;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Conversion {
	Unit getFromUnit();
	Unit getToUnit();
	double convert(double value); 
	double convertInverse(double value);
}
