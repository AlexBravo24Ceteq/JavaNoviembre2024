package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		/*Array de dos dimensiones, se puede interpretar como un array dentro de otro,
		 * pero la realidad es que pasamos de un concepto de fila a uno de "tabla" para
		 * poder almacenar valores.
		 * y los valores se almacenan llamando a ambas posiciones de un array.
		 * Una posicion nos da el valor en la fila y la otra en la columna.
		 * Los arrays tambien son conocidos como MATRICES.
		 */
		//ejemplo. declarar un array de dos dimensiones con su tamaño iniciado
		
		int[][]matriz= new int [3][3];
		//llenado de un array de dos dimensiones
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;//[1][2][3]
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;//[4][5][6]
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;//[7][8][9]
		
		//otra forma de declarar un array de dos dimensiones ya con sus valores
		//asignados desde un inicio.
		int [][]matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//recorren o imprimir en consola los valores de un array de dos dimensiones
		System.out.println(matriz2 [2][2]);
		
		System.out.println("Imprimiendo los valores de mi matriz2");
		//este primer ciclo recorre la longitud de la primera dimensión
		for (int i = 0; i < 3; i++) {//podemos dejar el valor fijo (3) si nuestra
			//matriz no aumenta
			//este ciclo interno recorre la longitud de la segunda dimensión
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]);	
			}
			System.out.println();
		}
		
		//existe una variable llamada var, que nos permite almacenar cualquier tipo de dato
		//pero tiene que estar declarada y asignada desde un inicio.
		
		var nombre= "Adan";
		var numero= 10;
		var letra= 'x';
		
		/*¿puedo crear un array que pueda almacenar mas de un tipo de dato?
		 * es decir, que pueda guardar valores enteros, nombres, decimales,booleanos, etc
		 * La respuesta sería SÍ, pero a traves de guardar datos de tipo Object
		 * pero en realiadad de guardan como tipo de dato Object
		 */
			
		
		
			
		
	}

}
