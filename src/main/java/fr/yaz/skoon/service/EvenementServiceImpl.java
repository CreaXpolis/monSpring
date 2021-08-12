package fr.yaz.skoon.service;

import java.util.List;
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
	public Evenement findEvenementById(int id) {
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
	public List<Evenement> findAll() {
		return evenementRepo.findAll();
	}

	//@Override
	//public Evenement getEvenementByAdresse(Adresse adresse) {
		//return evenementRepo.findEvenementByAdresse(adresse);
	//}

}
