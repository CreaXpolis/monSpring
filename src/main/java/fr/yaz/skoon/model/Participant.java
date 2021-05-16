package fr.yaz.skoon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("unused")
@Entity
@Getter
@Setter
@Table( name = "Participant")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String activite;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "skooner_id")		
	private Skooner skooners;
	
	@OneToMany(mappedBy = "participant",cascade = CascadeType.ALL)
	private List<Role> role;
	
	@OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
	private List<Evenement> evenements;

}
