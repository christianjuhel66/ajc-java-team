package com.demo;

/***
 * Exercice 08 Créez le programme qui détermine si une lettre est présente ou
 * pas dans un mot.
 * 
 * @author Nathalie Bernard
 *
 */
public class LettrePresenteOuPas {
	public static void main(String[] args) {
		String mot = "test";
		char c = 'c';
		if(mot.indexOf(c) != -1) {
			System.out.println("Le mot " + mot + " contient la lettre " + c);
		} else {
			System.out.println("Le mot " + mot + " ne contient pas la lettre " + c);
		}
		
	}
}
