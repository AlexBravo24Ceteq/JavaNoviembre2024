package com;

public class Player {

	private String name;
	private String species;
	private String profession;
	private int level;
	private boolean claimed;
	
	public Player() {
		
	}
	
	public Player(String name, String species, String profession, int level, boolean claimed) {
		super();
		this.name = name;
		this.species = species;
		this.profession = profession;
		this.level = level;
		this.claimed = claimed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isClaimed() {
		return claimed;
	}

	public void setClaimed(boolean claimed) {
		this.claimed = claimed;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", species=" + species + ", profession=" + profession + ", level=" + level
				+ ", claimed=" + claimed + "]";
	}
	
	
	
	
}
