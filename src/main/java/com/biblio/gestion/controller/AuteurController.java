package com.biblio.gestion.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.biblio.gestion.model.Auteur;
import com.biblio.gestion.services.AuteurServices;


//mark class as Controller  
@RestController  
public class AuteurController   
{  
	//autowire the BooksService class  
	@Autowired  
	AuteurServices auteurServices;  
		
	//creating a get mapping that retrieves all the books detail from the database  
	//Mapping=rootage
	@GetMapping("/auteur")  
	private List<Auteur> getAllAuteur()   
	{  
		return auteurServices.getAllAuteur();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/auteur/{id}")  
	private Auteur getAuteur(@PathVariable("id") int id)   
	{  
		return auteurServices.getAuteurById(id);  
	}  
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/auteur/{id}")  
	private void deleteAuteur(@PathVariable("id") int id)   
	{  
		auteurServices.delete(id);  
	}  
	
	//creating post mapping that post the book detail in the database  
	@PostMapping("/livres")  
	private int saveAuteur(@RequestBody Auteur auteur)   
	{  
		auteurServices.saveOrUpdate(auteur);  
		return auteur.getId_auteur();
	}  
	
	//creating put mapping that updates the book detail   
	@PutMapping("/auteur")  
	private Auteur update(@RequestBody Auteur auteur)   
	{  
		auteurServices.saveOrUpdate(auteur);  
		return auteur;  
	}  
}  
