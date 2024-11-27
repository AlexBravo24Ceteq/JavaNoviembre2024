package com;

public class Principal {

	public static void main(String[] args) {
		
		Personaje barbaro = new Personaje("Drizz", true, "Masculino", 3, 2);
		Personaje bestia = new Personaje("Ranzo", false, "Femenino", 0, 2);
		Hero espadachin = new Hero("Leo", true, "Masculino", 2, 2, true, "espada", 23);
		
		Personaje bardo = new Personaje();
		Hero espadachin2 = new Hero();
		
		bardo.setHands(2);
		espadachin2.setArma("Dagas");
		
		System.out.println(barbaro);
		System.out.println(bestia);
		System.out.println(bardo);
		System.out.println(espadachin);
		System.out.println(espadachin2);
	}

}
