package com.inposa.projet_rest_restaurant.entities;

import javax.persistence.*;

@Entity
@Table(name = "Restaurant")
public class Restaurant implements I_Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private int capacite;   // capacité en personnes dans le restaurant

    @Column(name = "type_restaurant")
    private String typeRestaurant;

    @Column
    private String name;

    public Restaurant() {

    }

    public Restaurant(Integer id, int capacite, String typeRestaurant, String name) {
        this.id = id;
        this.capacite = capacite;
        this.typeRestaurant = typeRestaurant;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", capacite=" + capacite +
                ", typeRestaurant='" + typeRestaurant + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
