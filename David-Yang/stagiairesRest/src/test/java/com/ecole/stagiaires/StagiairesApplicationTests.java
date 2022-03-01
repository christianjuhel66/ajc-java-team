package com.ecole.stagiaires;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecole.stagiaires.dao.DaoImpl;
import com.ecole.stagiaires.entities.Stagiaire;
import com.ecole.stagiaires.metiers.ServiceDaoImpl;

@SpringBootTest
class StagiairesApplicationTests {
	/*
	@Autowired
	private ServiceDaoImpl dao;
	
	@Test
	@DisplayName("create Test")
	public void testcreate() 
	{
		dao.create(new Stagiaire("david", "Yang","rue de lyon",24));
		dao.create(new Stagiaire("julien", "Bonnet","rue de paris",24));
		dao.create(new Stagiaire("liam", "thuraire","rue de marseille",24));
	}
	
	@Test
	@DisplayName("findAll Test")
	public void testFindAll() 
	{
		System.out.println(dao.findAll().size());
		
		for (Stagiaire s : dao.findAll())
		{
			System.out.println(s.toString());
		}
	}

	@Test
	@DisplayName("read Test")
	public void testread() 
	{
		int id = 3;
		System.out.println(dao.read(id).toString());
	}
	
	@Test
	@DisplayName("update Test")
	public void updatetest() 
	{
		int id = 3; 
		dao.updateAdresse(id,"Vincennes");
	}
	
	@Test
	@DisplayName("update Test")
	public void deletetest() 
	{
		int id = 3; 
		dao.delete(id);
	}
	*/
}
