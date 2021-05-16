package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yaz.skoon.model.Evenement;

@Repository

public interface EvenementRepo extends JpaRepository<Evenement, Integer> {
	
	Evenement findEvenementByNom(String nom);
	Evenement findEvenementByDescription(String description);

}
