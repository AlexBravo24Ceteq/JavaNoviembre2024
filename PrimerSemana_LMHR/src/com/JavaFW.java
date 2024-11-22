package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Uso de las clases File y Filewriter para escribir contendio en un archivo
		
		//podemos utilizar en un string \n para indicar un salto en la linea de escritura
		String nombre = "\n michi leslie\n yoni ";
		
		//intentamos lo siguiente:
		
		try {
			File archivo = new File ("C:\\Users\\USER\\Desktop\\fichero.txt");
			//traemos a la clase FileWriter para poder escribir en el archivo de prueba
			FileWriter writer = new FileWriter (archivo, true); //FileWriter puede abrir
			//el archivo y lo prepara para sobreescribirlo
			
			//si queremos que se respete el contendio del archivo, dejamos un valor true en los argumentos 
			
			//escribimos lo que tenemos guardado en la variabe nombre
			//en nuestro fichero.txt
			writer.write(nombre);
			
			//confirmamos la escritura del arcchivo con la siguiente linea
			writer.close ();
			
			
		} catch (Exception e) {
			System.out.println("no se puede encontrar el archivo");
		
		}

	}

}
