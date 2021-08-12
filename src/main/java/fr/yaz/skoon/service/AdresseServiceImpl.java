package fr.yaz.skoon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.model.Skooner;
import fr.yaz.skoon.repository.AdresseRepo;

@Service
public class AdresseServiceImpl implements AdresseService{
	
	@Autowired
	private AdresseRepo adresseRepo;

	@Override
	public Adresse addAdresse(Adresse adresse) {
		return adresseRepo.save(adresse);
	}

	@Override
	public Adresse deleteAdresse(int id) {
	    Optional<Adresse> adresse= adresseRepo.findById(id);
	    if(adresse.isPresent()){
	    adresseRepo.delete(adresse.get());
	    }
	        return null;
	}

	@Override
	public Adresse getAdresseByVille(String ville) {
		return adresseRepo.findAdresseByVille(ville);
	}

	@Override
	public Adresse getAdresseByRue(String rue) {
		return adresseRepo.findAdresseByRue(rue);
	}

	@Override
	public Adresse getAdresseByCodePostal(int codePostal) {
		return adresseRepo.findAdresseByCodePostal(codePostal);
	}

	@Override
	public Adresse getAdressByGeolocalisation(int geolocalisation) {
		return adresseRepo.findAdressByGeolocalisation(geolocalisation);
	}

	//@Override
	//public Adresse getAdresseByEvenement(Evenement evenement) {
		//return adresseRepo.findAdresseByEvenement(evenement);
	//}

	//@Override
	//public Adresse getAdresseBySkooner(Skooner skooner) {
		//return adresseRepo.findAdresseBySkooner(skooner);
//	}

}
