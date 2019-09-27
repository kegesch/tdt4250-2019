package no.tdt4250.conversion.temperature.units;

import no.tdt4250.conversion.api.BaseUnit;

public abstract class TemperatureUnit extends BaseUnit {

	protected abstract String getShortName();
	
	@Override
	public String getSymbol() {
		return "°" + getShortName();
	}
}
