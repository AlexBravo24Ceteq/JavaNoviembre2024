package com.problemario2;

public class Ciclos5_VMTM {
	//5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
	//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
	//tendrá al cabo de un año si todo el dinero lo reinvierte?
	public static void main(String[] args) {
		float inversionInicial=1000;
		for(int i=1;i<13;i++) {
			inversionInicial+=(inversionInicial*0.02);
		}
		System.out.printf("Cantidad de dinero total: %f",inversionInicial);
	}

}
