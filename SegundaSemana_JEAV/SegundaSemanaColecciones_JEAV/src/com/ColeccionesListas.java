package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nombres = new ArrayList<>(); 
		nombres.add("Santiago"); 
		nombres.add("Tulio"); 
		nombres.add("Pedro"); 
		nombres.add("Luis"); 
		
		System.out.println("Lista de Nombres:"); 
		
		for (String nombre : nombres) { 
			System.out.println(nombre); 
			} nombres.remove("Pedro"); 
			
		System.out.println("\nLista de Nombres despues de eliminar a Pedro:"); 
		
		for (String nombre : nombres) { 
			System.out.println(nombre); 
		} nombres.set(1, "Ana"); 
			
		System.out.println("\nLista de Nombres despues de reemplazar a Tulio con Ana:"); 
			
		for (String nombre : nombres) { 
				System.out.println(nombre); 
		}

	}

}
