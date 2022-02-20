package com.ecole.demo.stagiaire.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="entreprise")
public class Entreprise {
	
	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name="entreprise_employe",
            joinColumns=@JoinColumn(name="entreprise_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="employe_id", referencedColumnName="id"))
    private List<Employe> employes;

}
