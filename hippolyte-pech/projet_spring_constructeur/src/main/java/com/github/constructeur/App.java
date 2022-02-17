package com.github.constructeur;

import com.github.constructeur.entities.Contrat;
import com.github.constructeur.entities.Devis;
import com.github.constructeur.entities.Facture;
import com.github.constructeur.entities.personnes.Artisan;
import com.github.constructeur.entities.personnes.Plombier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Plombier artisan = context.getBean("artisan_plombier", Plombier.class);

        System.out.println(artisan.toString());

        //Devis devisTest = context.getBean()

        Devis devis = context.getBean("devis_maison", Devis.class);

        System.out.println(devis.getConstruction().toString());

        //TODO Injection de dépendance, création d'un devis via le context xml avec les bon paramètres, et on affiche le devis

        Contrat contrat = context.getBean("testContrat",Contrat.class);
        System.out.println(contrat.toString());

        contrat.afficherFacture();

    }
}
