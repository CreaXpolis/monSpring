package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Adresse;

@Service

public interface AdresseService {
	
	Adresse getAdresseByVille (String ville);
	Adresse getAdresseByRue (String rue);
	Adresse getAdresseByCodePostal (int code_postal);
	Adresse getAdressByGeolocalisation (int geolocalisation);
	
}
