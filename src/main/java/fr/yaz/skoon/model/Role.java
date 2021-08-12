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
import javax.persistence.Table;


@Entity

@Table (name = "role")

public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "nomRole")
	private String nomRole;
	
	  @OneToMany(mappedBy="role")
	    private List<Participant> participant;

	    public Role() {
	    	
}

		public Role(int id, String nomRole, List<Participant> participant) {
			super();
			this.id = id;
			this.nomRole = nomRole;
			this.participant = participant;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNomRole() {
			return nomRole;
		}

		public void setNomRole(String nomRole) {
			this.nomRole = nomRole;
		}

		public List<Participant> getParticipant() {
			return participant;
		}

		public void setParticipant(List<Participant> participant) {
			this.participant = participant;
		}

}