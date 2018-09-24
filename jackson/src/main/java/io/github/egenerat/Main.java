package io.github.egenerat;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main();
		obj.serialize();
	}

	private void serialize() {
		ObjectMapper mapper = new ObjectMapper();
		SimpleModule module = new SimpleModule("my luggage serializer");
		module.addSerializer(new LuggageJsonSerializer());
		// Add deserializer
		mapper.registerModule(module);
		Car carObj = createDummyObject();

		try {
			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(carObj);
			System.out.println(jsonInString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Car createDummyObject() {
		Car car = new Car();
		car.setModel("peugeot");
		car.setDoors(5);

		Luggage clotheLuggage = new Luggage();
		Luggage deviceLuggage = new Luggage();
		clotheLuggage.addContent("socks");
		clotheLuggage.addContent("t-shirts");
		deviceLuggage.addContent("tablet");

		car.setLuggages(Arrays.asList(clotheLuggage, deviceLuggage));
		return car;
	}
}