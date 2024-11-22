package com;
@FunctionalInterface 

public interface IFuncional {
	
	//Interface funcional es aquella que solo tinee un metodo abstracto declarado
	//si queremos denirla al 100% como una interface funcional podemos agregar una anotacion
	//llamada @FuncionalInterface
	
	public void operacion(int a, int b);
	
	//la anotacion me obliga a que solo hayya un metodo declarado en esta interface
	
	//public void saludar(String saludo);

}
