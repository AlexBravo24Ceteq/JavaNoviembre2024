package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Almacenamiento Kinston = new Almacenamiento("kinston", "SSD", 480);
		
		Procesador intel = new Procesador("Intel", "i5", 4.3, 8);
		
		Ram adata = new Ram("Adata", "DDR4", 2300, 0);
		
		Laptop hp = new Laptop("HP", "44067", "plata", Kinston, intel, adata);
		
		System.out.println(hp);
		
		//Crear un ejemplo de objeto de composicion
				//Crear un proyecto nuevo que se llame EjercicioComposicion_XXXX (sus iniciales)
				//Crean un objeto que tenga atributos propios y que se componga de otros 3 objetos
				//EJ. Un Celular, que puede tener marca, modelo, color, y además tiene
				//Una Camara, un Procesador, y una Ram.
				//Ej2. Carro, que tiene marca, modelo, color, y tiene
				//Llantas, Estereo, Motor
		
		Camara camCel = new Camara(128, 12);
		ProcesadorCel prosCel = new ProcesadorCel("Snapdragon 8", 8, 3.4);
		RamCel ramCel = new RamCel("LPDDR5", 16);
		Celular redMagic = new Celular("REDMAGIC", "REDMAGIC 9S Pro", camCel, prosCel, ramCel, "\nnegro");
		
		System.out.println(redMagic);
		
		
	}
	
}
