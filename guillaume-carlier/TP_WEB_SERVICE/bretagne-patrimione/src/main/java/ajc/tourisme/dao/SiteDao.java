package ajc.tourisme.dao;

import java.util.List;

import ajc.tourisme.entity.Site;

public interface SiteDao {
	
	// Create
	public String create(Site site);
	
	// Read
	public Site getOneById(Long id);
	public List<Site> findAll();

	// Update
	public Site updateById(Long id, Site site);
	
	// Delete
	public String deleteById(Long id); 
}
