package com.example.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Profil_Type",discriminatorType = DiscriminatorType.STRING,length = 5)
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Profil {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;	
@OneToOne(mappedBy = "profil")
protected User user;
	

}
