package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Participant;

@Service

public interface ParticipantService {

	Participant addParticipant (Participant participant);
	Participant deleteParticipant (int id);
	
	Participant getParticipantByActivite (String Activite);
}
