package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Escribir!
		//File y FileWriter
		
		String nombre = "\nHeriberto Toxqui Cano\nQue tal chamines";
		
		try {
			
		
		File archivo = new File("C:\\Users\\CINCO\\Desktop\\fichero.txt");// dos diagonales para el formato de esto. Encuentra la caja
		FileWriter writer = new FileWriter(archivo,true); //Abre la caja para meter cosas. Necesita el archivo.
		// El booleano extra de true nos permitirá respetar lo que ya existe en el archivo. Solo hace append.
		writer.write(nombre);//writer escribirá algo. Mete cosas a la caja.
		writer.close();//writer guardará lo escrito. Cierra y salva la caja.
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
