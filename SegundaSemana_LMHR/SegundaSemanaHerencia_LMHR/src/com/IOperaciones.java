package com;

public interface IOperaciones {
	
	//Una interface va a  ser un listado e metodos abstractos
	//que una clase tendra que implementar o resolver
	//de esta manera podemos simular la multiherencia en Java
	
	public void sumar (); //solo se declaran, no es necesaria la palabra abstract
	public void restar ();
	public void multiplicar ();
	public void dividir ();
	//por otro lado no podemos tener metodos definidos ej. publicoid tomarTemperatura(){}
	
	

}
