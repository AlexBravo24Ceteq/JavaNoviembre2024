package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Los arrays,tambien conocidos como arreglos o vectores
		 * Son estructuras que nos permiten almacenar un conjunto de datos
		 * de un tipo comun.
		 * Ej.un conjunto de numeros enteros de caracteres,decimales,etc.
		 * 
		 * los datos, se almacenan en una fila de una tabla
		 * [][][][][][]
		 * 
		 * la deventaja de los arrays es que estos no pueden crecer en tiempo de ejecución 
		 * una vez declaradoel tamaño
		 * 
		 */
		
		//EJEMPLO. declaramos un array de numeros enteros
		int [] numeros = new int [5];// un array declarando con su tamaño
		
		//Ahora procedemos a guardar valores en cada una de las posiciones del array
		
		numeros [0]= 10;
		numeros [1]= 11;
		numeros [2]= 12;
		numeros [3]= 13;
		numeros [4]= 14;
		
		//si queremos utilizar detrminada posicón para darle alida oa lgun fin
		//llamamos a dicha posición
		
		//ej. imprimir en consola el numero contenido en la posición 4 
		System.out.println(numeros [4]);
		
		//ej. 2 puedo sumar valores de mi array entre si 
		int suma= numeros[4] + numeros [0];
		System.out.println(suma);
		
		//desvnetajas de los arrays no pueden crecer en tiempos de ejecución
		//y si declaro una posición mas noi marca erros
		
		//numeros [5]=15; //ejemplo aqui ya estamos intentando guardar un sexto numero
		//ystem.out.println(numeros[5]); esto marcaria error 
		
//		otra forma de llenar un array con los valores ya asignados
//		desde la declaración del array
		
		char []nombre= {'y', 'o','n','i'}; //lo mismo que declarar un string 
		
		int []numeros2= {10,11,12,13,14,15}; 
		
		//recorrer o imprimir todos los valores de un array en consola
		//en el casso de los caracteres, puedo mandar a imprimir el array directamente
		
		System.out.println(nombre);
		
		//pero no ocurre lo mismo con otro tipo de arrays, ej.numericos
		//System.out.println(numeros2); ASI NO SE PUEDE
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//CICLO for each - imprime cada uno de los elementos contenidos en el array de acuerdo 
		//a su tipo de dato
		for (int i : numeros2) { //cada elemento contendio en numeros2
			System.out.println(i);
		}
	

	}

}
