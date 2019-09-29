package no.tdt4250.conversion.gogo;

import no.tdt4250.conversion.api.BaseUnit;

public class CommandUnit extends BaseUnit {

	private String name;
	private String symbol;
	
	public CommandUnit(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

}
