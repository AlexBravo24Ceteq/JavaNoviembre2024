package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWriter para escribir contenido
		//en un archivo
		
		//Podemos utilizar en un string \n para indicar un salto de linea en la escritura
		String nombre = "\nJohnatan Andre Rendon Gutierrez\n Hola michi otra vez";
				
		try {
			File archivo=new File("D:\\escritorio\\HolaMichi.txt"); 	
			
			//Traemos a la clase FileWriter para poder escribir en el archivo de prueba
			FileWriter writer = new FileWriter(archivo, true); //FileWriter puede abrir el archivo y lo prepara para Sobreescribirlo
			
			
			//Si queremos que se respete el contenido del archivo, dejamos un valor true en los
			//argumentos
			
			//Escribimos lo que tenemos guardado en la variable nombre 
			//en nuestro archivo HolaMichi.txt
			
			writer.write(nombre);
			
			//Confirmamos la estructura del archivo con la siguiente linea
			writer.close();
			
			
			//SE VA A REEMPLAZAR LA INFORMACION ANTERIOR 
			
		} catch (Exception e) {
			System.out.println("No se puede encontrar el archivo");
			
		}
				
				

	}

}
