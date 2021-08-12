package fr.yaz.skoon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table( name = "Evenement")
public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name= "nom")
	//@NotBlank(message = "Le nom ne peut-être vide")
    //@Size(min = 1, max = 255, message = "Le nom doit avoir un max de 255 caractères")
	private String nom;
	
	@Column(name= "description")
	//@NotBlank(message = "La description ne peut-être vide")
    //@Size(min = 1, max = 255, message = "La description doit avoir un max de 255 caractères")
	private String description;
	

    //@OneToOne
   //private Adresse adresse;

  
    public Evenement() {

    }


	public Evenement(int id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		//this.adresse = adresse;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}

