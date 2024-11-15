package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// ue de la clases file y file writer praa escribir contenido en un  archivo
		String ruta="C:\\Users\\comoc\\Desktop\\file.txt";
		String nombre = "\n Isai duran perez";
		
		try {
			File archivo = new File(ruta);
			FileWriter writer= new FileWriter(archivo, true); // para respetar el contenido declaramos true en los argumentos
			//FileReader lector = new FileReader(archivo);
			//escribimos lo que esta en nuestra variable nombre dentro de nuestro archivo fichero
			writer.write(nombre);
			//comfirmamos la escritura del archivo con nuestro metodo close
			writer.close();
			
			
		}catch(Exception e){
			System.out.println("no se puede escribir el archivo");
		}

	}

}
