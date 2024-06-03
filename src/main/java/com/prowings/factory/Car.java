package com.prowings.factory;

public abstract class Car {

	private CarType model = null;
	private Location location = null;


	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
		arrangeParts();
	}

	private void arrangeParts() {
		// Do one time processing here
		System.out.println("Arranging parts for car!!");
	}

	// Do subclass level processing in this method
	protected abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	 @Override
	  public String toString() {
	    return "Model- "+model + " built in "+location;
	  }
}
