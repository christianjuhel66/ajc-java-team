package antoinecoquelet.entity;

/*
Créer une classe Etudiant avec les attributs suivants :
        - String nom
        - String prenom
        - boolean joueurQuidditch
        écrire le constructeur avec tous ces attributs en paramètres.
        écrire les accesseurs et les mutateurs
        écrire la fonction getPrenomNom qui retournera la concaténation du prénom et du nom.
*/

public class Etudiant {

    private String nom;
    private String prenom;
    private boolean joueurQuidditch;

    public Etudiant(String nom, String prenom, boolean joueurQuidditch) {
        this.nom = nom;
        this.prenom = prenom;
        this.joueurQuidditch = joueurQuidditch;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isJoueurQuidditch() {
        return joueurQuidditch;
    }

    public void setJoueurQuidditch(boolean joueurQuidditch) {
        this.joueurQuidditch = joueurQuidditch;
    }

    public String getPrenomNom(){
        return prenom + " " + nom;
    }
}
