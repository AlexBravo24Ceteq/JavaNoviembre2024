package com;

public class Disquera {
	private String name;
	private double location;
	
	public Disquera() {
		
	}

	public Disquera(String name, double location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Disquera [name=" + name + ", location=" + location + "]";
	}
	
	
}
