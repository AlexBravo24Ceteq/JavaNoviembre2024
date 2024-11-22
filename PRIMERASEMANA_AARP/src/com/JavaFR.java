package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// lectura de archivos mediante la clase File, FileReader,
		//y BufferedReader
		//Declaramos un String donde poder guardar la línea o líneas
		//que vamos a leer de nuestro archivo.
		
		String linea;
		
		//Usamos una estructura try and catch para leer o intentar leer
		//el archivo, si no se puede leer por alguna razón ejecutamos
		//alguna otra cosa pero atrapamos la excepción
		
		try {//intentamos leer el archivo ejecutando lo siguiente
			//traemos a la clase File para crear una variable donde almacenemos
			//la ruta donde se encuentra el archivo
			File archivo= new File("C:\\Users\\Adan A\\Desktop\\fichero.txt");
			//ahora necesitamos poder abrir el archivo en modo de lectura
			FileReader lector= new FileReader(archivo);//le pasamos el valor de archivo
			//ahora necesitamos leer el contenido o cargarlo de este lado con un objeto
			//que nos permita leerlo y que es de la clase BufferedReader
			BufferedReader buffer= new BufferedReader(lector);
			
			//Traemos lo que se lee del archivo a nuestro String aqui
			//linea=buffer.readLine();
			
			//.readLine solo escapaz de leer una linea a la vez, si queremos leer más de una
			//la agregamos en un ciclo para recuperar la siguiente
			
			while((linea=buffer.readLine())!=null) {
			System.out.println(linea);
				
			}
			
			//una vez que lo tenemos aqui lo mandamos aimprimir a la consola
			//System.out.println(linea);
			
			
		} catch (Exception e) {//en caso de que no se pueda leer el archivo
			//se atrapa una excepción y ejecutamos lo siguiente
			System.out.println("No se puede leer el archivo");
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
