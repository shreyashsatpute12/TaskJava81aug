package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Exception.ProjDetailsNotFound;
import com.dto.ProjectDTO;
import com.services.ProjectService;

@RestController
@RequestMapping("/Project")
public class ProjectController {

	@Autowired
    private ProjectService projservice;
	
	@PostMapping("/addProd")
	public ResponseEntity<String> addProduct(@RequestBody ProjectDTO ProdDetails){
		projservice.addProjectDetails(ProdDetails);
		
		return new ResponseEntity<String>("Product Added ",HttpStatus.OK);
		
		}
	
	@PutMapping("/product/{ProjectId}")
	public ResponseEntity<String> updateProduct(@PathVariable Integer ProjectId ) throws ProjDetailsNotFound{
		projservice.updatePorjectDetails(ProjectId);
		return new ResponseEntity<String>("Product Updated",HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/product/{ProductId}")
	public ResponseEntity<String>deleteProduct(@PathVariable Integer ProjectId) throws ProjDetailsNotFound
	{
		
		projservice.deleteProjectDetails(ProjectId);
		
		return new ResponseEntity<String>("Product Deleted",HttpStatus.OK);
		
		
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<ProjectDTO>>getAllProduct() throws ProjDetailsNotFound {
		List<ProjectDTO>op=projservice.allProjectDetails();
		return new ResponseEntity<List<ProjectDTO>>(op,HttpStatus.OK);
	}
	
	
	
}
