package com;

public class Product {
	private int productID;
	private String name;
	private int inventory;
	private String description;
	private boolean registred;
	
	public Product() {
	}

	public Product(int productID, String name, int inventory, String description, boolean registred) {
		super();
		this.productID = productID;
		this.name = name;
		this.inventory = inventory;
		this.description = description;
		this.registred = registred;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRegistred() {
		return registred;
	}

	public void setRegistred(boolean registred) {
		this.registred = registred;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", inventory=" + inventory + ", description="
				+ description + ", registred=" + registred + "]";
	}
	
	
	
}
