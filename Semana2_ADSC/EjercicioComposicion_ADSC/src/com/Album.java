package com;

public class Album {

	private String artistName;
	private int existencias;
	private Disquera name;
	private Disquera location;
	private Presentacion type;
	private Estilo label;
	
	public Album() {
		
	}

	public Album(String artistName, int existencias, Disquera name, Disquera location, Presentacion type,
			Estilo label) {
		super();
		this.artistName = artistName;
		this.existencias = existencias;
		this.name = name;
		this.location = location;
		this.type = type;
		this.label = label;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public Disquera getName() {
		return name;
	}

	public void setName(Disquera name) {
		this.name = name;
	}

	public Disquera getLocation() {
		return location;
	}

	public void setLocation(Disquera location) {
		this.location = location;
	}

	public Presentacion getType() {
		return type;
	}

	public void setType(Presentacion type) {
		this.type = type;
	}

	public Estilo getLabel() {
		return label;
	}

	public void setLabel(Estilo label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Album [artistName=" + artistName + ", existencias=" + existencias + ", name=" + name + ", location="
				+ location + ", type=" + type + ", label=" + label + "]";
	}

	
	
}
