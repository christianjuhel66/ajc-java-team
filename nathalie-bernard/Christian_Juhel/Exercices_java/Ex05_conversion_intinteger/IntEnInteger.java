package com.demo;

/**
 * Exercice 05
 * Cr�ez un programme java qui prenne en param�tre une variable de type int et qui retourne cette l'�quivalent converti en Integer
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
