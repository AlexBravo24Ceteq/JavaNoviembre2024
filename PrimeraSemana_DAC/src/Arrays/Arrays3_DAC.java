package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays3_DAC {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		
		String word;
		
		// Iniciamos con el Scanner
		
		Scanner wo = new Scanner(System.in);
		System.out.println("Inserta una palabra");
		
		word= wo.nextLine();
		
	//	System.out.println("Su palabra es:");
	//	System.out.println(word);
	// damos una variable con la longitud de la palabra
		
		int lg= word.length();
		
		//System.out.println(lg);
		
		char[] largo = new char [lg];
		
	
	
		for (int i = 0; i < lg; i++) {
				
			largo[i] = word.charAt(i);
			
			
			
			//System.out.println(word.charAt(i));
			
		}
	
		for (int i = 0; i < lg; i++) {
			
			System.out.println("Indice" + " "+ i+ " : " +largo[i]);
			
		}
	
	System.out.println("--------------FIN DEL PROGRAMA----------");
		
	}

}
