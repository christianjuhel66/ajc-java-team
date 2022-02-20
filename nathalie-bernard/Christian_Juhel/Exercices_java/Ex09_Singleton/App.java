package com.singleton;

public class App {

	public static void main(String[] args) {
		Singleton s1 = Singleton.APP;
		s1.setTest(10);
		System.out.println("Valeur de s1: " + s1.getTest());

		Singleton s2 = Singleton.APP;
		s2.setTest(5);
		System.out.println("Valeur de s1: " + s1.getTest());
		// On a un singleton donc s1 et s2 sont des étiquettes de la même instance
		// unique de la classe Singleton

	}

}
