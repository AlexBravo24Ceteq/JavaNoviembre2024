package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estrucuras de ciclos
		//Ciclos tambien llamados bucles o estructuras de iteracion
		//
		
		//While - mientras .... se cumpla una condicion
		
		/*
		 * mientras(esto se cumpla o sea verdadero){
		 * 
		 * 		se ejecuta este vloque de codigo
		 * 
		 * }
		 */
		
		// Ejemplo sencillo
		
		int x=1;
		while(x<5) {
			System.out.println("El valor de x es: "+x);
			x++;
		}
		
		/*
		 * Ciclo do While
		 * Ejemplo sencillo 
		 */
		int y=1;
		do{
			System.out.println("El valor de y es: "+y);
			y++;
		}while(y<10);
			
		/*
		 * Ciclo For()
		 * Es util cuanod sabemos cuantas veces se debe ejecutar la terea
		 * 
		 * Ejemplo sencillo
		 */
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("EL valor de i  es: "+i);
		}
	}

}
