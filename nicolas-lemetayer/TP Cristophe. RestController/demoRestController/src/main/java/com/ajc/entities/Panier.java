package com.ajc.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
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

    @ManyToMany(fetch=FetchType.EAGER, cascade = { CascadeType.ALL })
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(
            name="panier_legume",
            joinColumns=@JoinColumn(name="panier_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="legume_id", referencedColumnName="id"))
    private List<Legume> legumes;

    @Column(name="prix_panier")
    private String prixPanier;

    public Panier(List<Fruit> fruits, List<Legume> legumes, String prixPanier) {
        this.fruits = fruits;
        this.legumes = legumes;
        this.prixPanier = prixPanier;
    }

}
