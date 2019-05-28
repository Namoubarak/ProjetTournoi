package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Type;
@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface TypeRepository extends JpaRepository<Type, Integer>{

}
