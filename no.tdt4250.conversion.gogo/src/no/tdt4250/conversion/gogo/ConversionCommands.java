package no.tdt4250.conversion.gogo;

import java.io.IOException;

import org.apache.felix.service.command.Descriptor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Component;

import no.tdt4250.conversion.api.Conversion;

@Component(
		service = ConversionCommands.class,
		property = {
			"osgi.command.scope=conversion",
			"osgi.command.function=list",
			"osgi.command.function=units",
			"osgi.command.function=add",
		}
	)

public class ConversionCommands {

	private ConversionParser parser = new ConversionParser();
	
	@Descriptor("list available conversions")
	public void list() {
		System.out.print("Available Conversions: ");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<Conversion> serviceReference : bc.getServiceReferences(Conversion.class, null)) {
				Conversion conversion = bc.getService(serviceReference);
				try {
					if (conversion != null) {
						String conversionName = "["+conversion.getFromUnit().getName()+"/"+conversion.getToUnit().getName()+"]";
						System.out.print(conversionName);
					}
				} finally {
					bc.ungetService(serviceReference);
				}
				System.out.print(" ");
			}
		} catch (InvalidSyntaxException e) {
		}
		System.out.println();
	}
	
	@Descriptor("add a new linear conversion")
	public void add(
			@Descriptor("the formula for the new conversion")
			String formula
			) throws IOException, InvalidSyntaxException {
		Conversion newConversion = parser.parseConversion(formula);
		FrameworkUtil
		  .getBundle(getClass())
		  .getBundleContext()
		  .registerService(Conversion.class, newConversion, null);
		System.out.println("Added Conversion " + newConversion);
	}

	@Descriptor("add a new linear conversion")
	public void units() {
		
	}

}
