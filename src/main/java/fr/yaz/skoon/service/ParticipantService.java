package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.model.Participant;
import fr.yaz.skoon.model.Skooner;

@Service

public interface ParticipantService {

	Participant findParticipantById (int id);
	Participant addParticipant (Participant participant);
	Participant deleteParticipant (int id);
	
	Participant getParticipantByActivite (String Activite);
	Participant findParticipantByEvenement (Evenement evenement);
	Participant findParticipantBySkooner (Skooner skooner);
}
