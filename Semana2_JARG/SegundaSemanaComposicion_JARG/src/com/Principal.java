package com;

public class Principal {

	public static void main(String[] args) {
		// En el concepto de composicion, es decir, cuando un objeto
		//es atributo de otro, tenemos primero que crear los más pequeños
		//antes de crear el objeto más grande
		
		//Necesitamos primero el procesador, ram y almacenamiento 
		//para que formen parte de nuestra laptop
		
		Almacenamiento kingston = new Almacenamiento("Kingstom", "SSD", 480);
		
		Procesador intel=new Procesador("Intel", "i5", 4.3, 8);
		
		Ram adata =new Ram("Adata", "DDR4", 2333);
		
		//Ahora sí ya puedo crear mi laptop y pasarle el valor a los objetos más pequeños
		
		Laptop hp =new Laptop("HP", "440G7", "plata", kingston, intel, adata);
		
		//Mando a imprimir a consola mi Laptop
		System.out.println(hp);

		/*
		 * Crear un ejemplo de objeto de composicion
		 * Crear un proyecto nuevo que se llame EjecicioComposicion_JARG 
		 * Crear un objeto que tenga atributos propios y que se componga de otros 3 objetos
		 * EJ. Un celularm que puede tener marca, modelo, color, y además tiene 
		 * una cámara, un procesador, y una Ram. 
		 * Ej2. Carro, que tiene marca, modelo, color y tiene 
		 * Llantas, estéreo, motor
		 */
		
	}

}
