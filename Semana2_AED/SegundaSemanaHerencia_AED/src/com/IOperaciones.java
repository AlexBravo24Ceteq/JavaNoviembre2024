package com;

public interface IOperaciones {

	// Una interface va a ser un lisatado de metodos abstractos
	// que una clase tendara que implementar o resolver 
	// de esta manera podemos simular la "multiherencia" en java
	
	public void sumar(); // solo los declaramos
	// no es necesario poner la palabra abstract
	public void restar();
	public void multiplicar();
	public void dividir();
	
	// por otro lado no podemos tener metodos definidos 
	//public void tomarTemperatura() {
		
	//}
}
