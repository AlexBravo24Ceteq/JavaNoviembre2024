package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la programacion orientada a objetos (POO) sólo existe una clase
		//con el método main que se encargará de ejecutar todo el proyecto
		
		//Vamos a comenzar a crear nuestros objetos provenientes de la clase persona
		
		//Ej. crear a una persona vacía, gracias al constructor vacío 
		
		Persona Juan=new Persona();
		
		//Mi variable u objeto Juan aun no tiene asignados los valores de su 
		//nombre, edad o género. Vamos a ver la forma incorrecta de asignar 
		//estos valores
		
		Juan.nombre="Juan Michi"; //aquí estamos asignando fácilmente 
		//un nombre al objeto Juan, pero no deberíamos ser capaces 
		//de poder modificar este valor así de sencillo
		
		
		//Vemos que ya no le podemos asignar nada a nuestros objetos
		
		
		//Vamos a crear una nueva Persona, pero con el constructor 
		//con todos los parámetros
		Persona fito = new Persona("Michi", 23, "Femenino");
		
		
		//Vamos a probar método GET para recuperar el nombre del objeto fito
		//y mandarlo a imprimir en consola
		System.out.println(fito.getNombre());
		
		//Probando asignarle un nombre a mi objeto Juan con el método SET
		Juan.setNombre("Juan Michi");
		
		System.out.println(Juan.getNombre());
		
		//Intentar mandar a imprimir todos los valores de mi objeto
		System.out.println(fito);
		
		
		//Ej. creando dos objetos de mi clase Taco
		Taco conTodo=new Taco("asada", 2, true, true,"verde");
		Taco vacio =new Taco();
		
		
		vacio.setIngPrincipal("Chorizo");
		vacio.setSalsa("Roja");
		vacio.setCilantro(true);
		
		System.out.println(conTodo);
		
		/*
		 * //Van a crear 3 clases para modelar 3 diferentes objetos. Los que ustedes gusten
		//Sus objetos a crear deben tener minimo 3 atributos, maximo los que ustedes quieran
		//Crean constructores, getters, setters, toString
		//Y van a crear de cada clase un objeto con todas las caracteristicas en esta clase 
		//principal y uno vacio al que posteriormente le agregaran valor a algun atributo
		//y los mandan a imprimir en consola. En esta clase y este mismo proyecto
		 */
		
		//Carro
		Carro ferrari=new Carro();
		Carro ferrari2=new Carro(4,"Rojo","Ferrari F8");
		
		ferrari.setColor("negro");
		ferrari.setLlantas(6);
		ferrari.setModelo("GT");
		
		System.out.println(ferrari);
		System.out.println(ferrari2);
		
		
		//Pizza
			Pizza pizza1=new Pizza();
			Pizza pizza2=new Pizza(8,"Peperoni","Familiar");
				
			pizza1.setRebanadas(4);
			pizza1.setSabor("Hawaiana");
			pizza1.setTamaño("Mediana");
				
			System.out.println(pizza1);
			System.out.println(pizza2);
			
			//iPhone
			iPhone iphone1=new iPhone();
			iPhone iphone2=new iPhone(6.9,"16 Pro Max",true);
				
			iphone1.setPantalla(4.7);
			iphone1.setModelo("SE");
			iphone1.setFaceID(false);
				
			System.out.println(iphone1);
			System.out.println(iphone2);
				
	}

	
	
}
