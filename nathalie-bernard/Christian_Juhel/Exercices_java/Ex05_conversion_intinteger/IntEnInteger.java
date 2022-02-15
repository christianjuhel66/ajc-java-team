package com.demo;

/**
 * Exercice 05
 * Créez un programme java qui prenne en paramètre une variable de type int et qui retourne cette l'équivalent converti en Integer
 * @author Nathalie BERNARD
 *
 */
public class IntEnInteger {

	public static Integer intEnInteger(int entier) {
		Integer test = entier;
		return test;
	}
	
	public static void main(String[] args) {
		Integer test = intEnInteger(5);
		System.out.println(test);
	}
}
