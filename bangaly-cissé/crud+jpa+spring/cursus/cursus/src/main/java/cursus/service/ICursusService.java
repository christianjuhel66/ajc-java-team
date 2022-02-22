package cursus.service;

import java.util.List;

import cursus.entites.Cursus;

public interface ICursusService {

	public List<Cursus> lister();
	
	public void supprimerCursusId(long id);
	
	public void ajouterCursus(Cursus cursus);
	
	public Cursus rechercherParId(long id);
	
	public void miseAjourCursus(Cursus cursusAjour, long idCursusAmodifier);
}
