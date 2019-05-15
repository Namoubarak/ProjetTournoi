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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Type implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String label;
@ManyToOne()
@JoinColumn(name = "Groupe_Name")
private Groupe grp;
private Date created_at;
private Date updated_at;
@OneToMany(mappedBy = "type",fetch = FetchType.LAZY)
private Collection<Equipe> liste_equipes;

}