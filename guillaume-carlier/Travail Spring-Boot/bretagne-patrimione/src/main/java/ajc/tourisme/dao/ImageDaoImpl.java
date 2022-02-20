package ajc.tourisme.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ajc.tourisme.entity.Image;

@Repository
public class ImageDaoImpl implements ImageDao {

	@Autowired
	private EntityManager em;
	
	@Override
	@Transactional
	public void createImg(Image img) {
		Session session = em.unwrap(Session.class);
		em.persist(img);
	}

}
