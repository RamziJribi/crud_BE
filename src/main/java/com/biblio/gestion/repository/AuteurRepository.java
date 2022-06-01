package com.biblio.gestion.repository;

import org.springframework.data.repository.CrudRepository;

import com.biblio.gestion.model.Auteur;

 
//repository that extends CrudRepository  
//extends => heritage
public interface AuteurRepository extends CrudRepository<Auteur, Integer>  
{  
} 
