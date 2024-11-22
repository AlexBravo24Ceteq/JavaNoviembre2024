package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona victor_terron=new Persona("Victor Terrón",25,"Masculino");
		System.out.println(victor_terron);
		
		//crear dos objetos de clase Taco
		Taco conTodo=new Taco("Asada",2,true,true,"Verde");
		
		Taco vacio=new Taco();
		
		vacio.setIngPrincipal("Chorizo");
		vacio.setSalsa("Roja");
		vacio.setCilantro(true);
		System.out.println(conTodo);
		System.out.println(vacio);
		
		Libro libroT=new Libro("VSEST 29110: A tool for facilitating",2024,"Victor Terrón");
		System.out.println(libroT);
		Carro car1=new Carro("negro","ford",2024);
		System.out.println(car1);
		Email email1=new Email("vicmictm@gmail.com","victor.terron@cimat.mx","ejemplo de POO","Contenido del correo");
		System.out.println(email1);
		

	}

}
