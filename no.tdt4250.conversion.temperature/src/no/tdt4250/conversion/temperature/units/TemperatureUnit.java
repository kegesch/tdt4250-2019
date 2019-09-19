package no.tdt4250.conversion.temperature.units;

import no.tdt4250.conversion.api.Unit;

public abstract class TemperatureUnit implements Unit {

	protected abstract String getShortName();
	
	@Override
	public String getSymbol() {
		return "°" + getShortName();
	}
}
