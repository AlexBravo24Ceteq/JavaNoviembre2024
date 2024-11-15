package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//los arrys de dos dimeniones son conocidos tambien como matriz
		// declarr un array de dos dimenssiones
		
		int [][] matriz = new int[3][3];
		
		//ejemplo de llenado de matriz
		
		//primer fila [1][2][3]
		matriz[0][0]= 1;
		matriz[0][1]= 2;
		matriz[0][2]= 2;
		//segund fila [4][5][6]
		matriz[1][0]= 4;
		matriz[1][1]= 5;
		matriz[1][2]= 6;
		//tercer fila  [][8][9]
		matriz[2][0]= 7;
		matriz[2][1]= 8;
		matriz[2][2]= 9;
		
		//otro ejemplo de llenado
		
		int[][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//recorrer o imprimir en consola
		
		//System.out.println(matriz2[2][2]);
		
		System.out.print("imprimiendo la matriz");
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println("");
			for (int j = 0; j < matriz2[i].length; j++) {

				System.out.print(" [" + matriz2[i][j] + "] ");
			}
			
		}
		

	}

}
