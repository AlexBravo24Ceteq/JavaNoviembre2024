package com;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Los arrays tambien conocidos como arreglos o vectores son estructuras
		 * que permiten almacenar un conjunto de datos de un tipo en comun 
		 * ejemplo numeros enteros, caracteres, decimales, etc
		 * 
		 * Los datos se almacenan en una fila en una tabla 
		 * {}{}{}{}{}{}{}
		 * 
		 * la desventaja de los array es qeue estos nop pueden crecer en tiempo
		 * de ejecucion una vez declarado el tamaño 
		 */
		
		//m ejemplo declaramos un Array de numeros enteros 
		
		int [] numeros = new int[6]; // un array declarado con su tamaño 
		
		// Ahora procedemos a giuardar valores en cada una de las posiciones del Arrauy
		
		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		numeros[3] = 13;
		numeros[4] = 14;
		
		//Si queremos utiliozar determinada posicion para darle salida o algun fin 
		// llamamos a dicha posicion
		
		//ejemplo imprimior en consola la posicion 4
		
		System.out.println(numeros[4]);
		
		//ejemplo 2 sumar valores de mi array entre si 
		
		int suma = numeros[4] + numeros [0];
		System.out.println(suma);
		
		//desventajas no pueden crecer en tiempo de ejecucion
		// si declaro una posicion mas no marca error	
		numeros [5] = 15; // aqui ya estamos intentado guardar un sexto numero
		
		System.out.println(numeros[5]);
		
		// otra forma de llenar un array con los valores ya asignados desde la 
		//declaracion del array
		
		char [] nombre = {'A','B','I','M','A','E','L'};
		
		int [] numeros2 = {10,11,12,13,14,15};
		
		//Recorrer o imprimir todos los valores de un array en consola
		
		// En el caso de los caracteres puedo mandar a imprimir el arreglo
		
		System.out.println(nombre);
		
		// pero no ocurre lo mismo con otros arreglos
		// podemos utilizar un ciclo para imprimir cada valor
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//for each - imprime cada uno de los elementos contenidos en el array
		//deacurdo a su tipo
		
		for (int i:numeros2) {
			System.out.println(i);
		}
	}

}
