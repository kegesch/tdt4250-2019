package no.tdt4250.conversion.gogo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.osgi.framework.InvalidSyntaxException;

public class ConversionParserTest {

	private ConversionParser parser = new ConversionParser();
	
	@Test
	public void parseUnitTest() {
		String parseString = "Fahrenheit(°F)";
		try {
			CommandUnit parsed = parser.parseUnit(parseString);
			assertEquals("Fahrenheit", parsed.getName());
			assertEquals("°F", parsed.getSymbol());
		} catch (InvalidSyntaxException e) {
			fail();
		}
	}
	
	@Test
	public void parseConversionTest() {
		String parseString = "Fahrenheit(°F) = Celsius(°C) * 2 + 3";
		try {
			CommandConversion conv = parser.parseConversion(parseString);
			assertEquals(5, conv.convert(1), 0.0001);
		} catch (InvalidSyntaxException e) {
			fail();
		}
	}
	
}
