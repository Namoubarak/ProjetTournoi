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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
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
private Date date_naissance;
	@Column
private Date created_at;
	@Column
private Date updated_at;
@ManyToMany
@JoinTable(name = "arbitre_matche",
joinColumns = @JoinColumn(name="arbitre_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="matche_id",referencedColumnName = "id"))
private Collection<Matche> matches;




}
