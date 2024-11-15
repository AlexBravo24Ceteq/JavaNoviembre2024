package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Lectura de archivos mediente las clases Flile, FlileReader y BufferReader
		
		
		//Declaramos un string donde poder giardarla line o lineas de el archivo
		
		String linea;
		// se sujiere agregar try and catch
		
		//utilizamos una estructura try and catch para intentar leer el archivo
		// si el archivo no se puede leer por alguna razon se ejecuta otra cosa pero se atrapa la excepcion
		
		try {// intentamos leer el archivo ejecutando lo siguiente
			
			//Traemos a la clase file para crearuna variable donde almacenemos la ruta donde se encuentra el archivo
			
			File archivo = new File("C:\\Users\\David Andrade\\Desktop\\fichero.txt");
			//Ahora necesitamos abrir el archivo en modo lectura
			// clase ---variable-= new ---clase (ruta de archivo)
			FileReader lector= new FileReader(archivo);// le pasamos el valor de archivo
			
			//Ahora necesitamos cargar el contenido  con un objeto que nos permita leerlo
			BufferedReader buffer = new BufferedReader(lector);
			
			//Para leerlo traemos lo que se lee del archivo al string
			
			
			//este solo lee una linea a la vez
			//linea = buffer.readLine();
			//una vez aqui mandamos impresion a consola
			
			//System.out.println(linea);
			// si queremos leer mas de una en un ciclo recuperamos las siguientes
			
		while ((linea=buffer.readLine())!= null) { 
				System.out.println(linea);
			}
			
		
			
			
		} catch (Exception e) {// En caso que no se pueda leer el archivo se areapa una excepcion que diga que no se puede leer el archivo
			
			System.out.println("No se puede leer el archivo");
			// TODO: handle exception
			
			//Si tuviera la necesidad de ver el error o excepcion en consola lo llamo a travez del objeto en donde se atrapo
			
			e.printStackTrace();// esto imprime el error o excepcion en consola
			
			
		}

		
		
		
		
		
		
		
	}

}
