package com.nodDoublon;

/***
 * Exercice 07 Cr�ez une classe qui stocke des mots uniques ( sans doublon) dans
 * une liste Cr�ez la fonctionnalit� qui ajoute et qui supprime des mots dans
 * cette liste tout en garantissant l'absence de doublons.
 * 
 * @author Nathalie Bernard
 *
 */
public class main {

	public static void main(String[] args) {
		NoDoublon liste = new NoDoublon();
		System.out.println("Remplissage de la liste de mots");
		liste.ajouterMot("coucou");
		liste.ajouterMot("vent");
		liste.ajouterMot("pierre");
		liste.afficherListeMots();
		
		System.out.println("\nSuppression du mot 'pierre' dans la liste de mots:");
		liste.supprimerMot("pierre");
		liste.afficherListeMots();
		
		System.out.println("\nTentative d'ajout du mot 'vent' dans la liste qui �choue car le mot est d�j� pr�sent:");
		liste.ajouterMot("vent");
		liste.afficherListeMots();
	}

}
