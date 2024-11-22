package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de dos dimensiones. Se puede interpretar como un array dentro
		//de otro, pero la realieae es que pasamos de un concepto de fila
		//a uno de "tabla" para poder almacenar valores
		//Y los valores se almacenan llamando a ambas posiciones de un array
		//Una posición nos da el valor en la fila y la otra el valor en
		//la columna
		//Los aarays tambien son conocidos como matrices
		
		//Ej. declarar un array de dos dimensiones con su tamaño iniciado
		
		int [] [] matriz= new int [3][3];
		
		//Ejemplo de llenado de array de dos dimensiones
		
		matriz [0][0]=1;
		matriz [0][1]=2; //[1][2][3]
		matriz [0][2]=3;
		
		matriz [1][0]=4;
		matriz [1][1]=5;//[4][5][6]
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;//[7][8][9]
		matriz [2][2]=9;
		
		
		//Otra forma de declarar un array de dos dimensiones ya con sus valores
		//asignados desde un inicio
		
		int [] [] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Recorrer o imprimir en consola los valores de un array de dos dimensiones
		
		System.out.println("Imprimiendo los valores de mi matriz2");
		
		for (int i = 0; i < 3; i++) {		//Podríamos usar matriz.length para ya no tener que cambiar el ciclo 
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+" ");
				
				
			}
			System.out.println();
			
		}
		
		
	}

}
