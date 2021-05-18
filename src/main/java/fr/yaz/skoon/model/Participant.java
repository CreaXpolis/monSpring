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
@Table( name = "Participant")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
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

}
