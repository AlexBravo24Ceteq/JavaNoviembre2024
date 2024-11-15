package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// uso de las flases File y FileWriter para escribir contenido 
		//en un archivo
		//[pde,ps itilizar en un string \n para indicar un salto de linea en la escritura
		String nombre = "\nLuis Alberto Solis Veronica \nHola Adri \nLOL";
		
		//intentamos lo sig;
		
		try {
			
			File archivo = new File("C:\\Users\\luiss\\Desktop\\fichero.txt");
			//traemos a la clase FileWriteer para pode rescribir en el archivo
			
			FileWriter writer = new FileWriter(archivo, true);//FileWriter puede abrir
			//el archivo y lo prepara para sobre escribirlo
			//si queremos que se respete el contenido del archivo, dejamos un valor true en los 
			//argumentos
			
			//escribimos lo que tenemos guardado en la variable nombre
			//en nuestro archivo fichecro.txt
			writer.write(nombre);
			
			//confirmamos la escritura del archivo en la sig linea
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("no se puede encontrar el archivo");
		}

	}

}
