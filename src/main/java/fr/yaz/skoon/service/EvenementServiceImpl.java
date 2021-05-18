package fr.yaz.skoon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.repository.EvenementRepo;

@Service
public class EvenementServiceImpl implements EvenementService {
	
	@Autowired 
	EvenementRepo evenementRepo;

	@Override
	public Evenement createEvenement(Evenement evenement) {
		return evenementRepo.save(evenement);
	}
	
	@Override
	public Evenement deleteEvenement(int id)  {
		 Optional<Evenement> evenement = evenementRepo.findById(id);
		 if(evenement.isPresent()){
		 evenementRepo.delete(evenement.get());
		}
		 return null;
	}

	@Override
	public Evenement getEvenementById(int id) {
		return evenementRepo.findEvenementById(id);
	}
	
	@Override
	public Evenement getEvenementByNom(String nom) {
		return evenementRepo.findEvenementByNom(nom);
	}

	@Override
	public Evenement getEvenementByDescription(String description) {
		return evenementRepo.findEvenementByDescription(description);
	}

	@Override
	public Evenement getEvenementByAdresse(Adresse adresses) {
		return evenementRepo.findEvenementByAdresse(adresses);
	}

}
