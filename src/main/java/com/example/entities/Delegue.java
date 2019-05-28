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
@DiscriminatorValue("Delegue") @Data @NoArgsConstructor @AllArgsConstructor
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




}
