package ajc.tourisme.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ajc.tourisme.entity.Site;

@Repository
public class SiteDaoImpl implements SiteDao {

	@Autowired
	private EntityManager em;
	
	@Override
	@Transactional
	public String create(Site site) {
		em.persist(site); 
		return "Site créé!";
	}

	@Override
	@Transactional
	public Site getOneById(Long id) {

		Session session = em.unwrap(Session.class);
		Site site = session.get(Site.class, id);
		return site;
	}

	@Override
	@Transactional
	public List<Site> findAll() {
		Session session = em.unwrap(Session.class);
		Query<Site> query = session.createQuery("from Site", Site.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Site updateById(Long id, String nom, double lon, double lat, String type) {
		Session session = em.unwrap(Session.class);
		Site site = session.get(Site.class, id);
		site.setNom(nom);
		site.setLongitude(lon);
		site.setLatitude(lat);
		site.setType(type);
		session.saveOrUpdate(site);
		return site; 
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		Session session = em.unwrap(Session.class);
		Site site = session.get(Site.class, id);
		session.delete(site);
	}

}
