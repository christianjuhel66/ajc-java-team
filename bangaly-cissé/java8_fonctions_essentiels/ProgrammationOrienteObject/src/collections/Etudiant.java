package collections;

public class Etudiant {

	private String nom;
	private String prenom;
	private boolean joueurQuidditch;

	public Etudiant(String nom, String prenom, boolean joueurQuidditch ) {
		this.nom = nom;
		this.prenom = prenom;
		this.joueurQuidditch = joueurQuidditch;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public boolean isJoueurQuidditch() {
		return this.joueurQuidditch;
	}

	public String getPrenomNom() {
		return this.prenom + " " + this.nom;
	}

}
