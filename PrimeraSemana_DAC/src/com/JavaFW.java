package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases file y fileWriter para escribir contenido
		//en un archivo
		String nombre = "\nDavid Andrade Contreras\nhola ";
		try {
			
			
File archivo = new File("C:\\Users\\David Andrade\\Desktop\\fichero.txt");
			
			//Traemos a la clase FileWriter para poder escribir en el archivo de prueba
			
			FileWriter writer = new FileWriter(archivo,true);
			// File
			//writer puede abrir el archivo y escribir sobre el
			//escribimos lo que tiene guardado la variable nombre en nuestro fichero.txt
			
			// Si queremos que se repete el contenido dejamos el valor tue en los argumentos
			
			
			
			writer.write(nombre);
			
			writer.close();
			
		} catch (Exception e) {
			
			System.out.println("NO se puede guardar el archivo");
			
			
			
			// TODO: handle exception
		}

	}

}
