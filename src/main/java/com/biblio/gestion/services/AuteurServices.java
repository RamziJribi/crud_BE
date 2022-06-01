package com.biblio.gestion.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.biblio.gestion.model.Auteur;
import com.biblio.gestion.repository.AuteurRepository;

//defining the business logic  
@Service  
public class AuteurServices   
{  
	@Autowired  
	AuteurRepository auteurRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Auteur> getAllAuteur()   
	{  
		List<Auteur> auteur = new ArrayList<Auteur>();  
		auteurRepository.findAll().forEach(l -> auteur.add(l));  
		return auteur;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Auteur getAuteurById(int id)   
	{  
		return auteurRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Auteur auteur)   
	{  
		auteurRepository.save(auteur);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		auteurRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Auteur auteur)   
	{  
		auteurRepository.save(auteur);  
	} 
}  