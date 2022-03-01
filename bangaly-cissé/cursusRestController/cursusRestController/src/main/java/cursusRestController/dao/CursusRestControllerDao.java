package cursusRestController.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cursusRestController.entites.Cursus;

@Repository
@Transactional
public class CursusRestControllerDao implements ICursusRestControllerDao{

	@Autowired
	private EntityManager em;

	public List<Cursus>lister(){
		List<Cursus> cursus = null;
		cursus = em.createQuery("from Cursus",Cursus.class)
				.getResultList();				

		return cursus;

	}

	@Override
	public void supprimerCursusId(long id) {
		Query query = em.createQuery("delete  from Cursus where id=:cursusId");
		query.setParameter("cursusId", id);
		query.executeUpdate();

	}

	@Override
	public void ajouterCursus(Cursus cursus) {
		em.merge(cursus);

	}

	@Override
	public Cursus rechercherParId(long id) {
		return em.find(Cursus.class, id);
	}

	@Override
	public void miseAjourCursus(Cursus cursusAjour, long idCursusAmodifier) {
		Query query =em.createQuery("update Cursus as c "
				+ "set c.nom  = :nom "
				+ "where c.id = :cursusId");
		query.setParameter("cursusId", idCursusAmodifier);
		query.setParameter("nom", cursusAjour.getNom());
		query.executeUpdate();

	}

}



