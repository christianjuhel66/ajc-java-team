package antoinecoquelet;

/*
 * convertir un tableau de int en une liste d'Integer
 * convertir une liste d'Integer en un flux d'Integer
 * trier le flux par ordre decroissant
 * reconvertir en un tableau
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciceSortArray {

    // creer un tableau de nombres aleatoires entre 0 et max random
    public static int[] createRandomArray(int max, int length) {
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max + 1);
        }
        return array;
    }

    // afficher le tableau
    public static void afficher(int tab[]) {
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    // afficher la liste
    public static void afficherListe(List<Integer> liste) {
        for(int val : liste) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

        int[] array = createRandomArray(10, 10);
        System.out.println("Unordered Tab : ");
        afficher(array);

        // convertir tableau de int en liste d'Integer
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        // convertir liste d'Integer en flux d'Integer
        Stream<Integer> stream = list.stream();

        // flux par ordre decroissant -> liste
        list = stream.sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("\nOrdered descending Flux : ");
        afficherListe(list);

        // list en Array
        int[] array3 = new int[list.size()];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = list.get(i);
        }
        System.out.println("\nOrdered Tab from List : ");
        afficher(array3);
    }
}
