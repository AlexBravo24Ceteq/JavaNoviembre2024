package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JEAV {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

        int alumnos, costo;
 
        System.out.println("Calculo de viaje:");
        System.out.print("Introduzca numero de alumnos: ");
        alumnos = entrada.nextInt();

        if (alumnos >= 100 ) {
        	
        	costo = 65;
        	
            System.out.println("El viaje por costara un total de : $" + alumnos*costo + " y cada alumno pagará: $" + costo);
           	
            } else if(alumnos >= 50) {
            	
            	costo = 70;
            	
                System.out.println("El viaje por costara un total de : $" + alumnos*costo + " y cada alumno pagará: $" + costo);
                
            } else if(alumnos >= 30) {
            	
            	costo = 95;
            	
                System.out.println("El viaje por costara un total de : $" + alumnos*costo + " y cada alumno pagará: $" + costo);
                
            } else {
            	
            	costo = 4000;
            	
                System.out.println("El viaje por costara: $" + costo + " y cada alumno pagará: $" + costo/alumnos);
                
            } 


	}

}
