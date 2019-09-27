package no.tdt4250.conversion.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.Unit;

public class ConverterTest {

	TransientConverter converter = new TransientConverter();
	
	private Unit createAnonUnit(String unitName) {
		return new Unit() {
			
			@Override
			public String getSymbol() {
				return unitName;
			}
			
			@Override
			public String getName() {
				return unitName;
			}
		};
	}
	
	private Conversion createAnonConversion(int factor, int bias, Unit from, Unit to) {
		return new Conversion() {
			
			@Override
			public Unit getToUnit() {
				return to;
			}
			
			@Override
			public Unit getFromUnit() {
				return from;
			}
			
			@Override
			public double convertInverse(double value) {
				return (value - bias) / factor;
			}
			
			@Override
			public double convert(double value) {
				return value * factor + bias;
			}
		};
	}
	
	@Before
	public void clean() {
		converter = new TransientConverter();
	}
	
	@Test
	public void convertTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		converter.addConversion(aToB);
		
		Double value = 34.2;
		String expected = 69.4 + "B";
		String calculatedValue = converter.convertValue(value, A.getName(), B.getName());
		assertEquals(expected, calculatedValue);
	}
	
	@Test
	public void convertInverseTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		converter.addConversion(aToB);
		
		String expected = 34.2 + "A";
		Double value = 69.4;
		String calculatedValue = converter.convertValue(value, B.getName(), A.getName());
		assertEquals(expected, calculatedValue);
	}
	
	@Test
	public void convertTransientTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Unit C = createAnonUnit("C");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		Conversion bToC = createAnonConversion(3, 2, B, C);
		converter.addConversion(aToB);
		converter.addConversion(bToC);
		
		Double value = 34.2;
		String expected = 210.2 + "C";
		String calculatedValue = converter.convertValue(value, A.getName(), C.getName());
		assertEquals(expected, calculatedValue);
	}
	
	@Test
	public void convertTransientWithInverseTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Unit C = createAnonUnit("C");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		Conversion bToC = createAnonConversion(3, 2, B, C);
		converter.addConversion(aToB);
		converter.addConversion(bToC);
		
		String expected = 34.2 + "A";
		double value = 210.2;
		String calculatedValue = converter.convertValue(value, C.getName(), A.getName());
		assertEquals(expected, calculatedValue);
	}
	
}
