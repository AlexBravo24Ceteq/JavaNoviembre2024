package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lectura de archivos mediantes las clases File, File Reader
		// y BufferReader
		
		//Decclaramos un String para guardar la linea 
		//que vamos a leer de nuestro arcchivo
		
		String linea;
		
		//Utilizamos una estructura Try and Catch para leer o intentar leer
		//si no se puede leer por alguna razon ejecutamos alguna
		
		try {//intentamoe leer el archivo ejecutando lo siguiente
			//Traemos a la clase file para crear una variable donde almacenemos 
			//la ruta donde se encuentra el archivo
			
			
			File archivo = new File("C:\\Users\\ravila\\Desktop\\fichero.txt");
			//Ahora necesitamos abrir el archivo enmmodo de lectura 
			
			FileReader lector = new FileReader(archivo);// le pasamos el valor de archivo
			//Ahora necesitamos leer el contenido o cargarlo de este lado
			
			BufferedReader buffer = new BufferedReader(lector);
			
			//linea = buffer.readLine();
			
			//System.out.println(linea);
			
			//.readLine() solo es capaz de leer una linea a la vez, si queremos leer mas
			
			while((linea = buffer.readLine())!= null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se pudo leer el archivo");
			//Si tuviera la necesidad de ver el error o excepcion en consola
			//lo llamo a traves del objeto e donde se atrapo
			
			e.printStackTrace();// esto imprime  nuevamnete
		}
		
	}

}
