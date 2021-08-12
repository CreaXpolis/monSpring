package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.model.Skooner;

@Service

public interface AdresseService {
	
	Adresse addAdresse (Adresse adresse);
	Adresse deleteAdresse (int id);

	
	Adresse getAdresseByVille (String ville);
	Adresse getAdresseByRue (String rue);
	Adresse getAdresseByCodePostal (int codePostal);
	Adresse getAdressByGeolocalisation (int geolocalisation);
	//Adresse getAdresseByEvenement (Evenement evenement);
	//Adresse getAdresseBySkooner (Skooner skooner);
	
}
