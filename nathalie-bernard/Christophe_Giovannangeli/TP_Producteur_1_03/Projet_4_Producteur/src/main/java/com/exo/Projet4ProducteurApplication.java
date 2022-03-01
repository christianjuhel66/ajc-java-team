package com.exo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exo.dao.DaoProducteurInterface;
import com.exo.dao.DaoProduitInterface;
import com.exo.entities.Producteur;
import com.exo.entities.Produit;

@SpringBootApplication
public class Projet4ProducteurApplication{

	public static void main(String[] args) {
		SpringApplication.run(Projet4ProducteurApplication.class, args);
	}

}
