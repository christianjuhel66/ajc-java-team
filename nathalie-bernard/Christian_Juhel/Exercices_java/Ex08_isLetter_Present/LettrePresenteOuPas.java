package com.demo;

/***
 * Exercice 08 Cr�ez le programme qui d�termine si une lettre est pr�sente ou
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
