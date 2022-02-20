package antoinecoquelet;

/*
* 1) Convertir un nombre de type int en Integer
*
* 2) Verifier si une lettre est contenue dans un mot
*/

public class ExerciceExtras {

    // int type -> conversion -> Integer type
    public static Integer conversion(int nombre) {
        Integer integer = nombre;
        return integer;
    }

    public static void main(String[] args) {

        // Integer conversion
        System.out.println("exercice 1");
        Integer nombre = conversion(7);
        System.out.println("Type int converti en Integer : " + nombre);

        // Lettre dans un mot
        System.out.println("exercice 2");
        String mot = "stylographique";
        char lettre = 'c';
        if(mot.indexOf(lettre) != -1) {
            System.out.println("La lettre " + lettre + " est contenue dans le mot " + mot);
        } else {
            System.out.println("La lettre " + lettre + " n'est pas contenue dans le mot " + mot);
        }
    }
}
