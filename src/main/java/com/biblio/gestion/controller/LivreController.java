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

import com.biblio.gestion.model.Livre;
import com.biblio.gestion.services.LivreServices;


//mark class as Controller  
@RestController  
public class LivreController   
{  
	//autowire the BooksService class  
	@Autowired  
	LivreServices livreServices;  
		
	//creating a get mapping that retrieves all the books detail from the database  
	//Mapping=rootage
	@GetMapping("/livres")  
	private List<Livre> getAllLivre()   
	{  
		return livreServices.getAllLivre();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/livre/{id}")  
	private Livre getLivre(@PathVariable("id") int id)   
	{  
		return livreServices.getLivreById(id);  
	}  
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/livre/{id}")  
	private void deleteBsook(@PathVariable("id") int id)   
	{  
		livreServices.delete(id);  
	}  
	
	//creating post mapping that post the book detail in the database  
	@PostMapping("/livres")  
	private int saveBook(@RequestBody Livre livre)   
	{  
		livreServices.saveOrUpdate(livre);  
		return livre.getId_livre();
	}  
	
	//creating put mapping that updates the book detail   
	@PutMapping("/livre")  
	private Livre update(@RequestBody Livre livre)   
	{  
		livreServices.saveOrUpdate(livre);  
		return livre;  
	}  
}  