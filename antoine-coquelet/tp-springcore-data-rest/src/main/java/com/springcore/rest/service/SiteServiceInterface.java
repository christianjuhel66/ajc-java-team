package com.springcore.rest.service;

import java.util.List;

import com.springcore.rest.model.Site;

public interface SiteServiceInterface {
	
	public List<Site> findAll();

	public Site findById(Long id);

	public Long save(Site site);
	
	public void deleteById(Long id);

}
