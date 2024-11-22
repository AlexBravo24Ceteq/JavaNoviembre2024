package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		
		//Uso de las clases File y FileWriter para escribir contenido en un archivo
		
		//Podemos utilizar en un Strin "\n" para indicar un salto de línea en la escritura
		String nombre = "\nAlejandro Dionicio Sánchez Cástulo\n Hola Baco";
		
		//Intentamos lo siguiente:
		try {
			File archivo = new File("C:\\Users\\ALEX\\OneDrive\\Escritorio\\fichero.txt");
			//Traemos a la clase FileWriter para poder escribir en el archivo de prueba
			FileWriter writer = new FileWriter(archivo, true); //FileWriter puede abrir el archivo
			//y lo prepara para sobreescribirlo
			//Si queremos que se respete el contenido previo del archivo, dejamos un valor true en los argumentos
			
			//Escribimos lo que tenemos guardado en la variable "nombre" en nuestro archivo fichero.txt
			writer.write(nombre); //esta línea escribe en el block de notas pero no guarda los cambios
			//confirmamos la escritura del archivo con la siguiente línea:
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
		}

	}

}
