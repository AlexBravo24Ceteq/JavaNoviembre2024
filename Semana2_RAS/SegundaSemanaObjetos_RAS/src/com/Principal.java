package com;

public class Principal {

	public static void main(String[] args) {
		
		//En POO Solo existe una clase con el metodo main() 
		//que se encargara de ejecutar todo el proyecto 
		
		
		//Vamos a crear objetos provenientes de la clase persona
		
		//Ejemplo crear una persona vacia
		
		//Persona persona1 = new Persona();
		
		//Mi variable aun no tiene asignado los valores de sus atributos
		
		//juan.nombre = "Juan"; //Estamos asignando facilmente nombre a el objeto juan pero 
							  //no deberiamos ser capaces de poder modificar este valor 
		
		
//		Persona persona2 = new Persona("Rodolfo","masculino",30);
//		Persona persona3 = new Persona("Jose");
//		
//		
//		//Vamos a ejecutar el metodo get
//		
//		persona1.setNombre("Juan prez");
//		System.out.println(persona1.getNombre());
//		
//		//Mandando a traer datos de perosona 2 
//		System.out.println(persona2.getNombre());
//		System.out.println(persona2.getGenero());
//		System.out.println(persona2.getEdad());
//		
//		System.out.println(persona1);
//		System.out.println(persona2);
//		System.out.println(persona3);
		
		//Clase Perro
		
		Perro p1 = new Perro();
		Perro p2 = new Perro("pasto","cacho","macho",1);
		
		p1.setRaza("Chihuahua");
		p1.setNombre("firulais");
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Clase celular 
		
		Celular c1 = new Celular();
		Celular c2 = new Celular("Samsung","alta",15.500f,8);//String marca, String gama, float precio, float ram
		
		c2.setMarca("Apple");
		c2.setPrecio(20000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Clase empleado
		
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado("Jose","carpintero",2435,5500);//String nombre, String puesto, int id, float salario
		
		e1.setNombre("Karen");
		e1.setId(5896);
		
		System.out.println(e1);
		System.out.println(e2);
		
		

	}

}
