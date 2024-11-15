package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// ESTRUCTURAS DE DECISION IF/ELSE
		
		//VAN A VALIDAR VALORES BOOLEANOS
		

		/*
		 * Si (esto es verdadero)
		 * ejecuta este bloque de código
		 *} si no / de otro modo {
		 *ejecuta este otro bloque de código
		 */
		
		int x= 10;
		
		if (x<10) {
			System.out.println("Cierto");
		
		}else {
			System.out.println("Falso");
		}	
		
//String evalúa = x<10?"Cierto":Falso;
//System.out.println(evalua);
		
		//Evaluar condiciones compuestas con operadores lógicos
		//And, Or, Not, diferente de, igualdad
		
		//And, && - Devuelve el primer bloque (true) cuando TODAS las condiciones se cumplan
		System.out.println("Probando Operador AND &&");
		
		if (x<10 && x>5) {
		System.out.println("Cierto");
	} else {
		System.out.println("Falso");
	}
	
	//OR || - Devuelve el primer bloque (true) cuando se cumpla al menos una condición
	System.out.println("Probando Operador AND &&");
	
	if (x<10 || x>5) {
	System.out.println("Cierto");
} else {
	System.out.println("Falso");
}

//NOT - ! - Niega una condicion o cambia su valor de true a false y viceversa

if (!(x<10)) {
System.out.println("Cierto");
} else {
System.out.println("Falso");
}

//IGUALDAD - == - Compara los valores entre si y si son iguales devuelve true
//Este operador de igualdad es recomendable más en valores numéricos enteros primitivos
//Y el método .equals en valores de cadena de texto

if (x==11) {
System.out.println("Cierto");
} else {
System.out.println("Falso");
}


//DIFERENTE DE - != - Devuelve true cuando los valores a comparar son diferentes uno de otro
System.out.println("probando operador DIFERENTE DE !=");

if (x!=11) { 
System.out.println("Cierto");
} else {
System.out.println("Falso");
}


//ESTRUCTURA IF ELSE ANIDADA

//EJEMPLO, UN JUEGO DE PIEDRA PAPEL O TIJERA}
System.out.println("Juego PIEDRA, PAPEL, TIJERA");

String game = "PIEDRA";

if (game.equals("PIEDRA")) {
	System.out.println("PAPEL");
} else if (game.equals("PAPEL")) {
System.out.println("TIJERA");
	} else if (game.equals("piedra")) {
	} else { 
		System.out.println("Error de juego");
	}

//estructura switch case - evalua el cambio de una variable y nos permite ejecutar
//varias opciones segun sea el caso
System.out.println("probando Estructura Switch-Case");
switch (game) {
case "PIEDRA":
	System.out.println("PAPEL");
	break;
case "PAPEL":
	System.out.println("TIJERA");
	break;
case "TIJERA":
System.out.println("PIEDRA");
break;
default:
System.out.println("error del juego");

	break;
}
	

	}
	}
