package com.demo;

public class Exercice8 {

	public static void main(String[] args) {
		
		// Créez le programme qui détermine si une lettre est présente ou pas dans un mot.
		
		String mot = "programmation";
		char c = 'z';
		
		if (mot.indexOf(c) == -1) {
			System.out.println("Le caractère " + c + " n'est pas présent dans le mot " + mot);
		} else {
			System.out.println("Le caractère " + c + " est présent dans le mot " + mot);
		}

	}

}
