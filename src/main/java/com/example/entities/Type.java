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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
@Entity
public class Type implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String label;
@ManyToOne()
@JoinColumn(name = "Groupe_Name")
private Groupe grp;
private Date created_at;
private Date updated_at;
@PrePersist
protected void onCreate() {
    created_at = new Date();
}
@PreUpdate
protected void onUpdate() {
    updated_at = new Date();
}
@OneToMany(mappedBy = "type",fetch = FetchType.LAZY)
private Collection<Equipe> liste_equipes;
public int getresourceId() {
	return id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public Groupe getGrp() {
	return grp;
}
public void setGrp(Groupe grp) {
	this.grp = grp;
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
public Collection<Equipe> getListe_equipes() {
	return liste_equipes;
}
public void setListe_equipes(Collection<Equipe> liste_equipes) {
	this.liste_equipes = liste_equipes;
}


}
