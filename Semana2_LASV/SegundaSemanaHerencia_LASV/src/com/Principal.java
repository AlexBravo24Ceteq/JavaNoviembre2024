package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cuando volvemos una clase abstracta esta no puede ser instanciada
		//es decir no podemos crear objetos de esa clase
		//Persona pedro =  new Empleado("pedro", 27, "masculino");
		Persona pablo = new Empleado();//polimofirsmo de asignacion
		//no puedo crear personas ya que persona es abstracta, pero si puedo asignarla como un empleado
		pablo.setNombre("pablo");
		
		//System.out.println(pedro);
		System.out.println(pablo);

		
		Empleado chambas = new Empleado("juan", 25, "masculino", "SAKJHGF13", 25000, "matutino");
		
		Empleado flojo = new Empleado();
		
		flojo.setNombre("Hugo");
		
	System.out.println(chambas);
	System.out.println(flojo);
	
	// probar los metodos o acciones de nuestros objetos
	
	//Ej. probando el metodo comer atraves de una persona
	
	pablo.comer("pollo");
	
	chambas.comer("pizza");
	
	//Ej. provar un metodo con retorno. saludar()
	
	pablo.saludar("tardes");
	
	
	// provando los metodos polimorficos de comer
	
	pablo.comer();
	pablo.comer("pizza");
	pablo.comer("pizza", 3);
	
	//un empelado esta heredando tambien todo de persona
	
	chambas.comer();
	
	//pero tambien puede tener metodos a los que solo el emplleado puede acceder y persona no
	
	chambas.checarEntrada();
	
	//probar el metodo sumar de mis empleados
	
	pablo.sumar(10, 20);
	
	
	
	}
	
}
