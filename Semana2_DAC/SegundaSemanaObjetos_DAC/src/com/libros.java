package com;

public class libros {

	private String autor;
	private String color;
	private int numPaginas;
	
	public libros() {
		
	}

	public libros(String autor, String color, int numPaginas) {
		super();
		this.autor = autor;
		this.color = color;
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "libros [autor=" + autor + ", color=" + color + ", numPaginas=" + numPaginas + "]";
	}
	
	
	
	
	
}
