package com;

public class Principal {

	public static void main(String[] args) {
		
		// En el concepto de composicion es decir cuando un objeto
		// es atributo de otro tenemos primero que creear los mas pequeños
		// antes de creear el mas grande 
		
		// Nesecitamos primero el Procesador, Ram y Almacenamiento
		// para que forme parte de nuestra labtop
		
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		Procesador intel = new Procesador("Intel", "i5", 4.3, 8);
		Ram adata = new Ram("Adata", "DDR4", 2333);

		// ahora puedo crear mi labtop y pasarle el valor de los objetos pequeños }
		
		Laptop hp = new Laptop("HP", "440G7", "Plata", kingston, intel, adata);
		
		System.out.println(hp);
		
		//Crear un ejemplo de objeto de composicion
				//Crear un proyecto nuevo que se llame EjercicioComposicion_XXXX (sus iniciales)
				//Crean un objeto que tenga atributos propios y que se componga de otros 3 objetos
				//EJ. Un Celular, que puede tener marca, modelo, color, y además tiene
				//Una Camara, un Procesador, y una Ram.
				//Ej2. Carro, que tiene marca, modelo, color, y tiene
				//Llantas, Estereo, Moto		
	}

}
