package com;

public class Arrays {

	public static void main(String[] args) {
		/* Los arrays, también conocidos como arreglos o vectores
		 * son estructuras que nos permiten almacenar un conjunto de datos
		 * de un tipo en común.
		 * Ej. un conjunto de numeros enteros, de caracteres,decimales etc
		 * 
		 * Los datos, pensemoslo así se almacenan en una fila de una tabla
		 * [][][][]
		 * la desventaja de los arrays es que estos no pueden crecer en tiempo de ejecución
		 * una vez declarado su tamaño.
		 */
		
		//Ejemplo. declaramos un array de números enteros.
		
		int[] numeros= new int[5];//un array declarado con su tamaño
		
		//ahora procedemos a guardar valores en cada una de las posiciones del array
		numeros[0]=10;
		numeros[1]=11;
		numeros[2]=12;
		numeros[3]=13;
		numeros[4]=14;
		System.out.println(numeros[4]);
		
		//Ej. 2 puedo sumar valores de mis arrays entre si
		int suma= numeros[3]+numeros[1];
		System.out.println(suma);
		
		//DESVENTAJA no pueden crecer en tiempo de ejecución y si declaro una posicion
		//más no marca el error
		//numeros [5]=15; aqui ya estamos intentando agregar un sexto número
		
		//otra forma de llenar un array
		char []nombre= {'a','l','e','x'};
		int [] numeros2= {10,11,12,13,14,15};
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		for (int i:numeros2) {
			System.out.println(i);
		}
		
		
		
	}

}
