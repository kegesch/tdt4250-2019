package no.tdt4250.conversion.rest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsExtension;

import no.tdt4250.conversion.api.ConversionResult;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@JaxrsExtension
@Produces(MediaType.APPLICATION_JSON)
public class ConversionResultWriter implements MessageBodyWriter<ConversionResult> {
	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType) {
		return clazz == ConversionResult.class;
	}
	
	private ObjectMapper objectMapper = new ObjectMapper();
	{
		objectMapper.registerModule(new ConversionModule());
	}

	@Override
	public void writeTo(ConversionResult conversionResult, Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> values, OutputStream output) throws IOException, WebApplicationException {
		objectMapper.writeValue(output, conversionResult);
		output.flush();
	}
}
