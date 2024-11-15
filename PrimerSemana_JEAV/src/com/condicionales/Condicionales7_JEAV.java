package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JEAV {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        
        int resultado;

        System.out.print("Introduzca el resultado del dado (1-6): ");
        resultado = entrada.nextInt();

        String caraOpuesta;

        switch (resultado) {
            case 1:
                caraOpuesta = "seis";
                break;
            case 2:
                caraOpuesta = "cinco";
                break;
            case 3:
                caraOpuesta = "cuatro";
                break;
            case 4:
                caraOpuesta = "tres";
                break;
            case 5:
                caraOpuesta = "dos";
                break;
            case 6:
                caraOpuesta = "uno";
                break;
            default:
                caraOpuesta = "ERROR: numero incorrecto";
                break;
        }

        System.out.println("La cara opuesta es: " + caraOpuesta);

    }
}
