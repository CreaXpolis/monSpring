package fr.yaz.skoon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@SuppressWarnings("unused")
@Getter
@Setter
@Entity
@Table( name = "adresse") 
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String ville;
	private String rue;
	private int code_postal;
	private String geolocalisation;

	
}
