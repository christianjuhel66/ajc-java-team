package com.tp.formation;

import com.tp.formation.dao.DaoInterface;
import com.tp.formation.entity.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpCursusFormationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpCursusFormationApplication.class, args);
	}

	@Autowired
	private DaoInterface repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Cours("Java", 8));
		repo.save(new Cours("Git", 3));
		repo.save(new Cours("Spring", 7));
	}
}
