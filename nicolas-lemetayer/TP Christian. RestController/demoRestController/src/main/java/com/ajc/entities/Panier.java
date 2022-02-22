package com.ajc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="panier")
public class Panier {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch=FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name="panier_fruit",
            joinColumns=@JoinColumn(name="panier_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="fruit_id", referencedColumnName="id"))
    private List<Fruit> fruits;

    @Column(name="prix_panier")
    private String prixPanier;

    public Panier(List<Fruit> fruits, String prixPanier) {
        this.fruits = fruits;
        this.prixPanier = prixPanier;
    }

}
