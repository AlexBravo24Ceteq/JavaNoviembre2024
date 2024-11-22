package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Rodolfo Avila Sanchez \n";
		
		try {
			File archivo = new File("C:\\Users\\ravila\\Desktop\\fichero.txt");
			//Traemos a la classe FileReader
			FileWriter writer = new FileWriter(archivo, true);
			
			writer.write(nombre);
			
			//Confirma o guarda la escritura
			writer.close();
			
			System.out.println(nombre);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
