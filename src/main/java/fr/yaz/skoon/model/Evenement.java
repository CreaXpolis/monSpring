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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Entity
@Getter
@Setter
@Table( name = "Evenement")
public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String nom;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adresse_id")
	private Adresse adresse;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "participant_id")
	private List<Participant> participants;

	
}

