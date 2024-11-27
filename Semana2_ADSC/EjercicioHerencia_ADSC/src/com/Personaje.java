package com;

public class Personaje {
	private String name;
	private boolean storage;
	private String gender;
	private int hands;
	private int feet;
		
	public Personaje() {
		
	}

	public Personaje(String name, boolean storage, String gender, int hands, int feet) {
		super();
		this.name = name;
		this.storage = storage;
		this.gender = gender;
		this.hands = hands;
		this.feet = feet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	@Override
	public String toString() {
		return "Personaje [name=" + name + ", storage=" + storage + ", gender=" + gender + ", hands=" + hands
				+ ", feet=" + feet + "]";
	}

	
		
}

