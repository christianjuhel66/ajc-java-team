import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExerciceSix {
    public static void main(String[] args) {

        int[] firstArr;
        firstArr = new Random().ints(10, 1, 10).toArray();
        System.out.println(Arrays.toString(firstArr));

        // On convertit le tableau en liste
        List<Integer> listFirstArr = IntStream.of(firstArr).boxed().collect(Collectors.toList());

        // On convertit la liste en stream
        Stream<Integer> listToStream = listFirstArr.stream();
        //listToStream.forEach(System.out::print);

        // On trie par ordre décroissant le flux
        Stream<Integer> streamSorted = listToStream.sorted(Comparator.reverseOrder());
        //streamSorted.forEach(System.out::print);

        // On convertit le flux en tableau
        firstArr = streamSorted.mapToInt(x -> x).toArray();
        System.out.println(Arrays.toString(firstArr));

    }
}
