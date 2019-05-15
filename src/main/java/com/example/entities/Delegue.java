package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Delegue implements Serializable{
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




}
