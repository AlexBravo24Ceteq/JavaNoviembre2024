package com;

@FunctionalInterface
public interface IFuncional {

	// Interface funcional es aquella que sólo tiene un método
	// abstracto declarado
	// Si queremos definirla al 100% como interface funcional
	// podemos agregar una anotación llamada @FunctionalInterface
	// arriba del nombre de nuestra clase

	public void operacion(int a, int b, int c);

	// La anotación me obliga a que sóo haya un método declarado
	// en esta interface
	// public void saludar(String saludo);

}
