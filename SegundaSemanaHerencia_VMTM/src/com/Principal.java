package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Persona terron=new Persona("Victor Miguel Terron Macias",25,"Masculino");
//		System.out.println(terron);
		
//		terron.comer("Frijoles");
		
		
//		Persona macias=new Persona("Persona 2",18,"Femenino");
//		System.out.println(macias);
		
		//Creacion de empleado
		Empleado empleado1=new Empleado("Terrón",25,"Masculino","TEMV9910HTML",25000,"Matutino");
		System.out.println(empleado1);
		empleado1.comer("Pizza");
		Empleado empleado2=new Empleado();
		empleado2.setEdad(18);
		empleado2.setNombre("nombreEmpleado2");
		System.out.println(empleado2);
		System.out.println(empleado2.saludar("Tardes"));
		empleado2.comer();
		empleado2.comer("Pizza Arrabiata");
		empleado2.comer("Pasta italiana", 8);
		
		
		//metodos propios
		//funciones o comportamientos
		//dos formas de declarar los metodos que pueden ejecutar nuestros objetos
		//son acciones que pueden ejecutar nuestros objetos
		
		//una persona puede comer
		//los void no regresan nada
		
		
		//un empleado esta heredando todo de Persona
		//pero tambien puede tener metodos a los que zolo el empleado puede tener pero persona no
		empleado1.checarEntrada();
		
		//una clase abstracta es lo mismo a una clase convencional con la diferencia en 
		//que la abstracta debe poseer por lo menos un método abstracto
		//un metodo abstracto sirve para definir que se debe hacer pero no cómo se debe hacer
		//un metodo abstracto es un mpetodo vacío, un método el cuál no posee cuerpo,
		//que no puede realizar ninguna acción
		
		
		//ej de metodo abstracto
		//public abstract void sumar(int a,int b);
		//ej clase abstracta
		//class Persona{
		//    public abstract void sumar(int a, int b);
		//}
		
		//no se van a poder crear personas solo heredar
		
		//POLIMORFISMO 
		
		//cuando una clase se vuelve abstracta no se pueden crear objetos de esa clase
		
		Persona terron=new Empleado();//Polimorfismo de asignación
		terron.sumar(5, 10);
		terron.sumar(5, 11);
		
		//interfaces sirven para multiheredar, es una coleccion de metodos abstractos que no hace nada por si sola
		
		
		
		
		
		
		
		
		

	}

}
