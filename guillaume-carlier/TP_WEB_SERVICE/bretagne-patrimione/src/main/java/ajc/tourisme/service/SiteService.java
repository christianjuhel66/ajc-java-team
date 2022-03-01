package ajc.tourisme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ajc.tourisme.dao.SiteDao;
import ajc.tourisme.entity.Site;

@Service
public class SiteService implements SiteServiceInterface {

	@Autowired
	private SiteDao siteDao;
	
	// read
	public List<Site> findAll() {
		
		List<Site> sites = siteDao.findAll();
		return sites;
	}

	@Override
	public Site getSiteById(Long id) {

		Site site = siteDao.getOneById(id); 
		return site;
	}

	// create
	@Override
	public Site addSite(Site site) {
		
		siteDao.create(site);
		return site;
	}
	
	// update
	@Override
	public Site updateSite(Long id, Site site) {
		site = siteDao.updateById(id, site);
		return site;
	}

	// delete
	@Override
	public String delete(Long id) {

		siteDao.deleteById(id);
		return "Site supprimé avec succés"; 
	}
}
