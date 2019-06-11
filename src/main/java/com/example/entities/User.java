package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public Collection<Post> getPosts() {
	return posts;
}
public void setPosts(Collection<Post> posts) {
	this.posts = posts;
}
public Profil getProfil() {
	return profil;
}
public void setProfil(Profil profil) {
	this.profil = profil;
}


}
