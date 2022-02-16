package com.github.doublons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = random.ints(1, 11).limit(10).boxed().collect(Collectors.toList());
        //List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 6, 6, 6, 7, 7, 7, 8, 8, 9, 10);
        System.out.println(integerList.toString());

        integerList.sort(null);

        System.out.println(integerList.toString());

        int currentValueToCompare = integerList.get(0);
        int cpt = 0;

        for (int i = 0; i < integerList.size(); i++) {
            int current = integerList.get(i);
            if (current == currentValueToCompare) {
                cpt++;
            }
            if (current != currentValueToCompare) {
                //différent, on affiche
                System.out.println(currentValueToCompare + " " + cpt);
                cpt = 0;
                currentValueToCompare = current;
            }
        }
        
        
        /*
        for (int i = 1; i < integerList.size(); i++) {
            int current = integerList.get(i);
            if (current == currentValueToCompare) {
                cpt++;
                continue;
            }
            if (i == integerList.size() - 1 || current != currentValueToCompare) {
                System.out.println("Le nombre " + currentValueToCompare + " est présent " + cpt + " fois dans la liste. " + i);
                cpt = 1;
                currentValueToCompare = current;
            }

            if(current != currentValueToCompare && i == integerList.size() -1){
                System.out.println("Le nombre " + currentValueToCompare + " est présent " + cpt + " fois dans la liste. " + i);
                cpt = 1;
                System.out.println(current + " "+ 1);
            }


            /*if(i == integerList.size() - 1){
                cpt = 1;
                System.out.println("Le nombre " + currentValueToCompare + " est présent " + cpt + " fois dans la liste. " + i);
            }*/
        //}
    }
}
