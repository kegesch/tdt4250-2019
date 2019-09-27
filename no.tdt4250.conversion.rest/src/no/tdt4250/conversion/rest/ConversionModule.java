package no.tdt4250.conversion.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;

import no.tdt4250.conversion.api.ConversionResult;
import no.tdt4250.conversion.api.Unit;

public class ConversionModule extends Module {

	@Override
	public String getModuleName() {
		return "ConversionModule";
	}

	@Override
	public Version version() {
		return Version.unknownVersion();
	}

	private final SimpleSerializers serializers = new SimpleSerializers();

	public ConversionModule() {
		serializers.addSerializer(Unit.class, new JsonSerializer<Unit>() {
			@Override
			public void serialize(Unit unit, com.fasterxml.jackson.core.JsonGenerator jsonGen,
					SerializerProvider serializerProvider) throws IOException {
				jsonGen.writeStartObject(unit);
				jsonGen.writeStringField("name", unit.getName());
				jsonGen.writeStringField("symbol", unit.getSymbol());
				jsonGen.writeEndObject();
			}
		});
		serializers.addSerializer(ConversionResult.class, new JsonSerializer<ConversionResult>() {
			@Override
			public void serialize(ConversionResult result, JsonGenerator jsonGen, SerializerProvider serializerProvider)
					throws IOException {
				jsonGen.writeStartObject(result);
				jsonGen.writeBooleanField("success", result.isSuccess());
				jsonGen.writeNumberField("value", result.getValue());
				jsonGen.writeNumberField("converted", result.getConvertedValue());
				jsonGen.writeObjectField("unitFrom", result.getFromUnit());
				jsonGen.writeObjectField("unitTo", result.getToUnit());
			}
		});
	}

	@Override
	public void setupModule(final SetupContext context) {
		context.addSerializers(serializers);
	}

}
