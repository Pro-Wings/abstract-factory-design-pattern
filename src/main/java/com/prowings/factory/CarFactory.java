package com.prowings.factory;

public class CarFactory {

	public static Car buildCar(CarType type, Location location) {
		Car car = null;
//		Location location = Location.USA; // Read location property somewhere from configuration
		// Use location specific car factory
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
		default:
			car = DefaultCarFactory.buildCar(type);
		}
		return car;
	}

}
