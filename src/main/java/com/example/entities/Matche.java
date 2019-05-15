package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Matche implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private Date date;
	@Column
	private int score_accueil;
	@Column
	private int score_visiteur;
	@Column
	private Date created_at;
	@Column
	private Date updated_at;
	@ManyToMany
	@JoinTable(name = "arbitre_matche", 
	joinColumns = @JoinColumn(name = "matche_id", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "arbitre_id", referencedColumnName = "id"))
	private Collection<Arbitre> arbitres;
	@ManyToOne
	@JoinColumn(name = "terrain_id")
	private Terrain terr;
	@ManyToOne
	@JoinColumn(name = "delegue_id")
	private Delegue delegue;
	@ManyToOne()
	@JoinColumn(name = "acceuil_id")
	private Equipe accueil;
	@ManyToOne()
	@JoinColumn(name = "visiteur_id")
	private Equipe visiteur;

	@OneToMany(mappedBy = "matche", fetch = FetchType.LAZY)
	private Collection<But> buts;
	@ManyToOne
	@JoinColumn(name = "Saison")
	private Saison saison;


}
