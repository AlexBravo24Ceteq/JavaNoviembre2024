package Arrays;

public class Arrays4_DAC {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: 
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto 
		//pero con los valores invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.

		
		
		int [] num = new int [5];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
			
		
		// otra forma mas facil es
		
		// int [] num = new int [5];
		
		// num =[1,2,3,4,5,]
		
		int[] mun = new int [5];
		int x =4;
		for (int i = 0; i < 5; i++) {
			
			
			mun[i] = num[x--];
			//System.out.println(num[x]);
			
		}
				System.out.println("-----------------Primer array---------------------");
				for (int i = 0; i < num.length; i++) {
					
					System.out.println("Indice" + " "+ i+ " : " +num[i]);
				
				}
		
				System.out.println("------------------Segundo array---------------------");
				
				for (int i = 0; i < num.length; i++) {
					
				
					System.out.println("Indice" + " "+ i+ " : " +mun[i]);
				}
		
		
		
		
	}

}
