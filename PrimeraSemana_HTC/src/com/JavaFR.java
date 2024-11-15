package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		//Lectura de archivos mediante File, FileReader y Buffered Reader
		
		String extracted;
		
		//Vamos a usar try and catch. En caso de que esta madre de errores. Muy util para cosas externas.
		
		try { //intentar leer archivo
			
			File archivo = new File("C:\\Users\\CINCO\\Desktop\\fichero.txt");// dos diagonales para el formato de esto. Encuentra la caja
			FileReader lector = new FileReader(archivo); //Aqui le doy el valor de "archivo", que es lo que va a leer. Lo abre.Abre la caja
			BufferedReader buffer = new BufferedReader(lector); //Aqui lo cargo para leerlo. Saca cosas de la caja.
			
			//extracted = buffer.readLine(); //Aquí mando a traer la linea en el buffer
			//.readLine() solo lee una línea. Usemos un ciclo para leerlo todo.
			
			while((extracted = buffer.readLine())!= null) { //aqui solo reemplazamos constantemente extracted conforme explora el documento. No estamos guardando nada mas que el ultimo valor y lo imprimimos
				System.out.println(extracted);
			}
			
			//System.out.println(extracted);
			
		} catch (Exception e){ //si no se puede leer
			System.out.println("No se puede leer el archivo.");
			//si me urge ver el erro tho
			//lo traigo através del "e" que donde se atrapó.
			e.printStackTrace();//esto imprime el error.
		}
		

	}

}
