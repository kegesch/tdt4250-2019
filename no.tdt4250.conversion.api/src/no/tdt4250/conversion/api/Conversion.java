package no.tdt4250.conversion.api;
import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Conversion {
	void setName(String name);
	String getName();
	void setFromUnit(Unit unit);
	Unit getFromUnit();
	void setToUnit(Unit unit);
	Unit getToUnit();
	double convert(double value); 
}
