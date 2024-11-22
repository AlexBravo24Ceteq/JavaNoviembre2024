package com;

public class Arrays {

	public static void main(String[] args) {

		
		/* los arrays o vectores son estructuras que nos permiten almacenar un conjunto de datos de un tipo en comun
		 * 
		 * ejemplo
		 * un conjunto de numeros enteros, caracteres, decimales, etc.
		 * 
		 * los datos se almacenan en una fila de una tabla
		 * 
		 * desventajas
		 * 
		 * es que estos no pueden crecer en tiempo de ejecución una vez declarado el tamaño
		 * 
		 * Ej. Declaramos un array de num enteros
		 * 
		 */
		
		int [] numeros = new int[5];// ejemplo array declarado con su tamaño
		
		//procedemos a guardar valores en cada una de las pociciones del array
		
		numeros[0] =10;
		numeros[1] =11;
		numeros[2] =12;
		numeros[3] =13;
		numeros[4] =14;
		
		// si queremos llamar determinada posicion ya sea para darle salida a algun fin llamamos a dicha posicion
		
		System.out.println(numeros[4]);
		
		// puedo sumar numeros
		int suma =numeros[4] + numeros[0];
		
		System.out.println(suma);
		// Desvantajas de los arrays no pueden crecer en tiempo de ejecucion  y si declaro una posicion mas marca error.
		
		
		// otra forma de llenar un array con los valores ya asignados desde la declaracion array
		
		char[] nombre = {'A','l','e','x'};
		
		int [] numeros2 = {10,11,12,13,14,15};
		
		// Recorrer o imprimir todos los valores de un array en consola
		
		// en el caso de los caracteres puedo mandar a imprimir el array directamente
		
		System.out.println(nombre);
		
		System.out.println(numeros2);
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
			
			
		}
		
		
		// for each- imprime cada uno de los elementos en el array deacuerdo a su tipo de dato
	
		for (int i : numeros2) {
			System.out.println(i);  // cada numero contenidop se manda a imprimir
			
			
		}
		
	}

}
