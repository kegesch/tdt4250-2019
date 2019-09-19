package no.tdt4250.conversion.temperature;

import org.osgi.service.component.annotations.Component;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.Unit;
import no.tdt4250.conversion.temperature.units.CelsiusUnit;
import no.tdt4250.conversion.temperature.units.FahrenheitUnit;

@Component
public class CelsiusToFahrenheit implements Conversion {

	@Override
	public Unit getFromUnit() {
		return new CelsiusUnit();
	}

	@Override
	public Unit getToUnit() {
		return new FahrenheitUnit();
	}

	@Override
	public double convert(double value) {
		return value * 1.8 + 32;
	}

	@Override
	public double convertInverse(double value) {
		return (value - 32) / 1.8;
	}

}
