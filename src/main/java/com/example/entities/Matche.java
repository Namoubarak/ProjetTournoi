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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Matche implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@PrePersist
	protected void onCreate() {
	    created_at = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
	    updated_at = new Date();
	}
	public int getresourceId() {
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getScore_accueil() {
		return score_accueil;
	}
	public void setScore_accueil(int score_accueil) {
		this.score_accueil = score_accueil;
	}
	public int getScore_visiteur() {
		return score_visiteur;
	}
	public void setScore_visiteur(int score_visiteur) {
		this.score_visiteur = score_visiteur;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Collection<Arbitre> getArbitres() {
		return arbitres;
	}
	public void setArbitres(Collection<Arbitre> arbitres) {
		this.arbitres = arbitres;
	}
	public Terrain getTerr() {
		return terr;
	}
	public void setTerr(Terrain terr) {
		this.terr = terr;
	}
	public Delegue getDelegue() {
		return delegue;
	}
	public void setDelegue(Delegue delegue) {
		this.delegue = delegue;
	}
	public Equipe getAccueil() {
		return accueil;
	}
	public void setAccueil(Equipe accueil) {
		this.accueil = accueil;
	}
	public Equipe getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(Equipe visiteur) {
		this.visiteur = visiteur;
	}
	public Collection<But> getButs() {
		return buts;
	}
	public void setButs(Collection<But> buts) {
		this.buts = buts;
	}
	public Saison getSaison() {
		return saison;
	}
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Matche() {
		super();
		// TODO Auto-generated constructor stub
	}



}
