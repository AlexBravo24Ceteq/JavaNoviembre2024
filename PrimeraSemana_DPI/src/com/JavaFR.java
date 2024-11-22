package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta="C:\\Users\\comoc\\Desktop\\file.txt";
		String linea;
		try {//intentamos leer el archivo ejecutndo lo siguiente
			
			File archivo = new File(ruta);
			FileReader lector = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(lector);
			
			//linea = buffer.readLine();
			//System.out.println(linea);
			while((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
		}catch(Exception e) {
			System.out.println("Error no se lee el archivo");
			e.printStackTrace();
		}

	}

}
