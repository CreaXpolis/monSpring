package fr.yaz.skoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.yaz.skoon.model.Participant;
import fr.yaz.skoon.service.ParticipantService;

public class ParticipantController {

	@Autowired
	ParticipantService participantService;
	
	@PostMapping(value="/participant/{id}")
	  @ResponseBody
	  public Participant addParticipant(@RequestBody Participant participant) {
	  	return participantService.addParticipant(participant);
	  }
	  
	  @DeleteMapping(value="/participant/{id}")
	  public Participant deleteParticipant(@PathVariable(value="id") int id) {
	  	return participantService.deleteParticipant(id);
	  }
}



