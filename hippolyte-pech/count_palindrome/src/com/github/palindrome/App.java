package com.github.palindrome;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        /*System.out.println(isPalindrome("Kayak"));
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("Pomme"));
        System.out.println(isPalindrome("bob"));*/

        List<String> wordList = new ArrayList<>();
        wordList.add("Kayak");
        wordList.add("Pomme");
        wordList.add("kAyAK");
        wordList.add("Ressasser");
        wordList.add("                  Ressasser         ");
        wordList.add("supercalifragilisticexpialidocious");
        wordList.add("123456789987654321"); // fonctionne aussi avec des nombres !

        for (String s : wordList) {
            if (isPalindrome(s)) {
                System.out.println("Le mot " + s + " EST un palindrome !");
            } else {
                System.out.println("Le mot " + s + " N'EST PAS un palindrome !");
            }
        }
    }

    /**
     * Teste si le mot passé en paramètre est un palindrome, la fonction n'est pas sensible à la case et aux espaces
     * blanc en début et en fin du mot.
     *
     * @param word Le mot à tester
     * @return Retourne true si le mot word est un palindrome
     */
    public static boolean isPalindrome(String word) {
        String trimedWord = word.toLowerCase().trim();

        int cpt1 = 0;
        int cpt2 = trimedWord.length() - 1;
        boolean value = false;

        // boucle sur le mot, on arrête de boucler si les deux lettres ne sont pas les mêmes
        while (trimedWord.charAt(cpt1) == trimedWord.charAt(cpt2) && cpt1 < cpt2) {
            cpt1++;
            cpt2--;
        }

        // On vérifie si la boucle s'est arrêté à cause d'un caractère différent ou si le mot est bien un palindrome
        if (cpt1 == cpt2 || cpt1 > cpt2) {
            value = true;
        }

        return value;
    }

}
