package com;

public interface IOperaciones {
	
	//Una interface va a ser un llistado de metodos abstractos que una clase tendra que 
	//implementar o resolver. De esta manera podemos simular la "ultiherencia" en java
	
	//solamente los declaramos no es necesario poder abstract
	public void sumar();
	public void restar();
	public void multiplicar();
	public void dividir();
	

	//por otro lado no podemos tener metods definidos aqui metodos definidos
	//public void tomerTemperatura(){}
	
}
