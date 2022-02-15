package com.demo;

import java.util.Scanner;
/***
 * 
 * @author Nathalie Bernard
 * Recherche et suppression d'un élément dans un tableau non trié.
 * On recherche dans in tableau non trié contenant 20 prénoms, un prénom saisi au clavier.
 * Lorsque cet élément est trouvé, on l'élimine du tableau en décalant les cases qui le suivent et en mettant en blanc la dernière case
 */
 
public class SearchName {
	
	/**
	 * Cherche si le tableau contient ou pas le prénom saisie.
	 * @param names le tableau de 20 prénoms
	 * @param query le prénom cherché en entrée
	 * @return true si le tableau contient le prénom sinon false
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
	 * Montre les prénoms contenus dans le table et leurs index
	 * @param names le tableau prénoms
	 */
	public static void showNames(String names[]) {
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
	}
	
	/**
	 * Elimine le prénom mis en entrée du tableau et redécale les prénoms
	 * @param names le tableau prénoms
	 * @param query le prénom à décaler
	 */
	public static String[] sortNames(String names[], String query) {
		int index = -1;
		System.out.println("Le prénom " + query + " a été trouvé!");
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
		
		/*String names[] = {"Emma", "Jade", "Louise", "Alice", "Chloé", "Lina", "Léa", "Rose", "Anna", "Mina",
				"Léo", "Gabriel", "Raphaël", "Arthur", "Louis", "Jules", "Adam", "Maël", "Jean", "Olivier"};
		boolean findOrNot = false;
		
		System.out.println("Veuillez saisir le prénom recherché : ");
		
		Scanner sc= new Scanner(System.in);
		String query = sc.nextLine();
		sc.close();
		
		findOrNot = searchNames(names, query);
	
		if(findOrNot) {
			sortNames(names, query);
			//showNames(names);
		} else {
			System.out.println("Le prénom " + query + " n'a pas été trouvé!");
		}*/
		 //initialisation des variables et tableaux:
    

	}
		
	
}
