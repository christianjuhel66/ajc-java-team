package antoinecoquelet;

/*
Le Singleton: patron de conception de création qui s’assure de l’existence d’un seul objet de son genre.
Il fournit un unique point d’accès vers cet objet.
*/

public class ExerciceSingleton {

    public static final class Singleton {

        //Variables
        private static Singleton instance;
        public String value;

        //Constructeur
        private Singleton(String value) {
            this.value = value;
        }

        //Getter
        public static Singleton getInstance(String value) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

    public static void main(String[] args) {

        System.out.println("Si je récupère la même valeur, le Singleton est réutilisé (GOOD).");
        System.out.println("Si j'ai deux résultats différents, création de deux Singleton (BAD).");
        Singleton singleton = Singleton.getInstance("Singleton");
        Singleton deuxiemeSingleton = Singleton.getInstance("Not a Singleton");
        System.out.println("Resultat: \n");
        System.out.println(singleton.value);
        System.out.println(deuxiemeSingleton.value);
    }
}
