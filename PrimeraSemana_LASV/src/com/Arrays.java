package com;

public class Arrays {

	public static void main(String[] args) {
		/* Los arrays, tambien conocidos como arreglos o vectores
		 * son estructutras que nos permiten almacenar un conjunto de datos
		 * de un tipo en comin.
		 * ej. un conjunto de numeros enteros, de caracteres, decimales, ect
		 * 
		 * Los datos se almacenan en una fila de una tabla
		 * [][][][][][][][]
		 * 
		 * La desventaja de los arrays es que estos no pueden crecer en tiempo 
		 * de ejecucion una vez declarado su tamaño
		*/
		
		//ej/ declaramos un array de numeros enteros
		
		int []numeros = new int[6];// un array declarado con su tamaño
		//ahora procedemos a guardar valores en cada una de las posiciones del array
		
		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		numeros[3] = 13;
		numeros[4] = 14;
		
		//si queremos utilizar determinada posicion yya sea para darle salida o algun fin
		// llamamos a dicha posicion
		
		//ej. imprimir en consola el numero contenido en la posicion 4
		
		System.out.println(numeros[4]);
		
		//ej.2 puedo sumar valores de mi array entre si
		
		int suma = numeros[4] + numeros[0];
		System.out.println(suma);
		// desventaja, no puede crecer en tiempod e ejecucion y si declaruna posicion mas
		// no marca error
		
		numeros[5] = 15; //zzqui estamos intentando cuargar un sexto num
		System.out.println(numeros[5]);
		
		//otra forma de llenar un array con los valos ya asignados desde la declaracion del array
		char []nombre = {'A','l','e','x'};
		
		int [] numeros2 = {10, 11, 12, 13, 14};
		
		//recorrer o imprimir todos los valores de un array en consola
		//en el caso de los caracteres, puedo mandar a imprimier el arrayy directamento
		System.out.println(nombre);
		
		//pero no ocurre lo mismo con otro tipo de arrays, ej. numeros
		System.out.println(numeros2);
		//podemos utilizar un ciclo para imprimir vada valor en consola
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
			
			//for eacch - imprime cada uno de los elementos conternidos en el array de acuerdo a su tipo de dato
			for (int i1 : numeros2) {
				System.out.println(i1);
				
			}
			
		}
		
	}

}
