package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Persona juan = new Persona();
		
		//Persona fito = new Persona("Rodolfo", 30, "Masculino");
		
		//System.out.print(fito.getNombre());	
		
		//juan.setNombre("Juan Alberto");
		
		//System.out.print(juan.getGenero());
		
		//System.out.print(fito);
		
		Celular Motorola = new Celular("AMOLED", 128, 48);
		
		Celular Samsung = new Celular();
		Samsung.setTipoPantalla("LCD");
		
		System.out.println(Motorola);
		System.out.println(Samsung);
	
		System.out.println("");

		
		Mochila miCompañera = new Mochila("Ojitos Dormilones", 3, "Azul");
		
		Mochila miMochila = new Mochila();
		miMochila.marcaMochila = "Patito";
		
		System.out.println(miCompañera);
		System.out.println(miMochila);
		System.out.println("");
		
		Boleto miBoleto = new Boleto(2, "Mi ranchito", true);
		
		Boleto nuevoBoleto = new Boleto ();
		nuevoBoleto.setConVentana(true);
		
		System.out.println(miBoleto);
		System.out.println(nuevoBoleto);

		
	}

}
