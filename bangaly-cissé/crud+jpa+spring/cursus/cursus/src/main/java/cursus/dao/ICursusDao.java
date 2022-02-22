package cursus.dao;

import java.util.List;

import cursus.entites.Cursus;

public interface ICursusDao {
	
	public List<Cursus> lister();
	
	public void supprimerCursusId(long id);
	
	public void ajouterCursus(Cursus cursus);
	
	public Cursus rechercherParId(long id);
	
	public void miseAjourCursus(Cursus cursusAjour, long idCursusAmodifier);
	
}
