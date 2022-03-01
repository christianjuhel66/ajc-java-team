package ajc.tourisme.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ajc.tourisme.entity.Site;
import ajc.tourisme.service.SiteServiceInterface;

@RestController
@RequestMapping("/api")
public class SiteRestController {

	@Autowired
	private SiteServiceInterface siteService;
	
	// read
	@GetMapping("/sites")
	public List<Site> getAllSites() {
		
		List<Site> sites = new ArrayList<>();
		sites = siteService.findAll();
		return sites;
	}
	
	@GetMapping("/site/{id}")
	public Site getSite(@PathVariable(name = "id") Long Id) {

		Site site = siteService.getSiteById(Id);
		return site;
	}
	
	// create
	@PostMapping("/site")
	public Site addSite(@RequestBody Site site) {
		
		siteService.addSite(site);
		return site;
	}
	
	// update
	@PutMapping("/site/{id}")
	public Site updateSite(@PathVariable(name= "id") Long SiteId, @RequestBody Site site) {
		
		siteService.updateSite(SiteId, site);
		return site;
	}
	
	// delete
	@DeleteMapping("/site/{id}")
	public String deleteById(@PathVariable(name = "id") Long id) {
		
		return siteService.delete(id);		
	}
}
