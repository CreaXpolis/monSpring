package fr.yaz.skoon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.model.Participant;
import fr.yaz.skoon.model.Skooner;
import fr.yaz.skoon.repository.ParticipantRepo;

@Service

public class ParticipantServiceImpl implements ParticipantService {

	@Autowired
	private ParticipantRepo participantRepo;
	
	@Override
	public Participant addParticipant(Participant participant) {
		return participantRepo.save(participant);
	}

	@Override
	public Participant getParticipantByActivite(String activite) {
		return participantRepo.findParticipantByActivite(activite);
	}
	
	@Override

public Participant deleteParticipant(int id) {
	    Optional<Participant> participant= participantRepo.findById(id);
	    if(participant.isPresent()){
	    participantRepo.delete(participant.get());
	    }
	      return null;
	    }

	@Override
	public Participant findParticipantById(int id) {
		return participantRepo.findParticipantById(id);
	}

	@Override
	public Participant findParticipantByEvenement(Evenement evenement) {
		return participantRepo.findParticipantByEvenement(evenement) ;
	}

	@Override
	public Participant findParticipantBySkooner(Skooner skooner) {
		return participantRepo.findParticipantBySkooner(skooner);
	}


	}
	
	
