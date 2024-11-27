package com;

public class Principal {

	public static void main(String[] args) {
		
		
		// En la POO sólo existe una clase con el método main que se 
		//encargará de ejecutar todo el proyecto
		
		//Vamos a comenzar a crear a nuestros objetos provenientes de la clase Persona
		//Ej. Crear a una persona vacía gracias al constructor vacío
		
		Persona juan = new Persona();
		
		//Mi varibable u objeto juan, aún no tiene asignados los valores de su 
		//nombre, edad o género. Vamos a ver la forma incorrecta de asignar estos valores
		
		//juan.nombre = "Juan Alberto"; //Aquí estamos asignando fácilmente un nombre a
		// el objeto juan, pero no deberíamos ser capaces de poder modificar este valor así de sencillo
		
		//Vemos que ya no le podemos asignar nadaa nuestros objetos en cuanto los encapsulo
		//juan.
		
		//Vamos a crear una nueva Persona, pero con el constructor con todos los atributos
		Persona fito = new Persona("Rodolfo", 30, "Masculino"); //Se declaran de acuerdo al tipo de dato y en el mismo orden en que están en el constructor
		
		//Vamos a probar el método GET para recuperar el nombre de objeto fito y mandarlo a imprimir en consola
		System.out.println(fito.getNombre());
		
		//Probando asignarle un nombre a mi objeto juan con el método SET
		juan.setNombre("Alex Baco");
		juan.setEdad(38);
		
		System.out.println(juan.getEdad());
		
		//Intentar mandar a imprimir todos los valores de mi objeto
		System.out.println(fito);
		
		System.out.println(juan);
		
			
		//Crear 3 clases para modelar 3 diferentes objetos.
		//Los objetos a crear deben tener al menos 3 atributos, máximo los que querramos
		//Crear constructores, getters, setters, toString()
		//Crear de cada clase un objeto con todas las características en esta clase
		//principal y uno vacío al que posteriormente le agregarán valor a algún atributo
		//y los mandan a imprimir en consola. En ésta clase y en este mismo proyecto
		
		System.out.println("Ejemplo 1 con registro de usuario:");
		Usuario user = new Usuario("AlexZool", "alejandro.sanchez@outlook.com", true, 551955790);
		
		Usuario voidUser = new Usuario();
		
		voidUser.setNickName("BacoNero");
		voidUser.setRegistred(false);
		voidUser.setEmail("prueba_1@gmail.com");
		
		System.out.println(user);
		System.out.println(voidUser);
		
		System.out.println("Ejemplo 2 con contactos de una Agenda:");
		Agenda contacto = new Agenda("Dionicio", "Téllez", 519715160, "Puebla, Puebla", false);
		
		Agenda contactoVacioAgenda = new Agenda();
		
		contactoVacioAgenda.setLastName("Ramos");
		contactoVacioAgenda.setRegistred(true);
		contactoVacioAgenda.setAddress("Huejotzingo, Puebla");

		
		System.out.println(contacto);
		System.out.println(contactoVacioAgenda);
		
		System.out.println("Ejemplo 3 con productos en un almacén:");
		
		Product article = new Product(1235, "Tornillo 3/8 pulgadas", 315, "Tornillo cabeza plana p/madera", true);
		
		Product emptyArticle = new Product();
		emptyArticle.setInventory(-15);
		emptyArticle.setRegistred(false);
		emptyArticle.setName("Clavo 3/8 pulgadas");
		
		System.out.println(article);
		System.out.println(emptyArticle);
		
		
		
	}

}
