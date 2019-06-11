package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Joueur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id ;
private String photo;
private String nom;
private String prenom;
private String cin;
private String n_licence;
private Date date;
@ManyToOne
@JoinColumn(name = "team_name")
private Equipe equipe;
@OneToMany(mappedBy = "joueur",fetch = FetchType.LAZY)
private Collection<But> buts;
public int getresourceId() {
	return id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
public String getN_licence() {
	return n_licence;
}
public void setN_licence(String n_licence) {
	this.n_licence = n_licence;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Equipe getEquipe() {
	return equipe;
}
public void setEquipe(Equipe equipe) {
	this.equipe = equipe;
}
public Collection<But> getButs() {
	return buts;
}
public void setButs(Collection<But> buts) {
	this.buts = buts;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Joueur() {
	super();
	// TODO Auto-generated constructor stub
}


}
