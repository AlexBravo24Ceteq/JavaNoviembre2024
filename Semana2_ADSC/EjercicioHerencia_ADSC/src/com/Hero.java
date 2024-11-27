package com;

public class Hero extends Personaje {
	private boolean destreza;
	private String arma;
	private int experienceLevel;
	
	public Hero() {
		
	}

	public Hero(String name, boolean storage, String gender, int hands, int feet, boolean destreza, String arma,
			int experienceLevel) {
		super(name, storage, gender, hands, feet);
		this.destreza = destreza;
		this.arma = arma;
		this.experienceLevel = experienceLevel;
	}

	public boolean isDestreza() {
		return destreza;
	}

	public void setDestreza(boolean destreza) {
		this.destreza = destreza;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public int getExperienceLevel() {
		return experienceLevel;
	}

	public void setExperienceLevel(int experienceLevel) {
		this.experienceLevel = experienceLevel;
	}

	@Override
	public String toString() {
		return "Hero [destreza=" + destreza + ", arma=" + arma + ", experienceLevel=" + experienceLevel
				+ ", toString()=" + super.toString() + "]";
	}

	

}
