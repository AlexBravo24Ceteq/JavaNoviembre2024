package com;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * Los arrays, también conocidos como arreglos o vectores
		 * Son estructuras que nos permiten almacenar un conjunto de datos
		 * de un tipo en común
		 * Ejemplo: un conjunto de números enteros, de caracteres, de decimales, etc
		 * 
		 * Los datos, pensémoslo así, se almacenan en una fila de una table
		 * [][][][][][][][][]
		 * 
		 * La desventaja de los arrays es que en estos no pueden crecer en tiempo 
		 * de ejecución una vez declarado su tamaño
		 * 
		 */
		
		
		//Ejemplo, declaramos un array de números enteros
		
		int [] numeros=new int [6]; //Array declarado con su tamaño
		
		//Ahora procedemos a guardar valores en cada una de las posiciones del array
		
		numeros[0]=10;
		numeros[1]=11;
		numeros[2]=12;
		numeros[3]=13;
		numeros[4]=14;
		
		
		//Si queremos utilizar determinada posición, ya sea para darle salida o algún fin
		//llamamos a dicha posición
		
		//Ej. imprimir en consola el número contenido en la posición 4
		
		System.out.println(numeros[4]);
		
		
		//Ej. 2, puedo sumar valores de mi array entre si
		int suma = numeros[4]+numeros[0];
		System.out.println(suma);
		
		
		//Desventajas de los arrays, no pueden crecer en tiempo de ejecución y si declaro una posición más
		//no marca error
		numeros[5]=15;//Aqu+i ya estamos guardar un sexto número y ya habiamos puesto que el array tenía 5 posiciones
		
		System.out.println(numeros[5]);
		
		//Otra forma de llenar un array con los valores ya asignados desde la declaración del
		//array
		
		char[]nombre = {'M','i','c','h','i'}; //Lo mismo que un String nombre="Michi";
		int[]numeros2= {10,11,12,13,14,15};
		
		//Recorrer o imprimir todos los valores de un array en consola
		
		//En el caso de los caracteres puedo mandar a imprimir el array directamente
		
		System.out.println(nombre);
		
		//Pero no ocurre lo mismo con los arrays numéricos
		//Podemos utilizar un ciclo para imprimir cada valor en consola
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
			
		}
		
		//for each - imprime cada uno de los elementos contenidos en el array de acuerdo 
		//a su tipo de dato
		for (int i:numeros2) { //i: es cada elemento contenido en numero2
			System.out.println(i);
			
		}
		
	}

}
