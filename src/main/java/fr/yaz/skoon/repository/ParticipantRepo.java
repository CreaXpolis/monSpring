package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.yaz.skoon.model.Participant;

public interface ParticipantRepo extends JpaRepository<Participant, Integer> {
	
	Participant findParticipantByActivite (String activite);

}
