package com.ciclos;

public class Ciclos4_JEAV {

	public static void main(String[] args) {


		for (int hora = 0; hora < 24; hora++) { 
			for (int minuto = 0; minuto < 60; minuto++) { 
				for (int segundo = 0; segundo < 60; segundo++) { 
			
			String horaXX = (hora < 10) ? "0" + hora : Integer.toString(hora); 
			String minutoXX = (minuto < 10) ? "0" + minuto : Integer.toString(minuto); 
			String segundoXX = (segundo < 10) ? "0" + segundo : Integer.toString(segundo);
			
			System.out.println(horaXX+ ":" + minutoXX + ":" + segundoXX); } } }
		}

	

	

}
