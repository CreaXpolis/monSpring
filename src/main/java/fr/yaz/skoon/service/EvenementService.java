package fr.yaz.skoon.service;



import java.util.List;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;

@Service
public interface EvenementService {
	
	Evenement createEvenement (Evenement evenement);
	Evenement deleteEvenement (int id);
	
	List<Evenement> findAll();
	Evenement findEvenementById(int id);
	Evenement getEvenementByNom(String nom);
	Evenement getEvenementByDescription(String description);
	//Evenement getEvenementByAdresse(Adresse adresse);

}
