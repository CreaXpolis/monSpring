package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yaz.skoon.model.Adresse;

@Repository

public interface AdresseRepo extends JpaRepository<Adresse, Integer> {

	Adresse findAdresseByVille (String ville);
	Adresse findAdresseByRue (String rue);
	Adresse findAdresseByCodePostal (int code_postal);
	Adresse findAdressByGeolocalisation (int geolocalisation);
	
}
