package no.tdt4250.conversion.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.fasterxml.jackson.core.JsonProcessingException;

import no.tdt4250.conversion.api.Conversion;
import no.tdt4250.conversion.api.ConversionRepository;
import no.tdt4250.conversion.api.ConversionResult;
import no.tdt4250.conversion.api.Converter;

@Component(service=ConversionResource.class)
@JaxrsResource
@Path("convert")
public class ConversionResource {
	
	private Converter converter;
	private ConversionRepository conversions = new ConversionRepository();
	
	@Reference
	public void setConverter(Converter converter) {
		System.out.println("Using converter " + converter.getClass().getName());
		this.converter = converter;
		this.converter.setRepository(conversions);
	}
	
	@Reference(
			cardinality = ReferenceCardinality.MULTIPLE,
			policy = ReferencePolicy.DYNAMIC,
			bind = "addConversion",
			unbind = "removeConversion"
	)
	public void addConversion(Conversion conversion) {
		System.out.println("Added Conversion: " +  conversion.getFromUnit().getName() + "-" + conversion.getToUnit().getName());
		System.out.println(conversions);
		conversions.addConversion(conversion);
	}
	
	public void removeConversion(Conversion conversion) {
		System.out.println("Removed Conversion");
		conversions.removeConversion(conversion);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ConversionResult convert(@QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("value") double value) throws JsonProcessingException {
		return this.converter.convertValue(value, from, to);
	}
}
