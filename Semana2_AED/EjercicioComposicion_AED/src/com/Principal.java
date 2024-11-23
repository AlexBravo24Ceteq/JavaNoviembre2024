package com;

public class Principal {

	public static void main(String[] args) {
		//Crear un ejemplo de objeto de composicion
				//Crear un proyecto nuevo que se llame EjercicioComposicion_XXXX (sus iniciales)
				//Crean un objeto que tenga atributos propios y que se componga de otros 3 objetos
				//EJ. Un Celular, que puede tener marca, modelo, color, y además tiene
				//Una Camara, un Procesador, y una Ram.
				//Ej2. Carro, que tiene marca, modelo, color, y tiene
				//Llantas, Estereo, Motor

		Sala lasala = new Sala("Azul", 3, 1, 3, false, 9.8);
		Comedor elcomedor = new Comedor("Beige", 1, 0, 1, true, 10.5);
		Cocina lacocina = new Cocina("Blanca", 3, 2, 4, true, false, 12);
		
		Casa lacasa = new Casa("Azul", 2, 2, lasala, lacocina, elcomedor);
		System.out.println(lacasa);
	}

}
