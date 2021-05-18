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
@Table( name = "Evenement")
public class Evenement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
    private int id;
	private String nom;
	private String description;
	

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @OneToMany(mappedBy="evenement")
    private List<Participant> participant;

    public Evenement() {

    }
	
}

