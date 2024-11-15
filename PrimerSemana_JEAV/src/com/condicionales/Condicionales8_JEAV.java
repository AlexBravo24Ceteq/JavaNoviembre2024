package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JEAV {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        int dia;

        System.out.print("Introduzca un numero del 1 al 7 para representar un dia de la semana: ");
        dia = entrada.nextInt();

        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "El numero introducido esta fuera del rango establecido";
                break;
                
        }

        System.out.println("El numero "+ dia + " corresponde al dia: " + nombreDia);

    }
}
