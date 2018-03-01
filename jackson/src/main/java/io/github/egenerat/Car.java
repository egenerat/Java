package io.github.egenerat;

import java.util.List;

public class Car {
	private String model;
	private int doors;
	private List<Luggage> luggages;

	public Car() { }

	public String getModel() {
		return model;
	}

	public int getDoors() {
		return doors;
	}

	public List<Luggage> getLuggages() {
		return luggages;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setLuggages(List<Luggage> luggages) {
		this.luggages = luggages;
	}
}