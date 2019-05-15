package com.example.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Terrain;
import com.example.repositories.TerrainRepository;
@CrossOrigin(origins="*")

public class TerrainContro {
	@Autowired
	private TerrainRepository ter_repo;
	@GetMapping("/terrainskk")
	public List<Terrain> getTerrains(){
			List<Terrain> list_terrain = null;
			list_terrain=ter_repo.findAll();
			return list_terrain;
	}
	@GetMapping("/terrainskjj/{id}")
	public Terrain getTerrain(@PathVariable Long id){
			Terrain t = new Terrain();
			return ter_repo.findById(id).get();
	}
	@DeleteMapping("/terrainrtyrtys/delete/{id}")
	public boolean deleteTerrain(@PathVariable Long id){
		
		ter_repo.deleteById(id);
		return true;
	}
	@PutMapping("/terrainsjjj")
	public Terrain updateTerrain(Terrain ter){
			
			return ter_repo.save(ter);
	}
	@PostMapping("/terrainsjjj")
	public Terrain createTerrain(Terrain ter){
			
			return ter_repo.save(ter);
	}
}
