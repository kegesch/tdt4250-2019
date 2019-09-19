package no.tdt4250.conversion.temperature.units;

public class FahrenheitUnit extends TemperatureUnit {

	@Override
	public String getName() {
		return "Fahrenheit";
	}

	@Override
	protected String getShortName() {
		return "F";
	}

}
