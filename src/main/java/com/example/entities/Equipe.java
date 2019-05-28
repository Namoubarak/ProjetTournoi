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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Equipe implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String logo,nom,abbr,addresse,tel;
@ManyToOne
@JoinColumn(name = "Type")
private Type type;
private Date created_at;
private Date updated_at;
private int point;
@OneToMany(mappedBy = "accueil")
private Collection<Matche> matches_accueil;
@OneToMany(mappedBy="visiteur")
private Collection<Matche> matches_visiteur;
@OneToMany(mappedBy = ("equipe"))
private Collection<Joueur> liste_joueur;
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
