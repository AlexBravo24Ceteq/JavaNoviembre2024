package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Matrices time
		
		
		int [][] matriz = new int [3][3]; // [fila] [columna]
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3; // and so on and so on and so on
		
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9;
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}}; //otra forma 
		
		System.out.println(matriz[2][2]);
		
		for (int i = 0; i <3; i++) { //también puedes usar matriz.length
			for (int j = 0; j < 3; j++) { // matriz[i].length
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
		
		//Una nueva wea llamada "var" que guarda cualquier tipo de dato, pero tiene que declararse ahí mismo
		var nombre = "Alex";
		var numero = 10;
		var letra = 'X';
		
		//Si te pregunta si se puede crear un array de más de un tipo de dato.
		//Si? Con trampas. Con un tipo "Object". No es un array per se. 
		
		Object[] variado = {1 , 3.1416 , "Alex" ,'A' ,true};
	}
	
}
