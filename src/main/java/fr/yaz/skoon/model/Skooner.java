package fr.yaz.skoon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Entity
@Getter
@Setter
@Table( name = "Skooner")
public class Skooner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String prenom;
	private String pseudo;
	private int age;
	private String mail;
	
	@OneToMany(mappedBy = "Skooner",cascade = CascadeType.ALL)
	private List<Participant> participants;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adresse_id")
	private Adresse adresse;
			
}
	
			
	
	

