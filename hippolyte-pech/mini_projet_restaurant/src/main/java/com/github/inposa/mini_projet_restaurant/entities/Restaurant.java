package com.github.inposa.mini_projet_restaurant.entities;

import javax.persistence.*;

@Entity
@Table(name = "Restaurant")
public class Restaurant implements I_Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int capacite;   // capacité en personnes dans le restaurant

    @Column
    private String typeRestaurant;

    public Restaurant() {

    }

    public Restaurant(Long id, int capacite, String typeRestaurant) {
        this.id = id;
        this.capacite = capacite;
        this.typeRestaurant = typeRestaurant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getTypeRestaurant() {
        return typeRestaurant;
    }

    public void setTypeRestaurant(String typeRestaurant) {
        this.typeRestaurant = typeRestaurant;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", capacité=" + capacite +
                ", type restaurant='" + typeRestaurant + '\'' +
                '}';
    }
}
