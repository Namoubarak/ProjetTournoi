package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Joueur implements Serializable{
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


}
