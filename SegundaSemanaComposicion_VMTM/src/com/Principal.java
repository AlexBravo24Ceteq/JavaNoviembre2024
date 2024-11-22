package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In composition concept, when an object is an attribute of other
		//first we must create the smallest before to create the bigger
		
		//first we need the processro, then the ram and then the storage to be part of the laptop object
		
		Almacenamiento seagate = new Almacenamiento("seagate","ssd",2000);
		
		Procesador amd=new Procesador("AMD Ryzen","4.5GHz",5,8);
		
		Ram adata=new Ram("Adata", "DDR4", 24);
		
		Laptop LENOVO=new Laptop("Lenovo","Legion Y7","Gray Space",seagate,amd,adata);
		System.out.println(LENOVO);

	}

}
