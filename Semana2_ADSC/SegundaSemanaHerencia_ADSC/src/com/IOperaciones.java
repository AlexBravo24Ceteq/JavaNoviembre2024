package com;

public interface IOperaciones {

	//Una interface va a ser un listado de métodos abstractos
	//que una clase tendrá que implementar o resolver, así se 
	//puede simular la "multiherencia" en Java
	
	public void sumar(); //solo los declaramos, no es necesario
	//colocar la palabra "abstract"
	public void restar();
	public void multiplicar();
	public void dividir();
	
	//Por otro lado, no podemos tener aquí métodos definidos
	//public void tomarTemperatura() {} <= algo como ésto, NO se puede, sólo métodos abstractos
	
	
	
}
