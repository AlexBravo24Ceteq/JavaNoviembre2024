package Arrays;

import java.util.Scanner;

public class Arrays2_DAC {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, 
		//que contendrá los números del 1 al 100. 
		//Obtén la suma de todos ellos y la media.

		
		int[]cent = new int[100];
		
		int x =1;
		int y =0;
		
		for (int i = 0; i <100; i++) {
			
			
			cent [y++] = x++;
			
			//System.out.println(y);
			//System.out.println(x);
		}
		
		
		for (int i = 0; i < cent.length; i++) {
			
			System.out.println("Indice" + " "+ i+ " : " + cent[i]);
			
		}	
		
		
		double sum=0;
		
		
		
		
		for (int i = 0; i < 100; i++) {
			
			sum = sum+cent[i];
			
		//System.out.println(sum);
			
			
			
			
		}
		
		
		double med;
		
		
		System.out.println("La suma de todos los números es:"+" "+sum);
			
		med= sum/cent.length;
		
		System.out.println("La media es"+ " " + med);
		
		System.out.println(med);
		
		System.out.println("---------------FIN DE PROGRAMA------------");
			
		
		
		
		
	}

}
