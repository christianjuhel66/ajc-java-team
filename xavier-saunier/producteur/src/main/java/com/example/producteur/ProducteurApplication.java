package com.example.producteur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.producteur.crud.dao.DaoInterface;
import com.example.producteur.entity.Producteur;

//démarrage application SpringBoot
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
//solution à l'erreur "failed to configure datasource:'url' attribute is not specified and no embedded datasource could be configured"
public class ProducteurApplication {

    public static void main(String[] args) {
	SpringApplication.run(ProducteurApplication.class, args);
    }

    @Autowired
    private DaoInterface repo;

    public void run(String... args) throws Exception {
	repo.save(new Producteur("Chez Guigui", "06xxxxxxx", "Rambouillet", "charcuterie", true));
    }

}
