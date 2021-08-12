package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.model.Participant;
import fr.yaz.skoon.model.Skooner;

public interface ParticipantRepo extends JpaRepository<Participant, Integer> {
	
	Participant findParticipantById (int id);
	Participant findParticipantByActivite (String activite);
	Participant findParticipantByEvenement (Evenement evenement);
	Participant findParticipantBySkooner (Skooner skooner);

}
