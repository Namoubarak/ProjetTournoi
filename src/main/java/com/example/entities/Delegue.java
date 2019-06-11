package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("Delegue") 
public class Delegue extends Profil implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String photo;
private String nom;
private String prenom;
private String cin;	
private String n_licence;
private Date date_nai;
private Date created_at;
private Date updated_at;
@OneToMany(mappedBy = "delegue",fetch = FetchType.LAZY)
private Collection<Matche> liste_matches ;
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
public Date getDate_nai() {
	return date_nai;
}
public void setDate_nai(Date date_nai) {
	this.date_nai = date_nai;
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
public Collection<Matche> getListe_matches() {
	return liste_matches;
}
public void setListe_matches(Collection<Matche> liste_matches) {
	this.liste_matches = liste_matches;
}
public Delegue() {
	super();
	// TODO Auto-generated constructor stub
}




}
