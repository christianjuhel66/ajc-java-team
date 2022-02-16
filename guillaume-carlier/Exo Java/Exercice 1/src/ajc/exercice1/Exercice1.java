package ajc.exercice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		// recupération du mot
		Scanner scan = new Scanner(System.in);
		System.out.println("Joueur 1, entrez un mot secret : ");
		String mot = scan.next();
		String hidingWord = "";
		
		// affichage caché
		for (int i = 0; i < mot.length(); i++) {
			hidingWord += "-";
		}
		System.out.println(hidingWord);
		
		// initialisation des variables utiles
		int nbLettreTrouvee = 0;
		int error = 0;
		int lettreIndex = 0;
		List<String> usedLettre = new ArrayList<String>();
		
		// recherche de lettre par joueur 2
		do {
			
			// invitation a saisir une lettre			
			System.out.println("Joueur 2, trouvez une lettre : ");
			String lettre = scan.next();
			
			//vérification lettre utilisée ou non
			while (usedLettre.contains(lettre)) {
				System.out.println("lettre deja utilisée! essayez une autre lettre.");
				lettre = scan.next();
			}
			
			// verification de la présence de la lettre
			if (mot.contains(lettre)) {
				// lettre présente
				System.out.println("Bravo vous avez trouvez une lettre");
				usedLettre.add(lettre);
				//nb d'occurence de la lettre
				
				// verifier si la lettre apparait plusieurs fois
				int occurrence = compterOccurrences(mot, lettre);
				System.out.println("la lettre apparait : " + occurrence + " fois.");

				// remplacer les lettre trouvées
				for (int k = 0; k < mot.length(); k++) {
					if (mot.charAt(k) == lettre.charAt(0)) {
						// changer le mot caché pour faire apparaitre la lettre trouvée
						hidingWord = replaceCharAt(hidingWord, k, lettre);
					}
				}
				
				// incrémenter nbLettreTrouvee
				nbLettreTrouvee += occurrence;

			}else {
				// lettre absente
				System.out.println("Dommage, try again");
				// incrémentation du nombre d'erreur
				error++;
				System.out.println("Nombre d'erreur : " + error);
				// ajout de la lettre utilisée
				usedLettre.add(lettre);
			}
			
			// affichage des lettres utilisées
			for (String string : usedLettre) {
				System.out.print( string + " - " );
			}
			
			// affichage des infos
			System.out.println("");
			System.out.println(hidingWord);
			System.out.println("Letrre trouvées : " + nbLettreTrouvee + "/" + mot.length());

			
		}while(nbLettreTrouvee < mot.length() && error != 10);
		
		// Affichage du résultat
		if (error > mot.length()) {
			System.out.println("");
			System.out.println("perdu");
		} else {
			System.out.println("");
			System.out.println("Gagné!!!");
		}
	}

	// methode pour afficher la lettre trouvée 
	public static String replaceCharAt(String s, int pos, String lettre) {
	    return s.substring(0, pos) + lettre + s.substring(pos + 1);
	 }
	
	// methode compte d'occurence de la lettre
	public static int compterOccurrences(String mot, String lettre) {
	 return mot.length() - mot.replace(lettre,"").length();
	}
}


