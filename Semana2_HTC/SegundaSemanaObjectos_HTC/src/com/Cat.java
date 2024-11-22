package com;

public class Cat {

	private String appearance;
	private String grooming;
	private String health;
	private String temperament;
	
	public Cat() {
		
	}
	
	public Cat(String appearance, String grooming, String health, String temperament) {
		super();
		this.appearance = appearance;
		this.grooming = grooming;
		this.health = health;
		this.temperament = temperament;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getGrooming() {
		return grooming;
	}

	public void setGrooming(String grooming) {
		this.grooming = grooming;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	@Override
	public String toString() {
		return " [appearance=" + appearance + ", grooming=" + grooming + ", health=" + health + ", temperament="
				+ temperament + "]";
	}
	
	
	
	
}
