package com.demo;

/***
 * Ennonc� EX 01 Fonctions Ecrivez la proc�dure qui affiche la bani�re suivante
 ********************************************************************** 
 ** ** BIENVENUE AUX JAVAISTES ** **
 ********************************************************************** 
 * @author Nathalie Bernard
 *
 */
public class BanniereBienvenue {

	/***
	 * Fonction qui affiche une banni�re bas�e sur les arguments en entr�e
	 * 
	 * @param symbole Le caract�re en encadrement
	 * @param L       La largeur de la banni�re
	 * @param l       La longueur de la banni�re
	 * @param titre   Le texte � centrer dans la banni�re
	 */
	public static void afficheBanniere(char symbole, int L, int l, String titre) {
		int cpt = 0;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < L; j++) {
				if(i == l-1 || i == 0 || j == L-1 || j == 0
						|| j == L-2 || j == 1)
					System.out.print(symbole);
				else if(i == l/2 && j > (L/2-titre.length()/2) && cpt < titre.length()) {
					System.out.print(titre.charAt(cpt));	
					cpt++;
				} 
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String titre = "BIENVENUE AUX JAVAISTES";
		afficheBanniere('*', 77, 5, titre);
	}
}
