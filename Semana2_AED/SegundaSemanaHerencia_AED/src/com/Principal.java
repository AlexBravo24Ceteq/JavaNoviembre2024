package com;

public class Principal {

	public static void main(String[] args) {
		
		// Ej. Crear una nueva persona
		// cuando volvemos una clase abstracta esta no puede ser instanciada
		// es decir no podemos creear objetos de esa clase 
		//Persona pedro = new Persona("Pedro", 27, "Masculino");
		Empleado pablo = new Empleado(); // polimorfismo de asignacion
		// no puedo crear personas ya que es abstracta pero si puedo asignarla como empleado
		
		pablo.setNombre("Pablo");
		
		System.out.println(pablo);
		//System.out.println(pedro);
		
		// Ej. de Crear a un nuevo empleado
		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "RFC4654564", 25000, "Matutino");
		
		Empleado flojo = new Empleado();
		
		flojo.setNombre("Hugo");
		
		System.out.println(chambas);
		System.out.println(flojo);
		
		//Crear un nuevo proyecto. EjercicioHerencia_XXXX (iniciales)
				//Van a crear una clase que le herede a otra sus propiedades
				//Ej. Clase Vehiculo que le herede a otra, por ejemplo clase Carro
				//Ej. Electrodomestico, que le herede a Licuadora o Microondas
				//Piensen en los atributos, por lo menos 3 atributos por cada clase
				//Y los mandan a imprimir en la clase Principal de su proyecto

		// probar los metodos o acciones de nuestrtos objetos
		
		// ejemplo probando el metodo comer de una persona
		
		pablo.comer("Pollo");
		
		//Ej.probar el metodo comer atraves de empleo
		chambas.comer("Pizza");
		
		//Ej. probar un metodo con retorno . saludar()
		
		//System.out.println(pablo.saludar("tardes"));
		pablo.saludar("tardes");
		
		// probando los metodos polimorficos de comer();
		pablo.comer();
		
		pablo.comer("Pizza");
		
		pablo.comer("Pizza", 3);
		
		// un empleado esta heredando tambien todo lo de persona		
		chambas.comer();
		
		// pero tambien puede tener metodos a los que solo el empleado puede acceder
		chambas.checarEntrada();
		
		// probar el metodo sumar de mis empleados
		pablo.sumar(5, 7);
		
		pablo.checarEntrada();
		
	}

}
