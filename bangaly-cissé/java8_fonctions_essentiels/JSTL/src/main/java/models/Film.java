package models;

public class Film {
	
	private String titre;
	private String realisateur;
	private int duree;
	private boolean estVu;
	
	public Film() {
		
	}
	
	public Film(String titre, String realisateur, int duree, boolean estVu) {

		this.titre = titre;
		this.realisateur = realisateur;
		this.duree = duree;
		this.estVu = estVu;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public boolean isEstVu() {
		return estVu;
	}
	public void setEstVu(boolean estVu) {
		this.estVu = estVu;
	}
	
}
