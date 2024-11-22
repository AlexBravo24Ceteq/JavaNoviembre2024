package com;

public class Principal {

	public static void main(String[] args) {
		//Ej. Crear una nueva persona
		// Cuando volvemos una clase abstracta esta no puede ser instanciada
		//es decir no se pueden crear objetos de esta clase
		//Persona pedro = new Persona("Pedro", 27, "Masculino");
		
		Empleado pablo = new Empleado();// polimorfismo de asignacion
		//No puedo crear personas ya que persona es abstracta pero si puedo asignarla comom un empleado
		
		pablo.setNombre("Pablo");
		
		//System.out.println(pedro);
		System.out.println(pablo);
		
		//Ej. de crear un nuevo empleado
		
		Empleado chambas = new Empleado("JUAN", 25, "Masculino", "RFCXXXXX", 25000, "Matutino");
		Empleado flojo = new Empleado();
		flojo.setNombre("Hugo");
		System.out.println(chambas);
		System.out.println(flojo);
		
		
		// crea nuevo proyecto. Ejercicio Herenci_DAC
		//Crear una clase que herede a otra sus propiedades
		//Ej. Clse vehiculo que herede a otra
		
		
		// Probar los metodos de o acciones de nuestros objetos
		//ej. probando el metodo comer a travez de una persona
		
		pablo.comer("pollo");
		
		// probando el metodo comer a travez de un empleado
		
		chambas.comer("pizza");
		
		//Ej. probar un metodo con retorno
		
		pablo.saludar("tardes");
		
		//probando los metodos polimorficos de comer
		
		pablo.comer();
		
		pablo.comer("pizza");
		pablo.comer("pizza", 3);
		
		// llas clases hijas tambien pueden tener sus propios metodos
		
		 chambas.checarEntrada();
		// Probar el metodo sumar de mis empleados
		pablo.sumar(5, 7);
		
		
		
		
		
	}

}
