package com.github.letter_present;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase ou un mot: ");
        String word = scanner.next();

        System.out.println(word);

        System.out.println("Entrez le caractère à chercher: ");
        char character = scanner.next().charAt(0);

        boolean isCharFound = false;
        int i = 0;
        while (!isCharFound && i < word.length()) {
            if (word.charAt(i) == character) {
                isCharFound = true;
            }
            i++;
        }

        if (isCharFound) {
            System.out.println("Le caractère '" + character + "' EST présent dans le mot (ou la phrase) '" + word + "'");
        } else {
            System.out.println("Le caractère '" + character + "' N'EST PAS présent dans le mot (ou la phrase) " + word + "'");
        }
    }
}
