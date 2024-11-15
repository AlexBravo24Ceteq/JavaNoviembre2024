package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array de dos dimensiones se puede interpretar con un array dentro
		//de otro, pero la relaidad es que pasamos de un concepto de fila a 
		//uno de TABLA para poder almacenar valores
		
		//los valores se almacenan llamando a ambas posisicones de un array, una posición nos da el valor
		//en la fila y la otra el valor en la columna
//		los arrays tambien son conocidos como matrices 
//		
//		ejemplo. declarar un array de dos dimensiones con su tamaño iniciado
		
		int[] [] matriz = new int [3] [3];
		
		//ejemplo de lllenado de un array de dos dimensiones 
		
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3; //[1] [2] [3]
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;// [4] [5] [6]
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9; // [7] [8] [9]
		
//		Otra forma de declarar un array de dos dimensiones ya con sus valores asignados desde
//		un inicio
		
		int[] [] matriz2= {{1,2,3}, {4,5,6} , {7,8,9}};
		
		//Recorre o imprimir en consola un array de dos dimensiones 
		
		System.out.println(matriz2[2][2]);
		
		System.out.println("imprimiendo los valores de mi matriz2");
		for (int i = 0; i < matriz2.length; i++) {   // o en este caso puede ser i<3
			// Este ciclo recorre la longitud de la segunda dimesión
			for (int j = 0; j < matriz2[i].length; j++) {
//				//System.out.println(matriz2[i][j]);
				System.out.print(matriz2[i][j]+ " "); //los veriamos en una sola fila 
			}
			System.out.println(); //esto dentro del primer ciclo para declarara un salto
		}
	
		//EXISTE UNA BARIABLE var, que nos permite almacenar cualquier tipo de dat
		//titne que estar declarada y asignada desde un inicio
		
		var nombre = "michi";
		var numero = 10 ;
		var letra = "X";
		
	 
		//Puedo crear un array que pueda almacenar mas de un tipo de dato?	no
		// la respuesta sera SI, pero a traves de guardar datos tipo Object
		// pero se guardancomo tipo de dato object
		Object [] variado = {1, 3.1416, "A", true};
	}

}
