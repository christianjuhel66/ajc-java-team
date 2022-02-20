package com.demo;

public class Exercice5 {

	public static void main(String[] args) {
		
		// Initialiser un int
		int x = 12;

		// Convertir le int en Integer et afficher la classe du int converti
		System.out.println(convertInt2Integer(x).getClass().getSimpleName());

	}

	public static Integer convertInt2Integer(int i) {
		Integer convertInt = new Integer(i);
		return convertInt;
	}
}
