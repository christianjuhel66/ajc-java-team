import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExerciceDix {
    public static void main(String[] args) {

        // On initialise un tableau de 15 valeurs aléatoires entre 1 et 8
        int[] firstArr;
        firstArr = new Random().ints(15, 1, 8).toArray();
        System.out.println(Arrays.toString(firstArr));

        // On convertit en liste
        List<Integer> listFirstArr = IntStream.of(firstArr).boxed().collect(Collectors.toList());

        // On affiche combien de fois chaque chiffre apparait
        Set<Integer> mySet = new HashSet<Integer>(listFirstArr);

        for(Integer i: mySet){
            System.out.println("Le chiffre " + i + " apparait " + Collections.frequency(listFirstArr,i) + " fois.");
        }
    }
}
