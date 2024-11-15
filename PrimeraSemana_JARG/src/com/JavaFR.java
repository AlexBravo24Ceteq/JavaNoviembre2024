package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Lectura de archivos mediante las clases File, FileReader
		//y BufferedReader
		
		
		//Declaramos un string dpnde poder guardar la linea o lineas 
		//que vamos a leer de nuestro archivo
		
		String linea;
		
		//Utilizamos una estructura try and catch para leer o intentar leer
		//el archivo, si no se puede leer por alguna razon ejecutamos algunas
		//otra cosa pero atrapamos la excepcion
		
		
		try { //Intentamos leer el archivo ejecutando lo siguiente
			//Traemos a la clase File para crear una variable donde almacenemos 
			//La ruta donde se encuentra el archivo
			File archivo=new File("D:\\escritorio\\HolaMichi.txt"); 						//Ubica el archivo
			//Ahora necesitamos poder abrir el archivo en modo de lectura
			FileReader lector=new FileReader(archivo);//Le pasamos el valor de archivo 		//abre el archivo
			/*/Ahora necesitamos leer el contenido de este lado con un objeto
			 * que nos permita leerlo y que es de la clase BufferedReader
			 * 
			 */
			BufferedReader buffer= new BufferedReader(lector);								//Lee el archivo
				
			//Para leerlo traemos lo que se lee del archivo a nuestro String aquí
			
			//linea=buffer.readLine();
			
			//.readLine() sólo es capaz de leer una línea a la vez, siq ueremos leer más de una
			//la agregamos en un ciclo para recuperar las siguientes
			
			while((linea=buffer.readLine())!=null) { //mientras readLine tenga lineas por recuperar
				System.out.println(linea);
			
			//Una vez que lo tenemos aquí lo mandamos a imprimir a consola
			//System.out.println(linea);
			}
		
			} catch (Exception e) { //En caso e que no se pueda leer el archivo
			// se atrapa una excepcion y ejecutamos lo siguiente
				System.out.println("No se puede leer el archivo");
				//Si tuviera la necesidad de ver el error o excepcion en consola, lo llamo a través
				//del objeto e donde se atrapó
		e.printStackTrace();//Esto imprime el error o excepcion en consola
		
			}
	}

}
