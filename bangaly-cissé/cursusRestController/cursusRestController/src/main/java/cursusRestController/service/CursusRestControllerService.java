package cursusRestController.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cursusRestController.dao.ICursusRestControllerDao;
import cursusRestController.entites.Cursus;


@Service
@Transactional
public class CursusRestControllerService implements ICursusRestControllerService {
	@Autowired
	private ICursusRestControllerDao cursusDao;
	@Override
	public List<Cursus>lister() {
		return cursusDao.lister();
	}
	@Override
	public void supprimerCursusId(long id) {
		cursusDao.supprimerCursusId(id);
		
	}
	@Override
	public void ajouterCursus(Cursus cursus) {
		cursusDao.ajouterCursus(cursus);
		
	}
	@Override
	public Cursus rechercherParId(long id) {
		return cursusDao.rechercherParId(id);
	}
	@Override
	public void miseAjourCursus(Cursus cursusAjour, long idCursusAmodifier) {
		cursusDao.miseAjourCursus(cursusAjour, idCursusAmodifier);
		
	}


}
