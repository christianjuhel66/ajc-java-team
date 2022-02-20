package com.demo;

import java.util.Scanner;
/**
 * 
 * @author Nathalie Bernard
 *
 */
public class JeuDuPendu {
	
	/***
	 * A partir d'un mot cr�� une cha�ne caract�res d'underscore avec le m�me nombre
	 * de caract�res
	 * 
	 * @param word Cha�ne de caract�res
	 * @return une cha�ne de caract�res d'underscore
	 */
	public static String createUnderscore(String word) {
		String newWord = "";
		for(int i = 0; i < word.length(); i++) {
			newWord += "_";
		}
		return newWord;
	}
	
	/***
	 * V�rifie si le mot est bien inf�rieure � 10 lettres et pas vide
	 * 
	 * @param word Cha�ne de caract�res � v�rifier
	 * @return vrai si le mot a bien moins de 10 lettres, faux sinon
	 */
	public static boolean isCorrectWord(String word) {
		
		if(word.length() > 10 || word.length() == 0) {
			System.out.println("Le mot entr� doit contenir entre 1 et 10 lettres!\n");
			return false;
		}
		
		for(int i = 0; i < word.length(); i++) {
			if ((Character.isLetter(word.charAt(i)) == false)) {
				System.out.println("Le mot entr� contient un caract�re qui n'est pas une lettre!\n");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * V�rifie que le caract�re propos� est bien une lettre et n'a pas d�j� �t�
	 * propos�
	 * 
	 * @param c        Caract�re propos�
	 * @param proposal Cha�ne de caract�res stockant les lettres d�j� propos�e
	 * @return vrai si c'es bien une lettre pas encore propos�e qui est stock�e,
	 *         sinon retourne faux
	 */
	public static boolean checkChar(char c, String proposal) {
		
		if((Character.isLetter(c)) == false) {
			System.out.println("Le caract�re tap� n'est pas une lettre!\n");
			return false;
		}
		
		if(proposal.indexOf(c) != -1) {
			System.out.println("Cette lettre a d�j� �tait propos�e\n");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		/*
		 * Un premier joueur choisit un mot de moins de 10 lettres
		 * Le programme affiche _ _ _ _ _ _ (un par lettre)
		 * Le deuxi�me joueur propose des lettres jusqu'� ce qu'il ait trouv� le mot ou qu'il soit pendu (11 erreurs)
		 * A chaque propositions le programme r�affiche le mot avec des lettres d�couvertes ainsi que les lettres d�j�
		 * annonc�es et le nombre d'erreurs
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
		
		// La boucle s'arr�te au bout de 11 erreurs ou quand toutes les lettres du mots
		// ont �t� trouv�
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
			System.out.println("Les lettres d�j� propos�es sont: " + propositions);
			System.out.println("Vous avez d�j� fait : " + failed + " erreur(s)");
			System.out.println("------------------------------------------------");

		}
		
		sc.close();
		
		if(failed == 11) {
			System.out.println("\nVous avez perdu!\nLe mot � trouv� est : " + mot);
		} else {
			System.out.println("\nVous avez gagnez!\nLe mot �tait : " + mot);
		}
		
	}

}
