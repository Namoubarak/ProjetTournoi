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

	@CreatedDate
private Date created_at;
	@LastModifiedDate
private Date updated_at;
@OneToMany(mappedBy = "terr",fetch = FetchType.LAZY)
private Collection<Matche> listematches;
//public Long getId() {
//	return id;
//}
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
