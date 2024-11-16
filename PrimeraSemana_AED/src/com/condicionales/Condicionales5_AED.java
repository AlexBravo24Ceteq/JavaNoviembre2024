package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AED {

	public static void main(String[] args) {

        // Ejercicio 5
		//5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.  
		
		String genero = ""; 
		String aceptacion = "";
		int edad = 0;
		int nota = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bienvenido por favor ingresa los siguientes datos ");
		System.out.println("Si su genero es masculino digite M y si es femenino digite F");
		genero = entrada.nextLine(); 
		genero = genero.toUpperCase();     // En caso de digitar minusculas se transforma en mayusculas 
		
		if (genero.equals("M") || genero.equals("F")) {			
			System.out.println("Por favor digite su edad ");
			
			if (entrada.hasNextInt()) {
				edad = entrada.nextInt();    // Se guarda el valor del primer numero				
				System.out.println("Por favor digite su nota ");
				
				if (entrada.hasNextInt()) {
					nota = entrada.nextInt();    // Se guarda el valor del primer numero					
				} else {
		            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
		            return;
		        }
				
	        } else {
	            System.out.println("Solo se pueden evaluar datos numéricos. Digite un número por favor."); // si no se dijita un numero manda el mensaje 
	            return;
	        }
		}
		else {
			System.out.println("Por favor seleccione una de las opciones disponibles ");// si digita algo que no es M o F
			return;
		}
		
		// muestro un resumen de la informacion proporcionado al usuario
		System.out.println("Se calculará la aceptación en base a los datos proporcionados");
		System.out.println("Sexo: " +genero );
		System.out.println("Edad: " +edad );
		System.out.println("Nota: " +nota );
		
		if (genero.equals("M") && edad >= 18 && nota >= 5) {
			System.out.println("Su nivel de aceptación es POSIBLE");
		}else if (genero.equals("F") && edad >= 18 && nota >= 5) {
			System.out.println("Su nivel de aceptación es ACEPTADA");
		}else {
			System.out.println("Su nivel de aceptación es NO ACEPTADA");
		}
	}
}
