package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LECTURA DE ARCHIVOS MEDIANTE LAS CLASES File, Filereader y BufferReader
		
		//declaramos un String donde poder guardar la linea o lineas q vamos
		//a leer de nuestro archivo
		
		String linea;
		
//		//Utilizar una estructura try and catch para leer o intentar leer el archivo
//		si no se puede leer por alguna razon ejecutamos otra cosa pero
//		atrapamos la excepción
		
		try { //intentando leer el archivo ejecutando lo sig
			//traemos a la clase File para crear una variable donde almacenemos 
			//la ruta donde se encuentra el archivo 
			File archivo = new File ("C:\\Users\\USER\\Desktop\\fichero.txt");
			//Ahora necesitamos poder abrir el archivo en forma de lectura
			FileReader lector= new FileReader(archivo); //le pasamos el valor de  archivo
			
			//ahora necesitamos leer el contenido o cargarlo de este lado coen un bojeto
			//que nos permita leerlo y que es de la clase BufferReader
			BufferedReader buffer= new BufferedReader(lector);
			
			//Traemos lo que se lee del archivo a nuestro String aqui
			
			linea= buffer.readLine (); //.READlINE SOLO ES CAPAZ DE LEER UNA LINEA a la vez
			//para leer mas de una linea la agregamos en un ciclo para recuperar las siguientes
			while ((linea=buffer.readLine()) !=null) { //mientras readLine tenga lineas por recuperar
				System.out.println(linea);
			}
			//
			
			// una vez que se tiene se imprime en consola
			System.out.println(linea);
			
		} catch (Exception e) { //en caso de que no se pueda leer el archivo se ejecuta una excepción
			//y se ejecuta lo siguiente
			System.out.println("No se puede leer el archivo");
			//si tuviera la necesidad de ver el error o excepción en consola, lo llamo a traves 
			//del objeto a donde se atrapó
			e.printStackTrace(); //esto imprime nuevamente el error o excepción en consola 
		}
		
		

	}

}
