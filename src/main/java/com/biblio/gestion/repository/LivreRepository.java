package com.biblio.gestion.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblio.gestion.model.Livre;

 
//repository that extends CrudRepository  
//extends => heritage
public interface LivreRepository extends CrudRepository<Livre, Integer>  
{  
} 