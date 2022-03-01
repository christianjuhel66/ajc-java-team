package cursusRestController.service;

import java.util.List;

import cursusRestController.entites.Cursus;



public interface ICursusRestControllerService {

	public List<Cursus> lister();

	public void supprimerCursusId(long id);

	public void ajouterCursus(Cursus cursus);

	public Cursus rechercherParId(long id);

	public void miseAjourCursus(Cursus cursusAjour, long idCursusAmodifier);

}
