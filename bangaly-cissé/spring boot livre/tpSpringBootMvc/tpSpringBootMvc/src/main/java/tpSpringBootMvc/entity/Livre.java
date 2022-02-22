package tpSpringBootMvc.entity;

public class Livre {
	// a)
	private String titre;
	private String auteur;
	private Integer prix;
	// b)
	private String editeur;
	// c)
	private String edition;
	// d) 
	private String[] genre;
	
	public String getTitre() {
		return titre;
	}
	
	public Livre() {
		
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String[] getGenre() {
		return genre;
	}

	public void setGenre(String[] genre) {
		this.genre = genre;
	}
	
	
}
