package com.entities;

import javax.persistence.*;

@Entity
public class Teatime {
    //attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTeatime;
    private String flavour;
    private boolean cookie; // true = 1


    // pour relier un teatime tread à une recipe (1 cookie = 1 recipe / 1 recipe = 1 cookie)
    @OneToOne
    private Recipe recipe;

    // constructeur sans parametres
    public Teatime(){}

    //constructeur avec param
    public Teatime(Integer idTeatime, String flavour, boolean unCookie) {
        this.idTeatime = idTeatime;
        this.flavour = flavour;
        this.cookie = unCookie;
    }

    //constructeur avec param sans id
    public Teatime(String flavour, boolean unCookie) {
        this.flavour = flavour;
        this.cookie = unCookie;
    }

    // getters setter

    public Integer getIdTeatime() {
        return idTeatime;
    }

    public String getFlavour() {
        return flavour;
    }

    public boolean isCookie() {
        return cookie;
    }

    public void setIdTeatime(Integer idTeatime) {
        this.idTeatime = idTeatime;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setCookie(boolean cookie) {
        this.cookie = cookie;
    }


    // getter et setter pour pourvoir associer la table Recipe
    public Recipe getRecipe() {
        return recipe;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
// methodes
}
