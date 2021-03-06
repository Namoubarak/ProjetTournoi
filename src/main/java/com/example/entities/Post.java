package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
@Entity 
public class Post implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String contenu;
private Date created_at;
@PrePersist
protected void onCreate() {
    created_at = new Date();
}

@ManyToOne
@JoinColumn(name="User_id")
private User owner;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
public Date getCreated_at() {
	return created_at;
}
public void setCreated_at(Date created_at) {
	this.created_at = created_at;
}
public User getOwner() {
	return owner;
}
public void setOwner(User owner) {
	this.owner = owner;
}

public int getresourceId() {
	return id;
}

}
