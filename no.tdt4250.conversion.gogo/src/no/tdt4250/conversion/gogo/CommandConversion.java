package no.tdt4250.conversion.gogo;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.Unit;

public class CommandConversion implements Conversion {
	
	private CommandUnit fromUnit;
	private CommandUnit toUnit;
	private double factor;
	private double bias;
	
	public CommandConversion(CommandUnit fromUnit, CommandUnit toUnit, double factor, double bias) {
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.factor = factor;
		this.bias = bias;
	}
	
	@Override
	public Unit getFromUnit() {
		return this.fromUnit;
	}

	@Override
	public Unit getToUnit() {
		return this.toUnit;
	}

	@Override
	public double convert(double value) {
		return value * factor + bias;
	}

	@Override
	public double convertInverse(double value) {
		return (value - bias) / factor;
	}
	
	@Override
	public String toString() {
		return "["+this.getFromUnit().getName()+"/"+this.getToUnit().getName()+"]";
	}

}
