package antoinecoquelet;

/*
 * afficher la banniere
 *
 *************************************
 **                                 **
 **     BIENVENUE AUX JAVAISTES     **
 **                                 **
 *************************************
 *
*/

public class ExerciceBanniere   {

    public static void afficherBanniere(char etoile, int Largeur, int longueur, String texte) {
        int position = 0;

        for(int i = 0; i < longueur; i++) {
            for(int j = 0; j < Largeur; j++) {
                if(i == longueur-1 || i == 0 || j == Largeur-1 || j == 0 || j == Largeur-2 || j == 1)
                    System.out.print(etoile);
                else if(i == longueur/2 && j > (Largeur/2 - texte.length()/2) && position < texte.length()) {
                    System.out.print(texte.charAt(position));
                    position++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String texte = "BIENVENUE DANS LE MONDE JAVA";
        afficherBanniere('*', 60, 5, texte);
    }
}
