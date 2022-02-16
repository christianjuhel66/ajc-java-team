package demo.unidirectionnel.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	private String prenom;

	// private List<Utilisateur> followers;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "abonnement_id")
	private Abonnement abonnement;

	public Utilisateur() {
	}

	public Utilisateur(String nom, String prenom, Abonnement abonnement) {
		this.nom = nom;
		this.prenom = prenom;
		this.abonnement = abonnement;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	/*
	 * public List<Utilisateur> getFollowers() { return followers; }
	 * 
	 * public void setFollowers(List<Utilisateur> followers) { this.followers =
	 * followers; }
	 */
	public Abonnement getAbonnement() {
		return abonnement;
	}

	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}

	public void addFollow(Utilisateur user) {

	}

}
