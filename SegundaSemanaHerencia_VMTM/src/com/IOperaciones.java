package com;

public interface IOperaciones {
	//una interfaz va a ser un listado de métodos abstractos
	//que una clase tendra que implementar o resolver
	//de esa forma se puede simular la multiherencia en java
	
	public abstract void sumar();//solo se declaran no es necesario definir sus acciones
	public void restar();//la abxstract no es necesario ya que al ser interfaz automáticamente se sabe
	public void multiplicar();
	public void dividir();

}
