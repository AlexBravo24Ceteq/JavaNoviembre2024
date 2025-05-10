package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//En el conceptio de composicion, es decir cuando un objeto 
		//es atributo de otro
		
		Almacenamiento a1 = new Almacenamiento("Kingston","SSD", 480);
		Procesador p1= new Procesador("Intel","i5",4.3,8);
		Ram r1 = new Ram("Adata","DDR4",233);
		
		Laptop hp = new Laptop("HP","4467","negro", a1,p1,r1);
		
		System.out.println(hp);

	}

}
