package antoinecoquelet;

/*
 * trouver un nom dans une liste
 * enlever le nom de la liste
 * decaler les autres noms (index)
*/

import java.util.Scanner;

public class ExercicePrenom {

    // afficher la liste des noms
    public static void AfficherListNoms(String noms[]) {
        for(int i = 1; i < noms.length; i++) {
            System.out.println("index [" + i + "] - " + noms[i]);
        }
    }

    // verifier si le nom est dans la liste
    public static boolean trouverNom(String noms[], String clavier) {
        boolean find = false;
        for(int i = 0; i < noms.length; i++) {
            if(noms[i].equalsIgnoreCase(clavier)) {
                find = true;
            }
        }
        return find;
    }

    // enlever le nom de la liste et mettre les index a jour
    public static String[] enleverNom(String noms[], String clavier) {
        int index = -1;
        System.out.println(clavier + " est dans la liste");
        for(int i = 1; i < noms.length-1; i++) {
            if(noms[i].equalsIgnoreCase(clavier)) {
                index = i;
            }
            if (i >= index && index != -1) {
                noms[i] = noms[i+1];
            }
            System.out.println("index [" + i + "] - " + noms[i]);
        }
        noms[noms.length-1] = "";
        return noms;
    }

    public static void main(String[] args) {

        boolean nomList = false;
		String noms[] = {"Guillaume", "Lucie", "Nathalie", "Xavier", "Antoine", "Hippolyte", "Rebecca", "Bangaly", "Fanny", "Kissangou",
				"Lucas", "Pierre", "David", "Nicolas", "Stefan"};

        AfficherListNoms(noms);
		System.out.println("Saisir un prenom : ");

		Scanner clavier= new Scanner(System.in);
		String saisie = clavier.nextLine();
		clavier.close();

		nomList = trouverNom(noms, saisie);
		if(nomList) {
			enleverNom(noms, saisie);
		} else {
			System.out.println("Le prenom " + saisie + " n'est pas dans la liste.");
		}
    }
}
