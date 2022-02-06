package antoinecoquelet;

import java.util.Arrays;
import java.util.Random;

/*
* Rechercher une valeur dans un tableau
* Definir un tableau d'elements de type entier contenant 15 elements.
* Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10.
* Imprimer les elements du tableau.
* Générer  une  valeur entière aleatoirement comprise entre 1 et 10.
* Rechercher cette valeur  dans le tableau en commencant par l'indice 0.
* Chaque fois que la valeur est trouvee dans le tableau , son indice s'affiche.
* Si la valeur entiere n'a pas ete trouvee dans le tableau , un message s'affiche.
* Sinon le nombre d'occurrences s'affiche.
*/

public class exerciceVariablesInArray {

    public static void main(String[] args) {
        //Definir un tableau d'elements de type entier contenant 15 elements.
        Integer[] array = new Integer[15];

        //Remplir ce tableau avec des valeurs aleatoires comprises entre 1 et 10.
        Random random = new Random();
        for(int i = 0; i < array.length;  i++){
            array[i] = random.nextInt((10 - 1) + 1) + 1;
        }
        //Puis imprimer les elements du tableau.
        System.out.println(Arrays.toString(array));

        //Générer  une  valeur entière aleatoirement comprise entre 1 et 10
        int randomNumber = (int)(Math.random() * 10) + 1;
        System.out.println("Nombre aleatoire : " + randomNumber);

        //Rechercher cette valeur dans le tableau
        if(Arrays.asList(array).contains(randomNumber)){

            //Chaque fois que la valeur est trouvee dans le tableau, son indice est affiche
            int duplicate = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(randomNumber)) {
                    duplicate++;
                    int index = i;
                    System.out.println("Index : " + i);
                }
            }
            //le nombre d'occurrences s'affiche.
            System.out.println("on a " + duplicate + " fois le nombre " + randomNumber);
        }else{
            //Si la valeur entiere n'a pas ete trouvee dans le tableau , un message est affiche
            System.out.println("Le nombre n'est pas de le tableau");
        }
    }
}
