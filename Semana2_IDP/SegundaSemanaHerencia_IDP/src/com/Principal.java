package com;

public class Principal {

	public static void main(String[] args) {
		// ejemplo creando una nueva persona
		
		//Persona pedro = new Empledo("Pedro", 30, "Masculino");
		
		Persona pablo = new Empleado();
		pablo.setNombre("Pablo");
		
		//System.out.println(pedro);
		//System.out.println(pablo);

		Empleado chambas = new Empleado("juan", 25, "masculino", "juan123", 25000, "Matutino");
		
		Empleado flojo = new Empleado();
		flojo.setNombre("Hugo");
		
		//System.out.println(chambas);
		//System.out.println(flojo);
		
		//vamos  probar los metodos de nuestro objetos ejemplo el metodo comer
		
		pablo.comer("pollo");
		chambas.comer("pato");
		
		System.out.println(pablo.saludar("noches"));
		
		// probando mtodos polimorficos de comer
		pablo.comer();
		
		pablo.comer("hamburgesa", 2);
		
		chambas.checarEntrada();
		
		pablo.sumar(3,6);
		pablo.respirar();
		
	}

}
