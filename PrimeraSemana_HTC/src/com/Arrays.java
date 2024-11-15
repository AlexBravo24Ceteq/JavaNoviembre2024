package com;

public class Arrays {

	public static void main(String[] args) {
		// Arreglo o vector. Guardan conjuntos de datos de un tipo en común.
		// Conjuntos de números, caracteres, decimales, etc.
		// Estáticos. No crecen si ya fueron declarados.
		
		//Así se declara
		int [] numeros = new int [5];//ahi esta el tamaño.Este lo deja abierto.
		char [] nombre =  {'A','l','e','x'}; // Ahi guardé todo y lo declaré en la misma línea.
		int [] numeros2 = {10,11,12,13,14,15};
		
		
		numeros [0] = 10; //Ahi guarde el 10 en la primera posición. (0)
		numeros [1] = 11;
		numeros [2] = 12;
		numeros [3] = 13;
		numeros [4] = 14;
		
		System.out.println(numeros[4]); //ahi llame al valor en la quinta posición.
		System.out.println(numeros[4]+numeros[0]); //mira papu operaciones. Esto pudo ser otra variable pero bueh.
		
		System.out.println(nombre); // caracteres se imprime bien
		System.out.println(numeros2); // numeros en un arreglo, mas bien te regresa su posición en memoria
		
		for (int i = 0; i < numeros2.length; i++) { //hay que mandarlo a imprimir a manita en todo caso.
			System.out.println(numeros2[i]);
		}
		
		//Nuevo Ciclo. For each.
		for (int i:numeros2) { //Aqui dice por cada elemento "in" en el array numeros2...
			System.out.println(i); // haz esto.
		}
		
	}

}
