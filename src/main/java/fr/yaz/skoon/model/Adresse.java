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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@SuppressWarnings("unused")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "adresse") 
public class Adresse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	
    private int id;
	private String ville;
	private String rue;
	private int code_postal;
	private String geolocalisation;

	@OneToOne
	@JoinColumn(name= "Skooner", referencedColumnName = "id")
	    private Skooner skooner;

	@OneToOne
	@JoinColumn(name= "Evenement", referencedColumnName = "id")
	    private Evenement evenement;

}
