package com.arrays;

public class Arrays4_VMTM {
	//4. Dado un array de números de 5 posiciones con los siguientes valores:
	//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
	//los valores invertidos, es decir, que el segundo array deberá tener los valores
	//{5,4,3,2,1}.
	public static void main(String[] args) {
		int []numeros= {1,2,3,4,5};
		//System.out.println(numeros.length);
		int []inverso=new int[5];
		for(int i=0;i<numeros.length;i++) {
			inverso[i]=numeros[numeros.length-1-i];
		}
		
	}

}
