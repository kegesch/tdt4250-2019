package no.tdt4250.conversion.api;

import org.osgi.annotation.versioning.ConsumerType;

@ConsumerType
public class ConversionResult {
	private double value;
	private double convertedValue;
	private Unit fromUnit;
	private Unit toUnit;
	private boolean success;
	
	public ConversionResult(double value, double convertedValue, Unit from, Unit to, boolean success) {
		this.value = value;
		this.convertedValue = convertedValue;
		this.fromUnit = from;
		this.toUnit = to;
		this.success = success;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public double getValue() {
		return value;
	}
	
	public double getConvertedValue() {
		return this.convertedValue;
	}
	
	public Unit getFromUnit() {
		return this.fromUnit;
	}
	
	public Unit getToUnit() {
		return this.toUnit;
	}
	
}
