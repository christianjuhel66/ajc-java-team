package com.projet.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projet.crud.Entity.Producteur;
import com.projet.crud.dao.DaoInterface;

@SpringBootApplication
public class ProducteursLocauxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProducteursLocauxApplication.class, args);
	}

	@Autowired
	private DaoInterface dao;

	@Override
	public void run(String... args) throws Exception {
		dao.save(new Producteur("Bertrand", "0321654989", "Poissy", "fraise", true));
		dao.save(new Producteur("Lemoine", "0345698712", "Rambouillet", "blé", false));
		dao.save(new Producteur("Moineau", "0134978530", "Villiers-le-Mahieu", "boeuf", true));
	}
}
