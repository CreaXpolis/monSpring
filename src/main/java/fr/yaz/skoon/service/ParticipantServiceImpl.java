package fr.yaz.skoon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Participant;
import fr.yaz.skoon.repository.ParticipantRepo;

@Service

public class ParticipantServiceImpl implements ParticipantService {

	@Autowired
	private ParticipantRepo participantRepo;
	
	@Override
	public Participant addParticipant(Participant participants) {
		return participantRepo.save(participants);
	}

	@Override
	public Participant getParticipantByActivite(String activite) {
		return participantRepo.findParticipantByActivite(activite);
	}
	
	@Override

public Participant deleteParticipant(int id) {
	    Optional<Participant> participants= participantRepo.findById(id);
	    if(participants.isPresent()){
	    participantRepo.delete(participants.get());
	    }
	      return null;
	    }


	}
	
	
