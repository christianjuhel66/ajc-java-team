import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciceDeux {
    public static void main(String[] args) {
        //On déclare et initialise les 2 tableaux grâce à Random
        int[] firstArr, secondArr;
        firstArr = new Random().ints(10, 1, 10).toArray();
        secondArr = new Random().ints(10, 1, 10).toArray();

        // 2) afficher le contenu de ces deux tableaux élément par élément
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));

        // 3) calculer et afficher le nombre de valeurs communes à ces deux tableaux
        List<Integer> listFirstArr = IntStream.of(firstArr).boxed().collect(Collectors.toList());
        List<Integer> listFirstArrCopy = IntStream.of(firstArr).boxed().collect(Collectors.toList());
        List<Integer> listSecondArr = IntStream.of(secondArr).boxed().collect(Collectors.toList());

        listFirstArrCopy.retainAll(listSecondArr);
        System.out.println(listFirstArrCopy + " Il y a " + listFirstArrCopy.size() + " chiffres en commun.");

        // 4) si une valeur est présente dans les deux tableaux et qu'elle est aussi présente plusieurs fois dans l'un
        // ou dans les deux tableaux, elle n'est comptée qu'une seule fois
        List<Integer> listDistinctFirstArr = IntStream.of(firstArr).boxed().distinct().collect(Collectors.toList());
        List<Integer> listDistinctSecondArr = IntStream.of(secondArr).boxed().distinct().collect(Collectors.toList());

        listDistinctFirstArr.retainAll(listDistinctSecondArr);
        System.out.println(listDistinctFirstArr + " Il y a " + listDistinctFirstArr.size() + " chiffres en commun sans compter les doublons.");
    }
}
