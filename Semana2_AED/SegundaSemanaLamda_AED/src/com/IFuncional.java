package com;

@FunctionalInterface
public interface IFuncional {
	
	// Interface funcional es aquella que solo tiene un metodo
	// abstracto declarado
	// si queremos definirla al 100 como una interface funcional
	// podemos agregar una anotacion llamada @FunctionalInterface
	
	public void operacion(int a, int b);
	
	//La notacion me obliga a que solo exista un metodo declarado en la interface
	//public void saludar(String saludar);

}
