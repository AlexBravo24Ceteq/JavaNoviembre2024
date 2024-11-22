package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {

		Map<Integer, String> empleados = new HashMap<>(); 
		
		empleados.put(1, "Jair"); 
		empleados.put(2, "Carlos");
		empleados.put(3, "Omar"); 
		empleados.put(4, "Sara"); 
		
		System.out.println("Lista de Empleados:"); 
		
		for (Map.Entry<Integer, String> entry : empleados.entrySet()) { 
			System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue()); 
			} 
		
		empleados.remove(3); 
		
		System.out.println("\nLista de Empleados despues de eliminar a Pedro:"); 
		
		for (Map.Entry<Integer, String> entry : empleados.entrySet()) { 
			System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue()); 
		} 
		
		empleados.put(2, "Ana"); 
		
		System.out.println("\nLista de Empleados despues de reemplazar a Maria con Ana:"); 
			
		for (Map.Entry<Integer, String> entry : empleados.entrySet()) { 
			System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
		}

	}

}
