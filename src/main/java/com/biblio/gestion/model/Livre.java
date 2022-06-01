package com.biblio.gestion.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Livre  
{  
	//Defining book id as primary key  
	@Id  
	@Column  
	private int id_livre;  
	@Column  
	private String name_livre;  

	@ManyToOne
	@JoinColumn(name="id_auteur", nullable=false)
	private Auteur auteur;
	
	
	@Column  
	private float prix;
	public int getId_livre() {
		return id_livre;
	}
	public void setId_livre(int id_livre) {
		this.id_livre = id_livre;
	}
	public String getName_livre() {
		return name_livre;
	}
	public void setName_livre(String name_livre) {
		this.name_livre = name_livre;
	}

	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}
	@Override
	public String toString() {
		return "Livre [id_livre=" + id_livre + ", name_livre=" + name_livre + ", auteur=" + auteur + ", prix=" + prix
				+ "]";
	}

	
	
	
}