package com;

import java.util.Random;

public class ArrayBidimensional {

    public static void main(String[] args) {
    	
        int[][][][] arreglo = new int[10][10][10][10];

        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo[j].length; k++) {
                    for (int l = 0; l < arreglo[k].length; l++) {
                        arreglo[i][j][k][l] = random.nextInt(100); 
                    }
                }
            }
        }

        System.out.println("Algunos valores del array multidimensional:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.println("arreglo[" + i + "][" + j + "][" + k + "][" + l + "] = " + arreglo[i][j][k][l]);
                    }
                }
            }
        }
    }
}
