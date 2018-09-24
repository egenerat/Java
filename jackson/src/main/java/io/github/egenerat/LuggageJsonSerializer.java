package io.github.egenerat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class LuggageJsonSerializer extends JsonSerializer<Luggage> {

    @Override
    public Class<Luggage> handledType() {
        return Luggage.class;
    }

    @Override
    public void serialize(Luggage luggage, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString();
    }
}