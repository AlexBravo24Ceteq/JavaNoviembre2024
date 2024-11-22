package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// listas son una coleccion de elementos definida como una 
		//sucesion de los mismos, esta coleccion se implementa atravez de una
		//interface list y un array redimensionable
		//admite valores duplicados, es de las colecciones mas utilizads
		//no podemos guardar datos primitivos
		//podemos guardar dtos de tipo objeto(tring, Wrapper, etc)
		
	List<String> lista = new ArrayList<String>();	
	
	//ananir elementos al final de la lista
	lista.add("Isai");
	lista.add("paco");
	lista.add("fulano");
	lista.add("mengano");
	lista.add("perengano");
	lista.add("perengano");
	
	
    System.out.println(lista);
    System.out.println(lista.get(0));
    System.out.println(lista.contains("paco"));
    System.out.println(lista.indexOf("perengano"));
    System.out.println(lista.lastIndexOf("perengano"));
    
    //eliminar elementos de la lista
    lista.remove(5);
    System.out.println(lista);
    
    //agregar elemento a la poicion indicada de la lista
    lista.add(0, "celso");
    System.out.println(lista);
    
    //cambiar el valor de la posicion indicada
    lista.set(3, "Ana");
    System.out.println(lista);
    
    //si quiero recuperar todo lo valores de mi lista utilizo for
    
    for (int i = 0; i< lista.size(); i++) {
    	System.out.println(lista.get(i));
    }
    
    //se puede lmacenar varios elementos si parametrizo mi lista con elementos object
    //o si no la parametrizo
    
    List <Object> coleccion = new ArrayList<Object>();
    
    coleccion.add("Nombre");
    coleccion.add(23);
    coleccion.add(3.1416);
    coleccion.add(true);
    coleccion.add('$');
    
    System.out.println(coleccion);
    
    
    
	}

}
