package com;

public class Principal {

	public static void main(String[] args) {

		
		//Cuando volvemos una clase abstracta, ésta no puede ser instanciada
		//es decir, no podemos crear objetos de esa clase
		//Persona pedro = new Persona("Pedro", 27, "Masculino");
		
		Empleado pablo = new Empleado(); //Polomorfismo de asignación, NO puedo crear personas ya que Persona es abstracta,
		//pero sí puedo asinarla como un Empleado
		
		pablo.setNombre("Pablo");
		
		//System.out.println(pedro);
		System.out.println(pablo);
		
		//Ej. De crear a un nuevo empleado
		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "rfcx00xx00", 25000, "Matutino");
		
		Empleado flojo = new Empleado();
		
		flojo.setNombre("Hugo");
		
		System.out.println(chambas);
		System.out.println(flojo);
		
		//Probar los métodos o acciones de nuestros objetos
		// Ej. Probando el método comer a través de una persona
		
		pablo.comer();
		pablo.comer("pollo");
		//Ej. Probando el método comer a través de un Empleado
		chambas.comer();
		
		//Ej. Probar un método con retorno
		
		pablo.saludar("tardes");
		
		//Ej. Probando los métodos polimórficos de comer()
		pablo.comer();
		pablo.comer("carne");
		pablo.comer("pollo", 2);
		
		//un empleado está heredando también todo de Persona
		chambas.comer();
		
		//Pero también puede tener métodos a los que solo el Empleado pueda acceder y una persona no
		chambas.checarEntrada();
		
		//Probar el método sumar de mis empleados
		pablo.sumar(18, 5);
		
		pablo.checarEntrada();

	}

}
