package com;

public interface IOperaciones {

	//Una interface va a hacer un listado de métodos abstractos
	//que una clase tendrá que implementar o resolver
	//De esta manera podemos simular la "multiherencia" en Java
	
	
	
	public void sumar(); //Sólo los declaramos,no es necesaria la palabra abstract
	public void restar();
	public void multiplica();
	public void dividir();
	
	
	//Por otro lado no podemos tener aquí métodos definidos
	
	/*
	 * Ej. 		public void tomarTemperatura(){
	 * }
	 * 
	 */
	
	//
	
	
}
