package com.example.entities;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue("Admin") @Data @NoArgsConstructor @AllArgsConstructor
public class Admin extends Profil{

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String logo,nom,abbr,addresse,tel;
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
	public int getresourceId() {
		return id;
	}
	

}
