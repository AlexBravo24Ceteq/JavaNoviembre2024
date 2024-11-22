package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo existe una clase con el metodo main que se encargara de 
		// ejecutar todo el proyecto
		
		// vamos a comenzar a crear nuestros objetos provenientes de la clase persona
		//Ej. crear a una persona vacia, gracias al constructor vacio
		
		Persona juan = new Persona();
		
		//Mi variable u objeto Juan aun no tiene asignados los valores de nombre, edad o genero.
		//vamos a ver la forma incorrecta de asignar estos valores
		
		//juan.nombre="Juan Alberto";//aqui  estamos asignando facilmente un nombre al objeto juan
		//pero no deberiamos ser capaces de poder modificar este valor asi de sencillo
		
		//vemos que ya no podemos asignar nada a nuesteros objetos
		//juan
		
		//vamos a crear una nueva persona, pero con un nuevo constructor
		//con los parametros
		
		Persona fito = new Persona("Rodolfo",30,"Masculino");
		
		
		//Vamos a porbar el metodo Get para recuperar, el nombre del objeto fito
		//y mandarlo a imprimir en consola
		System.out.println(fito);
		
		//Probando asignarle un nombre a mi objeto juan con el metodo set
		juan.setNombre("Juan Alberto");
		System.out.println(juan);
		
		
		/*crearm 4 clases para modelar 3 diferentes objetos, los que ustedes gusten
		 * los objetos a crear deben tener minimo 3 atributos maximo los que gusten
		 * crear consturctores getters y setters, toString
		 * van agregar cada clase un objeto con todas sus caracteristicas en la clase pricipal y 
		 * uno vacio al que posteriormente le agregaran valor a algun atributo
		 * y los mandan a imprimir cn consola en esta clase y este mismo proyecto
		 */
		
		Hamburguesa conTodo = new Hamburguesa("sirlon", true, true, 2, true);
		
		System.out.println(conTodo);
		
		Hamburguesa sinCebolla = new Hamburguesa();
		
		sinCebolla.setCarne("Arrachera");
		sinCebolla.setCebolla(false);
		sinCebolla.setCombo(false);
		
		System.out.println(sinCebolla);
		
		Carro carro1 = new Carro("Camaro", 2024, "negro");
		
		System.out.println(carro1);
		
		Carro carro2 = new Carro();
		carro2.setModelo("Mustang");
		carro2.setAño(1997);
		System.out.println(carro2);
		
		Celular samsumg = new Celular("Samsumg", 64, 128, "negro", 8);
		System.out.println(samsumg);
		
		Celular redMagic = new Celular();
		redMagic.setModelo("Red Magic");
		redMagic.setCamara(48);
		redMagic.setMenRam(16);
		redMagic.setColor("rojo");
		System.out.println(redMagic);
	}

}
