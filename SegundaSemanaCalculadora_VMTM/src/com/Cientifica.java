package com;

public class Cientifica extends Calculadora{

	@Override
	public void sumar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("Hola soy la calculadora marca "+getMarca()+" con tipo de pantalla "+getTipoPantalla()+" y de color "+getColor());
		System.out.printf("El resultado de la suma es: %.2f \n",(a+b));
		
	}
	@Override
	public void sumar(float a, float b,float c) {
		// TODO Auto-generated method stub
		System.out.println("SUma polimorfica a 3 parametros/argumentos");
		System.out.println("Hola soy la calculadora marca "+getMarca()+" con tipo de pantalla "+getTipoPantalla()+" y de color "+getColor());
		System.out.printf("El resultado de la suma es: %.2f \n",(a+b+c));
		
	}

	@Override
	public void restar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.printf("El resultado de la resta de a -b es: %.2f\n",a-b);
	}

	@Override
	public void multiplicar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.printf("El resultado de la multiplicacion es: %.2f \n",a*b);
	}

	@Override
	public void dividir(float a, float b) {
		// TODO Auto-generated method stub
		System.out.printf("El resultado de la division es: %.2f \n",a/b);
		
	}

}
