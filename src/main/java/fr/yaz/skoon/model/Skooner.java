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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity

@Table( name = "Skooner")
public class Skooner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "nom")
	//@NotBlank(message = "Le nom ne peut-être vide")
    //@Size(min = 2, max = 45, message = "Le nom doit avoir entre 2 et 45 caractères")
	private String nom;
	
	@Column(name = "prenom")
	//@NotBlank(message = "Le prénom ne peut-être vide")
    //@Size(min = 2, max = 45, message = "Le prénom doit avoir entre 2 et 45 caractères")
	private String prenom;
	
	@Column(name = "pseudo")
	//@NotBlank(message = "Le pseudo ne peut-être vide")
    //@Size(min = 2, max = 45, message = "Le pseudo doit avoir entre 2 et 45 caractères")
	private String pseudo;
	
	@Column(name = "age")
	//@NotBlank(message = "L'age ne peut-être vide")
    //@Size(min = 1, max = 10, message = "veuillez entrer votre date de naissance au format jj/mm/aaaa")
	private int age;
	
	@Column(name = "mail")
	//@Email(message = "Email no valide")
	private String mail;
	
	 @OneToOne //(cascade = CascadeType.ALL)
	 @JoinColumn(name = "adresse", referencedColumnName = "id")
	 private Adresse adresse;

	 @OneToOne(mappedBy="skooner")
	 @JoinColumn(name= "participant", referencedColumnName = "id")
	 private Participant participant;

	 public Skooner() {
		 
	 }

	public Skooner(int id, String nom, String prenom, String pseudo, int age, String mail, Adresse adresse,
			Participant participant) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.age = age;
		this.mail = mail;
		this.adresse = adresse;
		this.participant = participant;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	

}
	