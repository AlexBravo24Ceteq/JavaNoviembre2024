package com;

public class Principal {

	public static void main(String[] args) {
		// en la poo olo existe un clase principal que e encargara e ejecutar todo el proyecto
		
		//vamos  comenzar  crear nuetros objetos proveniente de l clase persona
		//ejemplo crear una peron vacia, gracias al constructor vacio
		
		Persona juan = new Persona();
		
		//forma incorrect de asignar valores
		
		//juan.nombre= "fulanito";
		Persona fito = new Persona("Rodolfo", 30, "masculino");
		
		//vamos a probar el metodo get para obtener el nombre de fito e impromirlo en consola
		
		//System.out.println(fito.getNombre());
		
		juan.setNombre("juan");
		
		//System.out.println(juan.getGenero());
		
		//System.out.println(fito);
		
		System.out.println("                   ::::::Ejemplos de tres clases con dos objetos de cada una::::::::::");
		
		
		Carro bochito = new Carro("VW", "Bora", "negro", 5, "gasolina");
		
		Carro carrito = new Carro();
		carrito.setMarca("ford");
		carrito.setModelo("expedition");
		carrito.setColor("arena");
		carrito.setNumPuertas(5);
		
		Perro perro1 = new Perro("bull dog", "hercules", "cafe", 7);
		
		Perro perro2 = new Perro();
		perro2.setRaza("pator belga");
		perro2.setNombre("reptar");
		perro2.setEdad(4);
		perro2.setColor("negro");
		
		Television tv1 = new Television("samsung", 40, "LED", "ROKU");
		
		Television tv2 = new Television();
		tv2.setMarca("LG");
		tv2.setPulgadas(65);
		tv2.setTipoDisplay("QLED");
		tv2.setSoftware("Android TV");
		
		System.out.println(":::::::::carros::::::::::");
		System.out.println(bochito);
		System.out.println(carrito);
		
		System.out.println(":::::::::perros::::::::::");
		System.out.println(perro1);
		System.out.println(perro2);
		
		System.out.println(":::::::::televisores::::::::::");
		System.out.println(tv1);
		System.out.println(tv2);
		
		
		
		



		

	}

}
