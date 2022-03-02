package com.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.formation.dao.DaoInterface;
import com.formation.entity.Cours;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Autowired
	private DaoInterface repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Cours("Java", 8));
		repo.save(new Cours("Git", 2));
		repo.save(new Cours("SQL", 6));
	}
}
