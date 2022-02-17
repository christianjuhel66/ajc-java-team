import java.util.Scanner;

public class ExerciceHuit {
    public static void main(String[] args) {

        // On récupère un mot
        System.out.println("Entrez un mot :");
        Scanner sc = new Scanner(System.in);
        String wordToFind = sc.next();

        // On récupère la lettre à trouver
        System.out.println("Entrez un caractère :");
        Scanner sc2 = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        // On affiche un message si la lettre est présente ou non dans le mot
        int index = wordToFind.indexOf(letter);
        if (index > 0) {
            System.out.println("La lettre " + letter + " est bien présente dans le mot " + wordToFind + ".");
        }
        else {
            System.out.println("La lettre " + letter + " n'est pas présente dans le mot " + wordToFind + ".");
        }
    }
}
