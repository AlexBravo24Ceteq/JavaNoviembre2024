package com;

public class ArrayyBidimiensionall {

	public static void main(String[] args) {
		// Array de dos dimensiones. Se puede interpretar como un arrayy dentro de otro
		//pero la realidad es que apsamos de un concepto de fila a uno de "tabla" para
		//poder almacenar valores y los valores se almacenan llamando a ambas posiciones
		//de un array/ una posicion nos da el valo en la fila y la otra el valor en la columna
		//los arrays tambien son conocidos como matrices.		
		
		//ej. declarar un array de dos dimensiones con su tama;o iniciado
		
		int [] [] matriz = new int [3][3];
				
				// ej. de llenado de un array de dos dimensiones
				
				matriz [0][0] = 1;
				matriz [0][1] = 2;
				matriz [0][2] = 3;
				
				matriz [1][0] = 4;
				matriz [1][1] = 5;
				matriz [1][2] = 6;
				
				matriz [2][0] = 7;
				matriz [2][1] = 8;
				matriz [2][2] = 9;
				
				
				// otra forma de declarar un array de dos dimensiones ya con sus valores
				//asignados desde un inicio 
				
				
				int[][] matriz2 = {{1,2,3,11},{4,5,6,12},{7,8,9,13}};
				
				// recorrer o imprimir en consola los valores de un array de doss dimensiones
				
				System.out.println(matriz2[2][2]);
				System.out.println("imprimiendo los valores de mi matriz2");
				//este primer ciclo recorre la longitud de la primera dimension
				for (int i = 0; i < matriz2.length; i++) {//podemos dejar el valr fijo (3) si nuestra matriz no aumenta
					//este ciclo interno recorre la longitud de la segunda dimension
					for (int j = 0; j < matriz2[i].length; j++) {//podemos dejar valor fijo (4) no aumenta su tamaño
						System.out.print(matriz2[i][j] + " ");
						
					}
					System.out.println();
					
				}
				
				
				//exite una variable llamada var, que nos permite almacenar cualquier tipo de dato pero
				//tiene que estar declarada yy asignada desde un inicio
				
				var nombre = "Alex";
				var numero = 10;
				var letra = "x";
				
				//var [] arrayVariado = {1,'a',"alex"};
				
				//puedo crear un array que pueda almacenar mas de un tipo de dato?
				//es decir, que pueda guardar valores enteros, nombres, decimales, booleanos, etc
				// la respuesta seria si, pero atraves de guardar datos de tipo Object
				//pero en realidad se guardan como dato tipo Object
				
				
				Object [] variado = {1, 3.11416, "Alex", true};
					

	}

}
