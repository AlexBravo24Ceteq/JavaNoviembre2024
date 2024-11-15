package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="\nVictor Miguel Terron Macias";
		
		try {
			File archivo=new File("C:\\Users\\vicmi\\Desktop\\proyecto.txt");
			//FileWriter writer=new FileWriter(archivo);//overwrite the file
			FileWriter writer=new FileWriter(archivo,true);//append the text into the file
			
			writer.write(nombre);
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
