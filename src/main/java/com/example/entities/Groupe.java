package com.example.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Groupe implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String label;
	@OneToMany(mappedBy = "grp",fetch = FetchType.LAZY)
	private List<Type> types;
	@ManyToOne
	@JoinColumn(name="Saison")
	private Saison s;
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
