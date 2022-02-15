package com.demo;

import java.util.Scanner;
/***
 * 
 * @author Nathalie Bernard
 * Recherche et suppression d'un �l�ment dans un tableau non tri�.
 * On recherche dans in tableau non tri� contenant 20 pr�noms, un pr�nom saisi au clavier.
 * Lorsque cet �l�ment est trouv�, on l'�limine du tableau en d�calant les cases qui le suivent et en mettant en blanc la derni�re case
 */
 
public class SearchName {
	
	/**
	 * Cherche si le tableau contient ou pas le pr�nom saisie.
	 * @param names le tableau de 20 pr�noms
	 * @param query le pr�nom cherch� en entr�e
	 * @return true si le tableau contient le pr�nom sinon false
	 */
	public static boolean searchNames(String names[], String query) {
		boolean find = false;
		for(int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(query)) {
				find = true;
			}
		}
		return find;
	}
	
	/**
	 * Montre les pr�noms contenus dans le table et leurs index
	 * @param names le tableau pr�noms
	 */
	public static void showNames(String names[]) {
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
	}
	
	/**
	 * Elimine le pr�nom mis en entr�e du tableau et red�cale les pr�noms
	 * @param names le tableau pr�noms
	 * @param query le pr�nom � d�caler
	 */
	public static String[] sortNames(String names[], String query) {
		int index = -1;
		System.out.println("Le pr�nom " + query + " a �t� trouv�!");
		for(int i = 0; i < names.length-1; i++) {
			if(names[i].equalsIgnoreCase(query)) {
				index = i;
			}
			if (i >= index && index != -1) {
				System.out.println("names[" + i + "]: " + names[i] + " <- " + "names[" + i + "]: " + names[i+1]);
				names[i] = names[i+1];
			} 
		}
		names[names.length-1] = "";
		return names;
	}
	
	public static void main(String[] args) {
		
		/*String names[] = {"Emma", "Jade", "Louise", "Alice", "Chlo�", "Lina", "L�a", "Rose", "Anna", "Mina",
				"L�o", "Gabriel", "Rapha�l", "Arthur", "Louis", "Jules", "Adam", "Ma�l", "Jean", "Olivier"};
		boolean findOrNot = false;
		
		System.out.println("Veuillez saisir le pr�nom recherch� : ");
		
		Scanner sc= new Scanner(System.in);
		String query = sc.nextLine();
		sc.close();
		
		findOrNot = searchNames(names, query);
	
		if(findOrNot) {
			sortNames(names, query);
			//showNames(names);
		} else {
			System.out.println("Le pr�nom " + query + " n'a pas �t� trouv�!");
		}*/
		 //initialisation des variables et tableaux:
    

	}
		
	
}
