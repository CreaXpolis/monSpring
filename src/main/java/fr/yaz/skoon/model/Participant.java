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

@Table( name = "Participant")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "activite")
	//@NotBlank(message = "L'activités ne peut-être vide")
    //@Size(min = 1, max = 255, message = "Veuillez saisir le statut de votre activité")
	private String activite;
	
	@ManyToOne
    @JoinColumn(name="role", nullable=false)
    private Role role;

    @ManyToOne
    @JoinColumn(name="evenement", referencedColumnName = "id",nullable=false)
    private Evenement evenement;

    @OneToOne
    @JoinColumn(name="skooner", referencedColumnName = "id", nullable=false)
    private Skooner skooner;

    public Participant() {

    }

	public Participant(int id, String activite, Role role, Evenement evenement, Skooner skooner) {
		super();
		this.id = id;
		this.activite = activite;
		this.role = role;
		this.evenement = evenement;
		this.skooner = skooner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivite() {
		return activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Evenement getEvenement() {
		return evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}

	public Skooner getSkooner() {
		return skooner;
	}

	public void setSkooner(Skooner skooner) {
		this.skooner = skooner;
	}

}
