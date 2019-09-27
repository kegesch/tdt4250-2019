package no.tdt4250.conversion.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import no.tdt4250.conversion.api.BaseUnit;
import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.ConversionRepository;
import no.tdt4250.conversion.api.ConversionResult;
import no.tdt4250.conversion.api.Unit;

public class ConverterTest {

	TransientConverter converter = new TransientConverter();
	ConversionRepository repo = new ConversionRepository();
	
	private BaseUnit createAnonUnit(String unitName) {
		return new BaseUnit() {
			
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
		repo = new ConversionRepository();
		converter.setRepository(repo);
	}
	
	@Test
	public void convertTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		repo.addConversion(aToB);
		
		Double value = 34.2;
		double expected = 69.4;
		ConversionResult calculatedValue = converter.convertValue(value, A.getName(), B.getName());
		assertEquals(expected, calculatedValue.getConvertedValue());
	}
	
	@Test
	public void convertInverseTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		repo.addConversion(aToB);
		
		double expected = 34.2;
		Double value = 69.4;
		ConversionResult calculatedValue = converter.convertValue(value, B.getName(), A.getName());
		assertEquals(expected, calculatedValue.getConvertedValue());
	}
	
	@Test
	public void convertTransientTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Unit C = createAnonUnit("C");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		Conversion bToC = createAnonConversion(3, 2, B, C);
		repo.addConversion(aToB);
		repo.addConversion(bToC);
		
		Double value = 34.2;
		double expected = 210.2;
		ConversionResult calculatedValue = converter.convertValue(value, A.getName(), C.getName());
		assertEquals(expected, calculatedValue.getConvertedValue());
	}
	
	@Test
	public void convertTransientWithInverseTest() {
		Unit A = createAnonUnit("A");
		Unit B = createAnonUnit("B");
		Unit C = createAnonUnit("C");
		Conversion aToB = createAnonConversion(2, 1, A, B);
		Conversion bToC = createAnonConversion(3, 2, B, C);
		repo.addConversion(aToB);
		repo.addConversion(bToC);
		
		double expected = 34.2;
		double value = 210.2;
		ConversionResult calculatedValue = converter.convertValue(value, C.getName(), A.getName());
		assertEquals(expected, calculatedValue.getConvertedValue());
	}
	
}
