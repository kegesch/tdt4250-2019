package no.tdt4250.conversion.temperature;

import org.osgi.service.component.annotations.Component;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.Unit;
import no.tdt4250.conversion.temperature.units.CelsiusUnit;
import no.tdt4250.conversion.temperature.units.KelvinUnit;

@Component
public class CelsiusToKelvin implements Conversion {

	@Override
	public Unit getFromUnit() {
		return new CelsiusUnit();
	}

	@Override
	public Unit getToUnit() {
		return new KelvinUnit();
	}

	@Override
	public double convert(double value) {
		return value + 273.15;
	}

	@Override
	public double convertInverse(double value) {
		return value - 273.15;
	}

}
