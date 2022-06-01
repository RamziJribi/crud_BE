package com.biblio.gestion.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Auteur  
{  
	//Defining book id as primary key  
	@Id  
	@Column  
	private int id_auteur;  
	@Column  
	private String name_auteur;  
	@Column  
	public int getId_auteur() {
		return id_auteur;
	}
	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}
	public String getName_auteur() {
		return name_auteur;
	}
	public void setName_auteur(String name_auteur) {
		this.name_auteur = name_auteur;
	}
	
	@Override
	public String toString() {
		return "Auteur [id_auteur=" + id_auteur + ", name_auteur=" + name_auteur +"]";
	}	
	
	
	
}