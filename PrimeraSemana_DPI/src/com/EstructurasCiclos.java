package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// etructura que nos permite ejecutar la funcion mientras ea verdadero
		
		// mientras(esto se cumpla){
		//se ejecuta ete bloue de codigo
	   // }
	
	int x = 1;
//		
//		while(x < 5) {
//			System.out.println(x + " .-hola mundo");
//			x= x+1;
//			
//			//otra forma de incrementar x es x++
//		}
//		
		//do while es similar pero primero ejecuta el codigo y luego pregunta si es valido ejecutar denuevo

//		do {
//			System.out.println(" .-hola mundo");
//		}while(x>10);
	
	   //el ciclo for es mas utilizado ya que es util cuando sabemos cuantas veces debe ejecutar una tarea
	for (int i = 0; i < 5; i++) {
		System.out.println(i + " .-hola mundo");
	}
	
	}

}
