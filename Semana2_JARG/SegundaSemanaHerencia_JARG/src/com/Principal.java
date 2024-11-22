package com;

public class Principal {

	public static void main(String[] args) {
		// Ej. crear una nueva persona
		
		
		//Cuando volvemos una clase abstracta, esta no puede ser instanciada
		//Es decir, no podemos crear objetos de esa clase
		//Persona pedro=new Persona("Pedro", 27, "Masculino");
		
		Empleado pablo=new Empleado(); //Polimorfismo de asignación
		//No puedo crear personas ya que persona es abstracta, pero si puedo asignarla como un Empleado
		
		pablo.setNombre("Pablo");
		
		//System.out.println(pedro);
		System.out.println(pablo);
		
		//Ej. de crear un nuevo empleado
		
		Empleado chambas = new Empleado("Juan", 25, "Masculino", "RFCX00XX00", 25000, "Matutino");
		
		Empleado flojo = new Empleado();
		
		flojo.setNombre("Hugo");
		
		System.out.println(chambas);
		System.out.println(flojo);
		
		
		//Crear un unevo proyecto. EjercicioHerencia_JARG
		//Van a crear una clase que le herede a otra sus propiedades
		//Ej. clase vehiculo que le herede a otra, por ejemplo clase carrro
		//Ej. electrodoméstico, que le herede a licuadora o microondas
		//Piensen en los atributos, por lo menos 3 atributos por cada clase
		//Y los mandan a imprimir en la clase principal de su proyecto
		
		
		//Probar los métodos o acciones de nuestros objetos
		
		//Ej. probando el método comer a través de una persona
		
		pablo.comer("pollo");
		chambas.comer("pizza");
		
		
		//Ej. probar un método con retorno. saludar()
		
		System.out.println(pablo.saludar("tardes"));
		
		//wj. probando los métodos polimórficos de comer();
		pablo.comer();
		pablo.comer("Pizza");
		pablo.comer("pizza", 3);
		
		
		
		//Un empleado está heredando también todo de persona
		
		chambas.comer();
		
		//pero también puede tener métodos a los que sólo el Empleado puedea acceder y una persona no.
		
		chambas.checarEntrada();
		
		//Probar el método sumar de mis empleados
		pablo.sumar(5, 7);
		
		pablo.checarEntrada();
		
		
		
	}

}






