package com;

public class Hamburguesa {
	
	private String carne;
	private boolean cebolla;
	private boolean chile;
	private int queso;
	private boolean combo;
	
	public Hamburguesa(String carne, boolean cebolla, boolean chile, int queso, boolean combo) {
		super();
		this.carne = carne;
		this.cebolla = cebolla;
		this.chile = chile;
		this.queso = queso;
		this.combo = combo;
	}
	public Hamburguesa() {
		// TODO Auto-generated constructor stub
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public boolean isCebolla() {
		return cebolla;
	}
	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}
	public boolean isChile() {
		return chile;
	}
	public void setChile(boolean chile) {
		this.chile = chile;
	}
	public int getQueso() {
		return queso;
	}
	public void setQueso(int queso) {
		this.queso = queso;
	}
	public boolean isCombo() {
		return combo;
	}
	public void setCombo(boolean combo) {
		this.combo = combo;
	}
	@Override
	public String toString() {
		return "Hamburgesa [Que tipo de carne?=" + carne + ", cebolla=" + cebolla + ", chile=" + chile + ", Cuantas rebanadas queso?=" + queso
				+ ", Desea hacerlo combo?=" + combo + "]";
	}

}
