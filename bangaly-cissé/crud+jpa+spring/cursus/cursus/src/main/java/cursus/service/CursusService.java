package cursus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cursus.dao.ICursusDao;
import cursus.entites.Cursus;

@Service
@Transactional
public class CursusService implements ICursusService {
	
	@Autowired
	private ICursusDao cursusDao;
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
