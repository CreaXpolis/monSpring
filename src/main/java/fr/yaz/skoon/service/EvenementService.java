package fr.yaz.skoon.service;



import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;

@Service
public interface EvenementService {
	
	Evenement createEvenement (Evenement evenement);
	Evenement deleteEvenement (int id);
	
	Evenement getEvenementById(int id);
	Evenement getEvenementByNom(String nom);
	Evenement getEvenementByDescription(String description);
	Evenement getEvenementByAdresse(Adresse adresse);

}
