package com;

public class Libro {
	private String titulo;
	private int anoPublicacion;
	private String autores;
	
	public Libro() {
		
	}

	public Libro(String titulo, int anoPublicacion, String autores) {
		super();
		this.titulo = titulo;
		this.anoPublicacion = anoPublicacion;
		this.autores = autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + ", autores=" + autores + "]";
	}
	
	

}
