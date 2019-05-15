package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class But implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@ManyToOne
@JoinColumn(name="joueur_id")
private Joueur joueur;
@ManyToOne
@JoinColumn(name="matche_id")
private Matche matche ;
private Date created_at;
private Date updated_at;

}
