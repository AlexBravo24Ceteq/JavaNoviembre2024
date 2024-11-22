package com;

@FunctionalInterface   			//Esta anotacion me obliga a que solo tenga un método declarado
public interface IFuncional {
	
	//Interface funcional es aquella que solo tiene un metodo 
	//abstracto declarado
	//Si queremos definirla al 100% como una interface funcional
	//podemos agregar una anotacion llamada @FunctionalInterface
	
	public void operacion(int a, int b);
	
	//La anotacion me obliga a que solo haya un metodo declarado 
	//en esta interface
	//public void saludar(String saludo);
	

}
