package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Terrain;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface TerrainRepository extends JpaRepository<Terrain, Long>{

}
