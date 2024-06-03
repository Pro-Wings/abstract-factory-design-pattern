package com.prowings.factory;

public class TestAbstractFactoryPattern {
	
	
	  public static void main(String[] args)
	  {
	    System.out.println(CarFactory.buildCar(CarType.SMALL, Location.ASIA));
	    System.out.println(CarFactory.buildCar(CarType.SEDAN, Location.DEFAULT));
	    System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.USA));
	  }

}
