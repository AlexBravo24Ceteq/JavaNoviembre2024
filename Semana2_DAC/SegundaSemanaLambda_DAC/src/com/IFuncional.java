package com;
@FunctionalInterface
//esta anotacion me obliga a solo tener un metodo declarado

public interface IFuncional {

	//interfase funcional- es aquella que solo tiene un metodo abstracto declarado
	// si queremos definirla al 100 una interfase funcional podemos agregar una anotacion llamada @FunctionalInterface
	
	
	public void operacion (int a, int b);
	
	//public void saludar(String saludo);
	//La anotacion me obliga a que haya un solo metodo declaradoen esa interface
	
	
	
	
}
