package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* En este caso el array de 2 dimensiones se pude interpretar como la creacion de una tabla para almacenar valores
		 * y los valores se almacenan llamando a ambas posiciones de un array
		 * una nos da valor en la fila y otro en la columna
		 * 
		 * 
		 * ej declarar un array de dos dimensiones con su vlor declarado
		 *  LOS ARRAYS TAMBIEN SON CONOCIDIOS COMO MATRICES
		 */
		
		int[] [] matriz = new int [3] [3];
		
		// ejempplo de llenado de un arrau de 2 dim
		
		// asi se declaran las FILAS
		// ejemplo prim fila
		
		matriz [0] [0] = 1;            //[1] [2] [3]
		matriz [0] [1] = 2;            //[ ] [ ] [ ]
		matriz [0] [2] = 3;            //[ ] [ ] [ ]
		
		// asi se declaran las FILAS
				// ejemplo seg fila
		
		matriz [1] [0] = 4;            //[1] [2] [3]
		matriz [1] [1] = 5;            //[4] [5] [6]
		matriz [1] [2] = 6;            //[ ] [ ] [ ]
		
		
		
		// asi se declaran las FILAS
		// ejemplo seg fila

		matriz [2] [0] = 7;            //[1] [2] [3]
		matriz [2] [1] = 8;            //[4] [5] [6]
		matriz [2] [2] = 9;            //[7] [8] [9]
		
		
		
		
		// otra forma de declarar array de2 dim ya con valores asignados desde un inicio
		
		int [] [] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		// recorrer o imprimir en consola los arrays de este tipo
		
		System.out.println(matriz2 [2][2]);
		
		System.out.println("imprimiendo matriz2 con dos ciclos for");
		
		
		// recorre la primera dimension
		for (int i = 0; i < matriz2.length; i++) {
			
			// recorre la longitud de la segunda dimension
			for (int j = 0; j < matriz2[i].length; j++) {
				
				
				//System.out.println(matriz2[i][j]);
				
				
				// si quitamos el il de print s eimprime en una sola linea
				
				System.out.print(matriz2[i][j]+ " ");
				
				
			}// fin de for anidado
			
			//si al final del primer ciclo colocamos un espacio se puede brincar a imprimir en la siguiente fila haciendo una tabla.
			
			System.out.println();
			// fin de for
		}
		
		//Existe una variable llamada var, que nos permite guardar cualquier tipo de dato
		//pero debe estar declarada desde un inicio
		
		var nombre= "Alex";
		var numero= 10;
		var letra = "x";
		
		
		//Con var no se puede crear variables con caracteres de diferentes clases
		//var[] arrayVariado = [1,'A',"Alex"]
		// tampoco se puede ocupar en un tipo array	
		
		// puedo crear un array que pueda almacenar mas de un tipo de dato
		
		// si, pero atravez de guardar datos de tipo Object
				
		Object[] variado = {1,3.1416,"Alex",'A', true};
		
		// crea la ilucion de que s epuede guardar mas de un tpo, pero s eguardan como tipo object.
		
		
	}

}
