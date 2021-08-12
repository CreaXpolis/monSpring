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
import javax.persistence.OneToOne;
import javax.persistence.Table;




@SuppressWarnings("unused")
@Entity
@Table( name = "adresse") 
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
    private int id;
	
	@Column(name = "ville")
	//@NotBlank(message = "La Ville ne peut-être vide")
    //@Size(min = 2, max = 45, message = "La Ville doit avoir entre 2 et 45 caractères")
	private String ville;
	
	@Column(name = "rue")
	//@NotBlank(message = "La rue ne peut-être vide")
    //@Size(min = 2, max = 45, message = "La rue doit avoir entre 2 et 45 caractères")
	private String rue;
	
	@Column(name = "codePostal")
	//@NotBlank(message = "Le C-P ne peut-être vide")
    //@Size(max = 5, message = "Le C-P doit avoir 5 chiffres")
	private int codePostal;
	
	@Column(name = "geolocalisation")
	private String geolocalisation;
	

	//@OneToOne(mappedBy="adresse")
	  //  private Skooner skooner;

	//@OneToOne(mappedBy="adresse")
	//private Evenement evenement;
	
	public int getId() {
		return id;
	}

	public Adresse(int id, String ville, String rue, int codePostal, String geolocalisation) {
		super();
		this.id = id;
		this.ville = ville;
		this.rue = rue;
		this.codePostal = codePostal;
		this.geolocalisation = geolocalisation;
		
		//this.evenement = evenement;
	}

	public Adresse() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getGeolocalisation() {
		return geolocalisation;
	}

	public void setGeolocalisation(String geolocalisation) {
		this.geolocalisation = geolocalisation;
	}

	//public Skooner getSkooner() {
		//return skooner;
	//}

	//public void setSkooner(Skooner skooner) {
		//this.skooner = skooner;
	//}

	
	
}

