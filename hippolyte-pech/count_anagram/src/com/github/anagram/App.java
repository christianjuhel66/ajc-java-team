package com.github.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("GUERISON");
        wordList.add("TEST");
        wordList.add("SOIGNEUR");
        wordList.add("ESTT");

        int cpt = 0;
        for (int i = 0; i < wordList.size(); i++) {
            String currentWord = wordList.get(i);
            for (int j = i + 1; j < wordList.size(); j++) {
                if (isAnagram(wordList.get(i), wordList.get(j))) {
                    cpt++;
                }
            }
        }
        System.out.println("Il y a " + cpt + " anagrammes dans la liste.");
    }

    public static boolean isAnagram(String word1, String word2) {
        String formatedWord1 = word1.toLowerCase().trim();
        String formatedWord2 = word2.toLowerCase().trim();

        if (formatedWord1.length() != formatedWord2.length()) {
            return false;
        }

        char[] tab = formatedWord1.toCharArray();
        char[] tab2 = formatedWord2.toCharArray();

        Arrays.sort(tab);
        Arrays.sort(tab2);

        int i = 0;
        while (i < tab.length) {
            if (tab[i] != tab2[i]) {
                return false;
            }
            i++;
        }

        return true;
    }
}
