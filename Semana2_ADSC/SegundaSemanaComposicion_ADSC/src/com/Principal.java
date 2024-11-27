package com;

public class Principal {

	public static void main(String[] args) {
		
		//En el concepto de composición, es decir, cuando un objeto es atributo de otro,
		// tenemos primero que crear los más pequeños antes de crear el objeto más grande
		
		//Necesitamos primero el Procesador, Ram y Almacenamiento
		//para que formen parte de nuestra laptop
		
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		
		Procesador intel = new Procesador("Intel", "i5", 4.3, 8);
		
		Ram adata = new Ram("Adata", "DDR4", 2333);
		
		//Ahora sí ya puedo crear mi laptop y pasarle el valor de los objetos más pequeños
		Laptop hp = new Laptop("HP", "440G7", "Plata", kingston, intel, adata);
		
		//Mando a imprimir en consola mi Laptop
		System.out.println(hp);
		
		//Crear un ejemplo de objeto de composición
		//crear un proyecto nuevo que se llame EjercicioComposición_ADSC
		//Crear un objeto que tenga atributos propios y que se componga de otros 3 objetos
		//Ej. Un celular, que puede tener marca, modelo, color y además tiene 
		//una cámara, un procesador y una RAM
		//Ej. 2 carro que tiene marca, modelo, color y tiene
		//llantas, Estereo, Motor
		
		

	}

}
