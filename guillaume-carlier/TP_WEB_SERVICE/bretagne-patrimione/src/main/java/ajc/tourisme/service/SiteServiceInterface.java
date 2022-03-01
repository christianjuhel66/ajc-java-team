package ajc.tourisme.service;

import java.util.List;
import ajc.tourisme.entity.Site;

public interface SiteServiceInterface {

	// create
	public Site addSite(Site site);
	
	// Read
	public List<Site> findAll();
	
	public Site getSiteById(Long id);
	
	// Update
	public Site updateSite(Long id, Site site); 
	
	// delete
	public String delete(Long id);
}

