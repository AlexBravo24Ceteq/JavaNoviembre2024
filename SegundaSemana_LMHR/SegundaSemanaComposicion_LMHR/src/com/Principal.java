package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// en el concepto de composicion, es decir, cuanfo un objeto
		// es atributo de otro, tenemos primero que crear los mas peque;os
		//antes de crear el objeto mas grande
		
		//necesitamos primero Procesador, Ram y Almacenamiento
		//para que formen parte de nuestra Laptop
		
		Almacenamiento kingston = new Almacenamiento("Kingston", "SSD", 480);
		
		Procesador intel = new Procesador("INTEL", "i5", 4.3, 8);
		
		Ram adata = new Ram("adata", "DDR4", 2333);
		
		//Ahora si ya puedo crear mi lapptop y pasarle el valor de los modelos mas peque;os
		
		Laptop hp = new Laptop("HP", "440G7", "PLATA", kingston, intel, adata);
		
		//mando a imprimir en consoa a laptop
		
		System.out.println(hp);

	}

}
