package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Joueur;
@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface JoueurRepository extends JpaRepository<Joueur, Integer>{

}
