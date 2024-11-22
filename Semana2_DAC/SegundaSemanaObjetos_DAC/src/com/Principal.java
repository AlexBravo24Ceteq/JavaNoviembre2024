package com;

public class Principal {

	public static void main(String[] args) {
		// Solo existe una clase con el metodo main que se encargara de ejecutar todo el proyecto
		
		//vamos a comenzar a crear nuestros objetos provenientes de la clase persona ej; crear a una persona vacia
		//gracias al constructor vacio
		
		
		Persona juan = new Persona();
		
		
		//Mi variable u objeto juan ahun no tiene asignados los valores de su nombre, edad o genero
		
		//CUIDADO HAY UNA FORMA INCORRECTA DE ASIGNAR VALORES!!!
		
		/*
		juan.nombre="Juan Alberto";
		
		
		//aqui asisgnamos facilmente nombre al objeto juan pero
		//esto no es correcto ya que alguien podria cambiar esta variable
		*/
		
			//Vamos a ver que ya no le podemos asignar nada a los objetos
		
		
		// vamos a crar una nueva persona pero con el constructir con todos los parametros
		
				Persona fito = new Persona("Rodolfo", 30, "Masculino");
				
		
		// vamos a probar metodo get para recuperar el nombre del objeto fito y mandarlo a imprimir en consola
				
				System.out.println(fito.getNombre());
				
		// Probando asignarle un nombre al objeto juan con el metodo Set
				
				juan.setNombre("Juan Alberto");
				
				System.out.println(juan.getNombre());
				
		//intentar mandar a imprimir todos los valores de mi objeto
				
		System.out.println(fito);		
			System.out.println(juan);	
				
			//Van a crear 3 clases para modelar 3 diferentes objetos. Los que ustedes gusten
			//Sus objetos a crear deben tener minimo 3 atributos, maximo los que ustedes quieran
			//Crean constructores, getters, setters, toString
			//Y van a crear de cada clase un objeto con todas las caracteristicas en esta clase 
			//principal y uno vacio al que posteriormente le agregaran valor a algun atributo
			//y los mandan a imprimir en consola. En esta clase y este mismo proyecto
			
		telefonos samsung = new telefonos("Galaxy","Samsung",9560.50);
		
			telefonos tvacio = new telefonos();
			
			tvacio.setModelo("Huawei");
			tvacio.setModelo("Y9");
			tvacio.setPrecio(3950.20);
			
			
			libros kling = new libros("Jorge Volpi","Rojo",509);
			
			libros vlibro = new libros();
			
			vlibro.setAutor("JAmes Dasher");
			vlibro.setColor("Negro");
			
			animal perro = new animal("Perro",true,4);
			animal vanimal= new animal();
			vanimal.setNombre("Pato");
			vanimal.setNumPatas(2);
			vanimal.setMamifero(false);
			
			System.out.println(samsung);
			System.out.println(tvacio);
			System.out.println(kling);
			System.out.println(vlibro);
			System.out.println(perro);
			System.out.println(vanimal);
			
			
			
			
			
	}

}
