package no.tdt4250.conversion.temperature.units;

import no.tdt4250.conversion.api.Unit;

public class KelvinUnit implements Unit {

	@Override
	public String getName() {
		return "Kelvin";
	}

	@Override
	public String getSymbol() {
		return "K";
	}

}
