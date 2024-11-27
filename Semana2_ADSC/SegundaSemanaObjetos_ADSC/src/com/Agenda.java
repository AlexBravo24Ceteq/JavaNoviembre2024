package com;

public class Agenda {
	private String name;
	private String lastName;
	private int cellNumber;
	private String address;
	private boolean registred;
	
	public Agenda() {
	}

	public Agenda(String name, String lastName, int cellNumber, String address, boolean registred) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cellNumber = cellNumber;
		this.address = address;
		this.registred = registred;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isRegistred() {
		return registred;
	}

	public void setRegistred(boolean registred) {
		this.registred = registred;
	}

	@Override
	public String toString() {
		return "Agenda [name=" + name + ", lastName=" + lastName + ", cellNumber=" + cellNumber + ", address=" + address
				+ ", registred=" + registred + "]";
	}
	
	
}
