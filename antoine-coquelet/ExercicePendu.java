package antoinecoquelet;

import java.util.Scanner;
import java.util.Random;

class ExercicePendu{
    public static void main(String[] args){

        // tableau de mots
        String[] listMots = { "Bonjour", "Bonsoir", "Matin", "Midi", "Soir" };

        //Melanger les mots
        Random randomMot = new Random();
        int randomNum = randomMot.nextInt(5);

        //Choisir un mot aléatoir
        String mot = (listMots[randomNum]);
        mot = mot.toUpperCase();

        //remplacer le mot par des tirets
        String tiret = mot.replaceAll("[A-Z]", "_ ");

        //Start
        System.out.println("JOUEZ AU PENDU !");

        //Appel de la method jeux
        jeux(mot, tiret);
    }

    public static void jeux(String mot, String tiret)
    {
        Scanner input;
        input = new Scanner(System.in);
        int lettreGood = 0;
        int lettreFaux = 0;
        int essais = 10 - lettreFaux;
        String chaqueLettre;
        String lettres = "";
        char lettreUser;
        boolean dejaTrouve;
        boolean chaqueLettreMot;

        System.out.println("-- Vous avez 10 essais --");
        while (lettreFaux < 10 && tiret.contains("_")) {
            System.out.println(tiret + "\n");
            if (lettreFaux != 0) {
                System.out.println("Vous avez encore " + essais + " essais.");
            }
            System.out.print("Entrez une lettre:");
            //entrée utilisateur
            chaqueLettre = input.nextLine();

            //Passer en Majuscule
            chaqueLettre = chaqueLettre.toUpperCase();

            //premier char comme la lettre trouvée
            lettreUser = chaqueLettre.charAt(0);
            dejaTrouve = (lettres.indexOf(lettreUser)) != -1;//false
            lettres += lettreUser;
            lettreUser = Character.toUpperCase(lettreUser);

            if (dejaTrouve) {
                System.out.println("Vous avez déjà entré la lettre " + lettreUser + ". \n");
            }
            chaqueLettreMot = (mot.indexOf(lettreUser)) != -1;
            if (chaqueLettreMot) {
                System.out.println("La lettre " + lettreUser + " est bien dans le mot.");
                for (int position = 0; position < mot.length(); position++) {
                    if (mot.charAt(position) == lettreUser && tiret.charAt(position)!= lettreUser){
                        tiret = tiret.replaceAll("_ ", "_");
                        String changeTiret;
                        changeTiret = tiret.substring(0, position) + lettreUser + tiret.substring(position + 1);
                        changeTiret = changeTiret.replaceAll("_", "_ ");
                        tiret = changeTiret;
                    }
                }
            } else {
                System.out.println("La lettre " + lettreUser + " n'est pas dans le mot.");
                lettreFaux++;
            }
            lettreGood++;
        }
        if (lettreFaux == 10) {
            System.out.println("Perdu!");
        }
        else {
            System.out.print(
                    "Le mot était : " + tiret + "\nGagné !");
        }
    }
}
