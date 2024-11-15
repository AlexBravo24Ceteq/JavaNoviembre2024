package com;

public class ArrayDosDimensiones {

	public static void main(String[] args) {

		// Array de dos dimensiones se puede interpretar como un array dentro de otro
		// pero en realidad es que pasamos de un concepto de fila
		// a uno de "tabla" para poder almacenar valores
		// y los valores se almacenan llamando a ambas posiciones de un array
		// una posición nos da el valor en la fila y la otra el valor en la columna.
		// Los Arrays también son conocidos como matrices.

		// Ej. declarar un array de dos dimensiones con su tamaño iniciado

		int[][] matriz = new int[3][3];

		// Ej. de llenado de un array de dos dimensiones

		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3; // [1][2][3]

		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6; // [4][5][6]

		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9; // [7][8][9]

		// Otra forma de declarar un array de dos dimensiones ya con sus
		// valores asignados desde un inicio

		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Recorrer o imprimir en consola los valores de un array de dos dimensiones

		System.out.println(matriz2[2][2]);

		System.out.println("Imrimiendo los valores de mi matriz2");
		//Este primer ciclo recorre la longitud de la primera dimensión
		for (int i = 0; i < 3; i++) { //Podemos dejar el valor fijo (3) si nuestra matriz no aumenta
			//Este ciclo interno recorre la longitud de la segunda dimensión
			for (int j = 0; j < 3; j++) { //Podemos dejar valor fijo de la dimensión si no aumenta su tamaño o lo modificamos (4)
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
		// Existe una variable llamada var, que nos permite almacenar cualquier tipo de dato
		//pero tiene que estar declarada y asignada desde un inicio
		
		var nombre = "Alex";
		var numero = 10;
		var letra = 'X';
		
		//var [] arrayVariado = {1,'A',"Alex"};
		
		//¿Puedo crear un array que pueda almacenar más de un tipo de dato
		//es decir, que pueda guardar valores enteros, nombres, decimales, booleanos, etc.?
		//La respuesta sería "SÍ", pero a través de guardar datos de tipo Object
		//Pero en realidad se guardan como tipo de dato Object
		
		Object [] variado = {1,3.1416,"Alex",'A', true};
		
	}

}
