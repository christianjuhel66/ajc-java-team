package ajc.tourisme.controller;

import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ajc.tourisme.dao.ImageDao;
import ajc.tourisme.dao.SiteDao;
import ajc.tourisme.entity.Image;
import ajc.tourisme.entity.Site;


@RestController
public class SiteController {

	@Autowired
	private SiteDao sitedao;
	
	@Autowired
	private ImageDao imgdao;
	
	@GetMapping("/create")
	public void create(Site site)  {
		
		Image img = new Image("C:/Users/guill/Project dev/SpringBoot/bretagne-patrimione/src/main/resources/images/abers.jpg"); 
		imgdao.createImg(img);
		
		Site site0 = new Site("La Pointe du Raz", 48.04044689856586, -4.740566588085365, "Patrimoine");
		Site site1 = new Site("Megalithes de Carnac", 47.597148075005435, -3.082555006445388, "Naturel");
		Site site2 = new Site("Les Abers", 48.609738892326774, -4.507953735945046, "Patrimoine", img);
		Site site3 = new Site("Presqu'Ile de Quiberon", 47.47573319024512, -3.1303239641453793, "Naturel");
		Site site4 = new Site("Chateau de Concarneau", 47.87508942241336, -3.9158077676534244, "Patrimoine");
		Site site5 = new Site("Foret de Brocéliande", 48.04106118625665, -2.096624729584082, "Naturel");
		Site site6 = new Site("Mont Saint Michel", 48.637176859807624, -1.511865672936319, "Patrimoine");

		sitedao.create(site);
		sitedao.create(site0);
		sitedao.create(site1);
		sitedao.create(site2);
		sitedao.create(site3);
		sitedao.create(site4);
		sitedao.create(site5);
		sitedao.create(site6);
	}
	
	@GetMapping("/allsite")
	public String findAll() {
		
		List<Site> sites = sitedao.findAll();
		String result ="<table><tr><td>Nom</td><td>Longitude</td><td>Latitude</td><td>Type</td>";
		
		for (Site site : sites) {
			result += "<tr><td>" + site.getNom() + "</td><td>" + site.getLongitude() + "</td><td>" + site.getLatitude() + "</td><td>" +site.getType() + "</td>";
		}
		
		result += "</table>";
		return result;
	}
	
	@GetMapping("/onesite")
	public String getOneById(Long id) {
		System.out.println(Paths.get("abers.jpg"));
		
		Site site = sitedao.getOneById(4L);
		return "<table><tr><td>Nom</td><td>Longitude</td><td>Latitude</td><td>Type</td>" + "<tr><td>" + site.getNom() + "</td><td>" + site.getLongitude() + "</td><td>" + site.getLatitude() + "</td><td>" + site.getType() + "</td></table>";
	}
	
	@GetMapping("/update")
	public String updateById() {
		String nom = "Chateau des ducs de Bretagne";
		double longitude = 2.3684324;
		double latitude = -5.9999995;
		String type = "Patrimoine";
		Site site = sitedao.updateById(1L, nom, longitude, latitude, type);
		return "<table><tr><td>Nom</td><td>Longitude</td><td>Latitude</td><td>Type</td>" + "<tr><td>" + site.getNom() + "</td><td>" + site.getLongitude() + "</td><td>" + site.getLatitude() + "</td><td>" + site.getType() + "</td>";
	}
	
	@GetMapping("/delete")
	public String deleteById(Long id) {
		
		sitedao.deleteById(5L);
		return "<h1>Le Site a été supprimé </h1>" ;		
	}



}
