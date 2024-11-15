package Arrays;

import java.util.Scanner;

public class Arrays_DAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		
		
	int[] numero = new int [10];
	int numero1;
	int x=0;
	
	
	
		for (int i = 0; i <10; i++) {
			
			Scanner num = new Scanner(System.in);
			System.out.println("Introduzca un valor");
			numero1=num.nextInt();
			System.out.println(numero1);
			
			numero[x++] = numero1;
			
			
		}	
		
		for (int i = 0; i < numero.length; i++) {
			
			System.out.println("Indice" + " "+ i+ " : " + numero[i]);
			
		}
		
		System.out.println("---------------FIN DE PROGRAMA------------");
		
	}

}
