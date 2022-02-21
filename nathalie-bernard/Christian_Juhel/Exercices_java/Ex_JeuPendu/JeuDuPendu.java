package com.demo;

import java.util.Scanner;
/**
 * 
 * @author Nathalie Bernard
 *
 */
public class JeuDuPendu {
	
	/***
	 * A partir d'un mot créé une chaîne caractères d'underscore avec le même nombre
	 * de caractères
	 * 
	 * @param word Chaîne de caractères
	 * @return une chaîne de caractères d'underscore
	 */
	public static String createUnderscore(String word) {
		String newWord = "";
		for(int i = 0; i < word.length(); i++) {
			newWord += "_";
		}
		return newWord;
	}
	
	/***
	 * Vérifie si le mot est bien inférieure à 10 lettres et pas vide
	 * 
	 * @param word Chaîne de caractères à vérifier
	 * @return vrai si le mot a bien moins de 10 lettres, faux sinon
	 */
	public static boolean isCorrectWord(String word) {
		
		if(word.length() > 10 || word.length() == 0) {
			System.out.println("Le mot entré doit contenir entre 1 et 10 lettres!\n");
			return false;
		}
		
		for(int i = 0; i < word.length(); i++) {
			if ((Character.isLetter(word.charAt(i)) == false)) {
				System.out.println("Le mot entré contient un caractère qui n'est pas une lettre!\n");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Vérifie que le caractère proposé est bien une lettre et n'a pas déjà été
	 * proposé
	 * 
	 * @param c        Caractère proposé
	 * @param proposal Chaîne de caractères stockant les lettres déjà proposée
	 * @return vrai si c'es bien une lettre pas encore proposée qui est stockée,
	 *         sinon retourne faux
	 */
	public static boolean checkChar(char c, String proposal) {
		
		if((Character.isLetter(c)) == false) {
			System.out.println("Le caractère tapé n'est pas une lettre!\n");
			return false;
		}
		
		if(proposal.indexOf(c) != -1) {
			System.out.println("Cette lettre a déjà était proposée\n");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		/*
		 * Un premier joueur choisit un mot de moins de 10 lettres
		 * Le programme affiche _ _ _ _ _ _ (un par lettre)
		 * Le deuxième joueur propose des lettres jusqu'à ce qu'il ait trouvé le mot ou qu'il soit pendu (11 erreurs)
		 * A chaque propositions le programme réaffiche le mot avec des lettres découvertes ainsi que les lettres déjà
		 * annoncées et le nombre d'erreurs
		 */
		
		Scanner sc= new Scanner(System.in);
		String mot;
		do {
			System.out.println("Choisir un mot de moins de 10 lettres : ");
			mot= sc.nextLine();
		} while(!isCorrectWord(mot));
		
		String motCache = createUnderscore(mot);
		System.out.println(motCache);
		
		int failed = 0;
		int success = 0;
		String propositions = "";
		
		// La boucle s'arrête au bout de 11 erreurs ou quand toutes les lettres du mots
		// ont été trouvé
		while(failed < 11 && success < mot.length()) {
			char essai;
			do {
				System.out.println("\nVeuillez taper une lettre : ");
				essai = sc.nextLine().trim().charAt(0);
				} while (checkChar(essai, propositions));
			propositions = propositions + essai + " ";
			
			if(mot.indexOf(essai) != -1) {
				
				System.out.println("\nle mot contient: " + essai);
				String tmp = "";
				for(int i = 0; i < mot.length(); i++) {
					if(mot.charAt(i) == essai) {
						tmp += essai;
						success++;
					} else {
						tmp += motCache.charAt(i);
					}
				}
				motCache = tmp;
				System.out.println(motCache);
				
			} else {
				System.out.println("Le mot ne contient pas la lettre: " + essai);
				failed++;
			}
			System.out.println("Les lettres déjà proposées sont: " + propositions);
			System.out.println("Vous avez déjà fait : " + failed + " erreur(s)");
			System.out.println("------------------------------------------------");

		}
		
		sc.close();
		
		if(failed == 11) {
			System.out.println("\nVous avez perdu!\nLe mot à trouvé est : " + mot);
		} else {
			System.out.println("\nVous avez gagnez!\nLe mot était : " + mot);
		}
		
	}

}
