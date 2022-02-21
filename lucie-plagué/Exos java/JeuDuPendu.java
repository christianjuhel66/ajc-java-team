package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JeuDuPendu {

	public static void main(String[] args) {
		// Un premier joueur choisit un mot de moins de 10 lettres
		// Le programme affiche _ _ _ _ _ (un _ par lettre)
		// Le deuxième joueur propose des lettres jusqu'à ce qu'il ait trouvé le mot ou soit pendu (11 erreurs commises)
		// A chaque proposition, le programme réaffiche le mot avec les lettres découvertes ainsi que les lettres déjà 
		// annoncées et le nb d'erreurs

		int maxCompteur = 11;
		int nbErreurs = 0;
		List<Character> lettresUtilisees = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String mot;
		
		do {
			System.out.print("Entrez un mot entre 2 et 10 lettres ? "); // Un premier joueur choisit un mot de moins de
			mot = sc.next().toUpperCase();											// 10 lettres
		} while(mot.length() > 10 || mot.length() < 2);
		
		
		
		char[] tab = new char[mot.length()];

		for (int i = 0; i < mot.length(); i++) { // Le programme affiche un _ par lettre
			System.out.print("_ ");
		}
		
		do {
			System.out.println("Lettrees utilisées : \n" + lettresUtilisees.toString());
			System.out.println("Nombre d'erreurs : " + nbErreurs);
			System.out.println("Entrez une lettre : ");
			
			char lettre = sc.next().charAt(0);
		} while ();
		
		for (int i = 0; i < mot.length(); i++) {
		     tab[i] = mot.charAt(i);
		}
					
		
		System.out.println("Quelle lettre ?: "); // Le deuxième joueur propose des lettres
		String lettre = sc.next();
		
		for (int i = 0; i < mot.length(); i++) { // Recherche de la bonne lettre
			
		}
		
	}

}
