package antoinecoquelet;

import antoinecoquelet.entity.Etudiant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciceStudent {
    public static void main(String[] args) {

        /*
        Créer les étudiants :
        - Harry Potter, joueur de quidditch
        - Ron Weasley, non joueur de quidditch
        - Hermione Granger, non joueuse de quidditch
        - Drago Malefoy, joueur de quidditch
        */

        Etudiant student1 = new Etudiant("Potter", "Harry", true);
        Etudiant student2 = new Etudiant("Weasley", "Ron", false);
        Etudiant student3 = new Etudiant("Granger", "Hermione", false);
        Etudiant student4 = new Etudiant("Malefoy", "Drago", true);

        List<Etudiant> studentList = new ArrayList<Etudiant>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        //Afficher le nom et le prénom de tous les étudiants.
        for(Etudiant student : studentList){
            System.out.println(student.getPrenomNom());
        }
        System.out.println("-------------------");

        //Afficher le nom et le prénom de tous les joueurs de quidditch.
        for(Etudiant student : studentList){
            if(student.isJoueurQuidditch() == true){
                System.out.println("Players : " + student.getNom() + " " + student.getPrenom());
            }
        }
        System.out.println("-------------------");

        //Retirer de la liste tous les non joueurs de quidditch.
        Iterator<Etudiant> iterator = studentList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().isJoueurQuidditch() == false){
                iterator.remove();
            }
        }
        for(Etudiant student : studentList){
            System.out.println(student.getPrenomNom());
        }
        System.out.println("-------------------");

        //Vérifier si la liste des étudiants est non vide.
        if(studentList == null){
            System.out.println("student List est null");
        } else if (studentList.isEmpty()){
            System.out.println("Il n'y a pas d'éléments dans cette liste");
        } else {
            System.out.println("Il y a des éléments dans la liste");
        }

        //Vérifier si la liste des étudiants ne contient plus l'étudiant Ron Weasley, créé précédemment.
        System.out.println(studentList.contains(student2));
        System.out.println("Student " + student2.getPrenomNom() + " n'est plus dans la liste");
    }
}
