package exo.banner;

/*
* Auteur: BADIA Fanny
* Enoncé: Ecrivez la procédure qui affiche la bannière suivante :
*   	 **********************************************************************
*	     **                                                                  **
*	    **                      BIENVENUE  AUX JAVAISTES                    **
*	    **                                                                  **
*	    **********************************************************************
*/


public class DisplayBanner {
    public static void main(String[] args) {
        // Méthode 01:
        // Utilisation de la méthode d'affichage dans le terminal:

        /* System.out.println(
                "\t *************************************************************************\n" +
                "\t **                                                                     ** \n" +
                "\t **                         BIENVENUE AUX JAVANISTES                    ** \n" +
                "\t **                                                                     ** \n" +
                "\t *************************************************************************");
         */

            /*
            Méthode 02:
            La bannière est dessinée par 5 lignes en hauteur & 70 charactères en largeur
            i = lignes
            j = nb de caractères
             */
            int i = 0;                                      // i = numéro de la ligne
            while (i < 5) {                                 // boucle pour limiter le nombre de ligne à 5
                switch (i) {
                    case 0:                                 // pour la ligne 01
                        for (int j = 0; j < 72; j++) {      // Itération pour l'affichage de j
                            System.out.print("*");
                        }
                        break;
                    case 1:                                 // pour la ligne 02
                        for (int j = 0; j < 70; j++) {
                            if (j == 0 ) {
                                System.out.print("\n**");
                            } else if (j == 69) {
                                System.out.print("**");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        break;
                    case 2:                                 // pour la ligne 03
                        for (int j = 0; j < 70; j++) {
                            if (j == 0) {
                                System.out.print("\n**");
                            } else if (j == 23) {
                                System.out.print("BIENVENUE AUX JAVANISTES");
                            } else if (j == 46)
                                System.out.print("**");
                            else {
                                System.out.print(" ");
                            }
                        }
                        break;
                    case 3:                                 // pour la ligne 04
                        for (int j = 0; j < 70; j++) {      // itération pour lire la valeur de j pdt 71 fois
                            if (j == 0 ) {                  // test de la valeur pour afficher ** si le pointeur est sur le 1er caractère
                                System.out.print("\n**");
                            } else if (j == 69) {
                                System.out.print("**");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        break;
                    case 4:                                 // ligne 05
                        for (int j = 0; j < 72; j++) {
                            if (j == 0 ) {
                                System.out.print("\n*");
                            } else {
                                System.out.print("*");
                            }
                        }
                        break;
                }
                i = i + 1;
            }

    }
}