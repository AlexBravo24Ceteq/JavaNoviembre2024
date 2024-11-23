package com;

public class Taco {
	
	private String ingredienteprincipal;
	private int numTortilla;
	private boolean cabolla;
	private boolean cilantro;
	private String salsa;
	
	public Taco() {
		
	}

	public Taco(String ingredienteprincipal, int numTortilla, boolean cabolla, boolean cilantro, String salsa) {
		super();
		this.ingredienteprincipal = ingredienteprincipal;
		this.numTortilla = numTortilla;
		this.cabolla = cabolla;
		this.cilantro = cilantro;
		this.salsa = salsa;
	}

	public String getIngredienteprincipal() {
		return ingredienteprincipal;
	}

	public void setIngredienteprincipal(String ingredienteprincipal) {
		this.ingredienteprincipal = ingredienteprincipal;
	}

	public int getNumTortilla() {
		return numTortilla;
	}

	public void setNumTortilla(int numTortilla) {
		this.numTortilla = numTortilla;
	}

	public boolean isCabolla() {
		return cabolla;
	}

	public void setCabolla(boolean cabolla) {
		this.cabolla = cabolla;
	}

	public boolean isCilantro() {
		return cilantro;
	}

	public void setCilantro(boolean cilantro) {
		this.cilantro = cilantro;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	@Override
	public String toString() {
		return "Taco [ingredienteprincipal=" + ingredienteprincipal + ", numTortilla=" + numTortilla + ", cabolla="
				+ cabolla + ", cilantro=" + cilantro + ", salsa=" + salsa + "]";
	}




}
