package com;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class JavaFR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea;
		try {
			File archivo=new File("C:\\Users\\vicmi\\Desktop\\proyecto.txt");
			
			FileReader lector= new FileReader(archivo);
			
			BufferedReader buffer=new BufferedReader(lector);
			
			while((linea=buffer.readLine())!=null) {
				System.out.println(linea);
			}
		}catch (Exception e) {
			System.out.println("No se puede leer el archivo");
			e.printStackTrace();
		}

	}

}
