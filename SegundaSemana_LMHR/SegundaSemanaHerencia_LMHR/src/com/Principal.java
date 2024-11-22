package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ej. Crear na nueva persona
		
		//Cuando tenemos una clase abstracta, esta no puede se instanciada
		// es decir no podemos crear objetos de esta clase 
		
		//Persona pedro = new Persona("pedro", 27, "Masculino");
		
		Persona pablo = new Empleado (); //Polimorfismo de asignacion
		//no puedo crear personas ya que Persona es abstracta, pero si puedo
		// asignarla como un empleado
		
		pablo.setNombre("Pablo");
		
		//System.out.println(pedro);
		System.out.println(pablo);
		
		//ej. Crear nuevo empleado
		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "RFCX00XX00", 25000, "Matutino");
		
		Empleado flojo = new Empleado ();
		
		flojo.setNombre("Hugo");
		System.out.println(chambas);
		System.out.println(flojo);
		
		//Probar los METODOS o acciones de nuestrs objetos
		//ej.Probando el metodo comer a traves de una persona
		
		pablo.comer();
		
		//probando el metodo comer a traves de un empleado
		chambas.comer();
		
		//ej. Probar un metodo con retorno. saludar ()
		pablo.saludar("tardes");
		// si se quiere imprimir seria:
		//System.out.println(pablo.saludar("tardes"));
		
		//ej. probando los metodos polimorficos de comer ()
		
		pablo.comer ();
		
		pablo.comer ("pizza");
		
		pablo.comer("pizza ", 3);
		
		//Un empleado esta heredando tambien todo de persona
		chambas.comer();
		//tambien puede tener metodos a los que solo el empleado 
		//puede acceder y una Persona no
		
		chambas.checarEntrada();
		
		//probar el metodo sumar de mis empleados
		pablo.sumar(5, 7);
		
		 
	}
	
	
	}


