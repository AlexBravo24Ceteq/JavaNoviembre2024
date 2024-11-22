package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona bob = new Persona ("Bob", 25, "Masculino");

		Persona mike = new Persona ();
		
		mike.setNombre("Mike");
		
		//System.out.println(bob);
		//System.out.println(mike);

		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "RFC034109", 25000, "Matutino");
	
		Empleado flojo = new Empleado();
		flojo.setNombre("Flojancio");
		
		//System.out.println(chambas);
		//System.out.println(flojo);

		bob.comer();

	}

}
