package com.example.entities;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Terrain implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	
private String nom;
	
private String lieu;

	
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
@OneToMany(mappedBy = "terr",fetch = FetchType.LAZY)
private Collection<Matche> listematches;

public Long getresourceId() {
	return id;
}
//public void setId(Long id) {
//	this.id = id;
//}
//public String getNom() {
//	return nom;
//}
//public void setNom(String nom) {
//	this.nom = nom;
//}
//public String getLieu() {
//	return lieu;
//}
//public void setLieu(String lieu) {
//	this.lieu = lieu;
//}
//public Date getCreated_at() {
//	return created_at;
//}
//public void setCreated_at(Date created_at) {
//	this.created_at = created_at;
//}
//public Date getUpdated_at() {
//	return updated_at;
//}
//public void setUpdated_at(Date updated_at) {
//	this.updated_at = updated_at;
//}
//public Collection<Matche> getListematches() {
//	return listematches;
//}
//public void setListematches(Collection<Matche> listematches) {
//	this.listematches = listematches;
//}



}
