import java.util.Arrays;
import java.util.Random;

public class ExerciceQuatre {
    public static void main(String[] args) {

        // On appelle la méthode callArray
        int[] arr = callArray();
        System.out.println(Arrays.toString(arr));

        // On génère une valeur aléatoirement comprise entre 1 et 10
        int nbToFind = new Random().nextInt(10) + 1;
        System.out.println("Le chiffre à trouver est : " + nbToFind);

        int compteur = 0;
        for (int i : arr) {
            if (i == nbToFind) {
                compteur++;
            }
        }
        if (compteur > 0) {
            System.out.println("Le chiffre " + nbToFind + " apparait " + compteur + " fois.");
        }
        else {
            System.out.println("Le chiffre " + nbToFind + " n'est pas présent dans le tableau.");
        }
    }

    public static int[] callArray() {
        // On génère un tableau de 15 éléments avec des valeurs aléatoires comprises entre 1 et 10 et on l'affiche
        return new Random().ints(15, 1, 10).toArray();
    }
}
