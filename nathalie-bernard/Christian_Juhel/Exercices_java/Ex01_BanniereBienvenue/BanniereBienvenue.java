package com.demo;

/***
 * Ennoncé EX 01 Fonctions Ecrivez la procédure qui affiche la banière suivante
 ********************************************************************** 
 ** ** BIENVENUE AUX JAVAISTES ** **
 ********************************************************************** 
 * @author Nathalie Bernard
 *
 */
public class BanniereBienvenue {

	/***
	 * Fonction qui affiche une bannière basée sur les arguments en entrée
	 * 
	 * @param symbole Le caractère en encadrement
	 * @param L       La largeur de la bannière
	 * @param l       La longueur de la bannière
	 * @param titre   Le texte à centrer dans la bannière
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
