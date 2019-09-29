package no.tdt4250.conversion.gogo;

import org.osgi.framework.InvalidSyntaxException;

public class ConversionParser {

	/**
	 * Parses a conversion Formula e.g."Fahrenheit(F) = Celsius(C) * 1.8 + 32"
	 * @param conversionFormula
	 * @return parsed Conversion
	 * @throws InvalidSyntaxException 
	 */
	public CommandConversion parseConversion(String conversionFormula) throws InvalidSyntaxException {
		String[] splittedFormula = conversionFormula.split(" ");
		CommandUnit toUnit = parseUnit(splittedFormula[0]);
		CommandUnit fromUnit = parseUnit(splittedFormula[2]);
		
		if(splittedFormula.length != 7 || !splittedFormula[1].equals("=") || !splittedFormula[3].equals("*") || !splittedFormula[5].equals("+")) {
			throw new InvalidSyntaxException("Could not parse Conversion", conversionFormula);
		}

		double factor = Double.parseDouble(splittedFormula[4]);
		double bias = Double.parseDouble(splittedFormula[6]);
		
		return new CommandConversion(fromUnit, toUnit, factor, bias);
	}
	
	protected CommandUnit parseUnit(String unitString) throws InvalidSyntaxException {
		try {
			String[] splitted = unitString.split("\\(");
			String unitName = splitted[0];
			String symbol = splitted[1].split("\\)")[0];
			
			return new CommandUnit(unitName, symbol);
		} catch(IndexOutOfBoundsException exception) {
			throw new InvalidSyntaxException("Could not parse Unit", unitString, exception);
		}
	}
	
}
