package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Lectura de archivos mediante las clases "File", "FileReader" y "BufferReader"
		
		//Declaramos un String donde poder guardar la línea o líneas 
		//que vamos a leer de nuestro archivo
		
		String linea;
		
		//Utilizamos una estructura "try and catch" para leer o intentar leer 
		//el archivo, si no se puede leer por alguna razón, ejecutamos
		//alguna otra cosa pero atrapamos la excepción

		try { //intentamos leer el archivo ejecutando lo siguiente
			//Traemos a la clase File para crear una variable donde almacenamos
			//la ruta donde se encuentra el archivo
			File archivo = new File("C:\\Users\\ALEX\\OneDrive\\Escritorio\\fichero.txt");		
			//Ahora necesitamos poder abrir el archivo en modo de lectura y eso lo hace FileReader
			FileReader lector = new FileReader(archivo); //le pasamos el valor de archivo
			//Ahora necesitamos leer el contenido o cargarlo de este lado con un objeto
			//que nos permita leerlo y que es de la clase BufferedReader
			
			BufferedReader buffer = new BufferedReader(lector);
			
			//Traemos lo que se lee del archivo a nuestro String aquí
			
			//linea = buffer.readLine(); 
			
			//.readLine() sólo es capaz de leer una línea a la vez, si queremos leer más de una
			//la agregamnos en un ciclo para recupara las siguientes
			
			while((linea = buffer.readLine()) != null) { // mientras readLine tenga lineas por recuperar
				System.out.println(linea);
			}
			
			
			//una vez que lo tenemos aquí, lo mandamos a imprimir en consola
			//System.out.println(linea);
			
		} catch (Exception e) { //En caso de que no se pueda leer el archivo 
			//se atrapa una excepción ejecutando lo siguiente
			System.out.println("No se puede leer el archivo");
			//si tuviera la necesidad de ver el error o excepción en consola, lo llamo a través
			//del objeto "e" donde se atrapó
			
			e.printStackTrace(); //esto imprime nuevamente el error o excepción en consola
		}
		
		
	}

}
