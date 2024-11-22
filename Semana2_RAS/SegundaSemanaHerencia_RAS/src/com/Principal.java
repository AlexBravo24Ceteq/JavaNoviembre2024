package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cuendo volvemos una clase abstracta esta no puede ser instanseada 
		// es decir no podemos crear objetos de esta clase
		//Persona pedro = new Empleado("Perdo", "Hombre", 27);
		
		Empleado pablo = new Empleado();
		
		Empleado chambas = new Empleado("juan", "Masculino", 27, "SRFT23545ERR", "matutino", 25000);
		
		Empleado flojo = new Empleado();
		
		//System.out.println(chambas);
		
		//probando el metodo comer a traves de una persona
			System.out.println("Probando la herencia en los metodos con objetos de diferentes clases ");
				//pedro.comer();
				//probando el metodo comer s travez de empleado
				chambas.comer();
				//probando el metodo comer s travez de empleado
				flojo.comer();
				System.out.println();
		//Probando los metodos polimorficos de comer()
				System.out.println("POLIMORFISMO metodo comer()");
				//pedro.comer("pollo", "refresco");
				//pedro.comer("pizza");
				//pedro.comer();
				System.out.println();
				
		//Tamnbien puedo tener metodos propios a los que solo empleado puede acceder y no una persona 
				System.out.println("Metodos propios");
				chambas.checarEntrada();
				
		//Probar el metodo sumar()
				
				pablo.sumar(5, 10);
				pablo.comer();
				pablo.setNombre("Rodolfo");
				pablo.setRfc("RFGT55455");
				System.out.println(pablo.getNombre());

	}

}
