package com.demo;

import java.util.Scanner;

/**
 * @Author: LE METAYER Nicolas
 */
public class Test {
    public static void main (String[] ags){
        int prix = 0;
        boolean estEnfant;
        boolean estEnregistre;
        System.out.println("Etes-vous un enfant ? (false/true)");
        Scanner scan = new Scanner(System.in);
        estEnfant = scan.nextBoolean();

        System.out.println("Etes-vous enregistré ? (false/true)");
        estEnregistre = scan.nextBoolean();

        if(estEnregistre){
            prix = 6;
        } else {
            prix = 10;
        }
        if(!estEnregistre){
            prix += 2;
            System.out.println("Le ticket coûte " + prix);
        } else {
            System.out.println("Le ticket coûte " + prix);
        }
    }
}
