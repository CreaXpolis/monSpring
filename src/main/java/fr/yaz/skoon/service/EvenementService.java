package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Evenement;

@Service

public interface EvenementService {
	
	Evenement getEvenementByNom(String nom);
	Evenement getEvenementByDescription(String description);

}
