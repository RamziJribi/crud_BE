package com.biblio.gestion.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.biblio.gestion.model.Livre;
import com.biblio.gestion.repository.LivreRepository;

//defining the business logic  
@Service  
public class LivreServices   
{  
	@Autowired  
	LivreRepository livreRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Livre> getAllLivre()   
	{  
		List<Livre> livres = new ArrayList<Livre>();  
		livreRepository.findAll().forEach(l -> livres.add(l));  
		return livres;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Livre getLivreById(int id)   
	{  
		return livreRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Livre livre)   
	{  
		livreRepository.save(livre);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		livreRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Livre livre)   
	{  
		livreRepository.save(livre);  
	} 
}  
