package antoinecoquelet;

import java.util.Scanner;

/*
Little IF / ELSE STATEMENT
*/

public class ExerciceIfElse {

    public static void main (String[] ags){

        int price = 0;

        System.out.println("Are you a kid ? true / false");
        Scanner kid = new Scanner(System.in);
        boolean isKid = kid.nextBoolean();

        System.out.println("Are you registered ? true / false");
        Scanner registered = new Scanner(System.in);
        boolean isRegistered = registered.nextBoolean();

        if(isKid){
            price = 6;
            System.out.println("I'm a kid :)");
        } else {
            price = 10;
            System.out.println("I'm not a kid.");
        }
        if(!isRegistered){
            price += 2;
            System.out.println("The ticket is " + price + "$ for the non-registered clients");
        } else {
            System.out.println("The ticket is " + price + "$ for our registered clients");
        }
    }
}
