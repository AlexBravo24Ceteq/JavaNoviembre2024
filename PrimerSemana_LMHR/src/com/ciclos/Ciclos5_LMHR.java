package com.ciclos;

public class Ciclos5_LMHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
//		tendrá al cabo de un año si todo el dinero lo reinvierte?
//	
		int interes=2;
		double inversion=1000;
		double ganancia;
		
		//CICLO
		for (int i = 1; i < 13; i++) {
			ganancia=(inversion*interes)/100;
			inversion=inversion + ganancia;
			System.out.println("ganancia mes"+i+ " $ "+ inversion);
		}
		System.out.println("ganancia total a final de año = $ "+ inversion);

}
}