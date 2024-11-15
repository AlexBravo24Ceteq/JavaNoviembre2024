package com.arrays;

public class Arrays5_HTC {

	public static void main(String[] args) {
		String [] products = {"Koi","Trucha","Salmón","Tilapia","Pulpo"};
		int [] prices = {2,300,500,1235,600};
		int count =0;

		System.out.println("Bienvenido a Chedrahuo");
		for (String i:products) { 
			System.out.println(i + " a "+ prices[count] +" peso."); 
			count++;
		}

	}
}