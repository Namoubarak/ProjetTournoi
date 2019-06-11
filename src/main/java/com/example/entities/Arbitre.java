package com.example.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
public class Arbitre implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column
private String photo;
	@Column
private String nom;
	@Column
private String prenom;
	@Column
private String cin;
	@Column
private String n_license;
	@Column
private String date_naissance;
	@Column
private Date created_at;
	@Column
private Date updated_at;
@ManyToMany
@JoinTable(name = "arbitre_matche",
joinColumns = @JoinColumn(name="arbitre_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="matche_id",referencedColumnName = "id"))
private Collection<Matche> matches;
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
public String getN_license() {
	return n_license;
}
public void setN_license(String n_license) {
	this.n_license = n_license;
}
public String getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(String date_naissance) {
	this.date_naissance = date_naissance;
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
public Collection<Matche> getMatches() {
	return matches;
}
public void setMatches(Collection<Matche> matches) {
	this.matches = matches;
}
public Arbitre() {
	super();
	// TODO Auto-generated constructor stub
}


}
