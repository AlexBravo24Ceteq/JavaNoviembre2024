package com;

public class Principal {

	public static void main(String[] args) {
		// primero cremos los atributos ma pequenios pa que formen parte de la superclase o 
		//en este cso de nuestr laptop la cual tiene como atributo eso objetos
		
//		Almacenamiento kingstong = new Almacenamiento("kingstong", "ssd", 480);
//		Procesador intel = new Procesador("intel", "i5", 4.3, 8);
//		Ram adata = new Ram("adata", "ddr4", 2333);
//		
//		//ahora podemo crear la laptop con el valor de los objetos mas pequenios
//		
//		Laptop hp = new Laptop("HP", "440G7", "plata", kingstong, intel, adata);
//		
//		System.out.println(hp);
		
		Motor triton = new Motor("Triton", 8, "Gasolina");
		Transmision transmision = new Transmision("Motor Craft", "automatica", 6);
		SistemaDeSonido sonido = new SistemaDeSonido("BOSE", true, 5.1);
		
		Automovil carro1 = new Automovil("Ford","Expedition", "arena", triton, transmision, sonido);
		
		System.out.println(carro1);

	}

}















