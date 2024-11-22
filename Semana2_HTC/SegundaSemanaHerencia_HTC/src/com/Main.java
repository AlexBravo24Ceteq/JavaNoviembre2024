package com;

public class Main {

	public static void main(String[] args) {
		//
		
		//Persona pedro = new Persona("Pedro", 27,"Masculino"); // Esto ya mamó, porque no se puede instanciar una clase abstracta
		//Persona pablo = new Persona();
		
		Persona pedro = new Empleado("Pedro", 27,"Masculino","RFCAOSMDOASDM",25000, "Vespertino"); // Lo volví un Empleado ahora.
		Persona pablo = new Empleado(); // Aqui dice que es una Persona, pero es un Empleado. No podrá acceder a las cosas de Empleados.
		//Es una mamada.
		
		
		pablo.setName("Pablo");
		System.out.println(pedro);
		System.out.println(pablo);
		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "RFCX00XX00", 25000, "Matutino"); //Heredado con todo
		Empleado flojo = new Empleado();
		
		flojo.setName("Hugo");
		
		System.out.println(chambas);
		System.out.println(flojo);
		//Probando un método/acción dentro de mis objetos.
		
		pablo.comer("takis");
		flojo.saludar("2 de la tarde"); // aqui no imprime nada porque el método no lo tiene
		
		System.out.println(flojo.saludar("2 de la tarde"));
		pedro.comer();
		pedro.comer("Jamón", 100);
		
		chambas.checarEntrada();
		pablo.sumar(109, 1);
	}

}
