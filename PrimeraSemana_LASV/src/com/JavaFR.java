package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// lectrura de archivos mediante la clase File, FileReader y BufferdRider
		
		//declaramos un string donde poder guardar la linea o lienas
		//que vamos a leer de nuestro archivo
		
		String linea;
		
		//utilizamos una estrucutra try and catch para ller o intentar leer el archivo,
		//sino se puede ller por alguna razon ejecutamos alguna otra cosa pero atramos la excepcio
		
		try {//intentamos ller el archivo ejecutando lo sig
			//traemos a la clase File para crear una variable donde almacenemos  la ruta
			// donde se encuentra el archivo
			
			File archivo = new File("C:\\Users\\luiss\\Desktop\\fichero.txt");
			// Ahora necesitamos poder abrir el archivo en modo de lectura
			FileReader lector = new FileReader(archivo);// le pasamos el valor del archivo
			//ahora necesitamos leer el contenido o cargarlo desde lado de un objeto
			//que nos permita leerlo y es de la clase bufferedReader
			BufferedReader buffer = new BufferedReader(lector);
			
			//traemos lo que se lee del archivo a nuestro String aqui
			
			//linea = buffer.readLine();
			
			//.readLine solo es capas de leer  una linea a la vezm si queremos leer mas de una
			//agregamos en un ciclo para recuperar las sig
			
			while((linea = buffer.readLine()) !=null) {//mientras readLine tenga libeas por leer
				
				System.out.println(linea);
				
			}
					
					//una ves que lo tengamos aqui lo mandamos a imprimir en consola
					//System.out.println(linea);
					
					
;		} catch (Exception e) {//en caso de que no se pueda leer el archivo 
	// se atrapa una excepcion y ejecutamos lo sig
	
	System.out.println("no se puede leer el archivo");
		 	e.printStackTrace();//esto imprime nuevamente el error o excepcion en consola
		}

	}

}
