package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de la clase File y FileWriter para escribir
		//contenido en un archivo.
		
		String nombre= "Adan Apolinar Rivera Paredes";
		try {
			File archivo= new File("C:\\Users\\Adan A\\Desktop\\fichero.txt");
			//Traemos a la clase FileWriter para poder escribir en el archivo de prueba
			FileWriter writer= new FileWriter(archivo, true);//FileWriter puede abrir el archivo
			//y lo prepara para sobreescribirlo
			//si queremos que se respete el contenido del archivo, dejamos un valor
			//true en los argumentos
			//escribimos lo que tenemos guardado en la variable nombre
			//en nuestro archivo fichero.txt
			writer.write(nombre);
			
			//confirmamos la escritura del archivo con la siguiente linea
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
