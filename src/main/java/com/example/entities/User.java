package com.example.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity @Data @NoArgsConstructor @AllArgsConstructor


public class User implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String password;
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
@OneToMany(mappedBy = "owner",fetch = FetchType.LAZY)
private Collection<Post> posts;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(unique = true)
private Profil profil;
public int getresourceId() {
	return id;
}

}
