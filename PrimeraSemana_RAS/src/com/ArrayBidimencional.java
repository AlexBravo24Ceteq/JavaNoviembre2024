package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//El array de dos dimenciones se puede implementar como array dentro de otro
		//pero en realidad pasamos de un concepto de fila y columna 
		//y los valores se almacenan  llamando a ambas posisciones
		//Tambien tienen el nombre de matriz
		
		//ejemplo Declarar un array de dos dimenciones con su tamaño iniciado
		
		int [][] matriz = new int [3][3];
		
		//Ejemplo de llenado 
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3; //[1][2][3]
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;	//[4][5][6]
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;	//[7][8][9]
		
		//Otra forma de declarar un Array de dos dimenciones ya con valores declarados desde un uinicio
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Recorrer e imprimir en consola un array de dos dimenciones
		
		System.out.println(matriz2[2][2]);

		System.out.println("Imprimiendo los valores de mi matriz2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
		
		//Exixte una variable llamada var, que nos permite almacenar cualquier tipo de dato
		//pero tiene que estar declarada y asignada desde un inicio
		
		var nombre = "Alex";
		var numero =10;
		var letra ='x';
		
		//var [] arrayVariado= {1,'d',"alex"};
		//var [] arrayVariado= {1,2,5};
		
		
		
		Object [] variado = {1,3.21,'a',"hola"};
		
	}

}
