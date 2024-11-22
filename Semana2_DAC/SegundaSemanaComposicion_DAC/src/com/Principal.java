package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// En el concepto de composicion es decir cuando un objeto es stributo de otro primero creamos los mas pequeñpos antes de crear el objeto mas grande
		
		//Necesitamos primero el Procesador, Ram y almacenamiento para que formen parte de nuestra laptop
		
		Almacenamiento kingstone = new Almacenamiento("Kingstone","SSD",480);
		
		Procesador intel = new Procesador("Intel", "I5", 4.3, 8);
		
		Ram adata = new Ram("Adata", "DDR4", 2333);
		
		//ahora si ya puedo crear mi laptop y pasarle el alor de los objetos más pequeños
		
		Laptop hp = new Laptop("HP", "440G7", "plata", kingstone, intel, adata);
		
		
System.out.println(hp);
		
//Crear un ejemplo de objeto de composicion
		//Crear un proyecto nuevo que se llame EjercicioComposicion_XXXX (sus iniciales)
		//Crean un objeto que tenga atributos propios y que se componga de otros 3 objetos
		//EJ. Un Celular, que puede tener marca, modelo, color, y además tiene
		//Una Camara, un Procesador, y una Ram.
		//Ej2. Carro, que tiene marca, modelo, color, y tiene
		//Llantas, Estereo, Motor
		
	}

}
