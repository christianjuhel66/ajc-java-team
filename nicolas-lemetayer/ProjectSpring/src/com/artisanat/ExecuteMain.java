package com.artisanat;

import com.artisanat.model.Charpentier;
import com.artisanat.model.Menuisier;
import com.artisanat.model.TailleurPierre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Vous êtes une agence de travaux
Vous devez gérer des artisans avec différents coprs de métiers.
Ces artisans doivent pouvoir par eux-même realiser des devis.
Par ailleurs vous allez mettre à leur disposition une fonctionnalité
qui sera susceptible d'évoluer selon différentes contraintes.
Par exemple on va concevoir une interface de découpage de matériaux.
et vous allez concevoir les éléments logiciels qui permettent d'adapter
le découpage à différents matériaux ou contraintes métier.
Vous répondrez à ces exigences en utilisant java , et le framework Spring.
Votre application devra mettre en oeuvre les mécanismes d'inversion de
contrôle, d'injection de dépendance de exploiteter les principes de
programmation par contrat.
 */
public class ExecuteMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Traitements sur Charpentier
        Charpentier charp = context.getBean("charpentier", Charpentier.class);
        System.out.println("________CHARPENTIER________");
        charp.presenterMetier();
        charp.lancerTravaux();

        //Traitements sur Tailleur de pierre
        TailleurPierre tailleur = context.getBean("tailleurPierre", TailleurPierre.class);
        System.out.println("________TAILLEUR DE PIERRE________");
        tailleur.presenterMetier();
        tailleur.lancerTravaux();

        //Traitements sur Menuisier
        Menuisier menuisier = context.getBean("menuisier", Menuisier.class);
        System.out.println("________MENUISIER________");
        menuisier.presenterMetier();
        menuisier.lancerTravaux();


        context.close();
    }
}
