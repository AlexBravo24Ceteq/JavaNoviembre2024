package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//en la POO soolo existe una clase con e metodo main que se encaragra
		// de ejecutar todo el proyecto
		
		//Vamos a comenzar a crear nuestros objetos provenientes de la clase Persona
		
		//ej. crear a una persona vacia, gracias al construvtor vacio
		
		Persona juan = new Persona(); //persona es la clasee, juan es el objeto o tambien conocido como
		//instancia de clase
		// mi variable u objeto juan aun no tiene asignados los valores  de su nombre,edad o genero. 
		//Vamos a ver la forma incorrecta de asignar estos valores
		
		//juan.nombre = "Juan Alberto"; // aqui estamos asignando facilmente 
		//nombre al objeto Juan, pero no deberiamos ser capaces de poder modificar
		//este valor
		
		//vemos que ya no le podemos asignar nada a nuestros objetos
		// jua
		
		// Vamos a crear a una nueva Persona pero  con el constructor 
		// con todos los parametros
		
		Persona fito = new Persona("Rodolfo", 30, "Masculino");
		
		// si existe la necesidad de solo poner personas con su nombre se puede hacer 
		
		//Vamos a porbar metodo GET para recuperar el nombre del objeto fito
		// y manarlo a imprimir e consola
		
		System.out.println(fito.getNombre());
		// Probando asiganre un nombre a mi objeto Juan con el metodo SET
		juan.setNombre("Juan Alberto");
		
		System.out.println(juan.getNombre());
		
		
		//intentar mandra a imprimir todos los valores de mi objeto
		System.out.println(fito);
		
		System.out.println(juan);
		

		
		//EJERCICIO para modelar 3 diferentes objetos
		// sus objetos deben tener minimo 3 atributos
		// crean constructores, getters, setters, toString
		///Y van a crear de cada clase un objeto con todas las caracteristicas en esta clase 
		//principal y uno vacio al que posteriormente le agregaran valor a algun atributo
		//y los mandan a imprimir en consola. En esta clase y este mismo proyecto
		
		// Carro
		Carro lamborghini = new Carro();

		Carro lamborghini2 = new Carro(4,"rojo","Ferrari F8", 1);
		
		System.out.println(lamborghini2);
		
		//HAMBURGUESA 
		Hamburguesa original = new Hamburguesa ();
		Hamburguesa doble = new Hamburguesa (2,true,true,true,true);
		System.out.println(doble);
		
		// INEGI 
		
		INEGI hogar0= new INEGI ();
		INEGI hogar1= new INEGI ("Paquita",4,8,0,10);
		System.out.println(hogar1);
				
	}

	

	
	
	
	
	
	
	
	
	
	
	
	

	
	

	}
	

