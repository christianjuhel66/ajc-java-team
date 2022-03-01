package com.springcore.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.rest.model.Site;
import com.springcore.rest.service.SiteServiceInterface;

@RestController
@RequestMapping("/apirest")
public class SiteRestController {
	
	ArrayList<Site> sites = new ArrayList<Site>();
	
	@Autowired
	private SiteServiceInterface siteService;
	
	@GetMapping("/sites")
	public List<Site> findAll() {
		return siteService.findAll(); 
	}
	
	@GetMapping("/sites/{id}")
	public Site siteById(@PathVariable(name="id") Long siteId) {
		return siteService.findById(siteId); 
	}
	
	@PostMapping("/sites")
	public Long addSite(@RequestBody Site site) {
		return siteService.save(site); 
	}
	
	@PostMapping("/sites/saveall")
	public ArrayList<Site> addSiteArray(@RequestBody ArrayList<Site> sites) {
		return siteService.saveall(sites); 
	}
	
	@PutMapping("/sites/{id}")
	public Site updateSite(@PathVariable(name="id") Long siteId, @RequestBody Site site) {
		siteService.findById(siteId);
		siteService.save(site); 
		return site;
	}
	
	@DeleteMapping("/sites/{id}")
	public void deleteSiteById(@PathVariable(name="id") Long siteId) {
		siteService.deleteById(siteId);
	}
}
