package com;

public class Principal {

	public static void main(String[] args) {
		//Crear un nuevo proyecto. EjercicioHerencia_XXXX (iniciales)
				//Van a crear una clase que le herede a otra sus propiedades
				//Ej. Clase Vehiculo que le herede a otra, por ejemplo clase Carro
				//Ej. Electrodomestico, que le herede a Licuadora o Microondas
				//Piensen en los atributos, por lo menos 3 atributos por cada clase
				//Y los mandan a imprimir en la clase Principal de su proyecto

      TarjetadeControl basica = new TarjetadeControl("Oster", "California", 5, 468.90);
      TarjetadeControl especial = new TarjetadeControl();
      
      especial.setMarca("Ninja");
      especial.setVelocidades(9);
      
      System.out.println(basica);
      System.out.println(especial);
      
      Licuadora oster = new Licuadora("Oster", "M-57", 5, 468.9, "Hitachi", "Plastico", "Laton", false);
      Licuadora ninja = new Licuadora();
      
      ninja.setModelo("Ninja");
      ninja.setCuchillaRepuesto(true);
      ninja.setMaterialBaso("Vidrio");
           
      System.out.println(oster);
      System.out.println(ninja);
    
	}

}
