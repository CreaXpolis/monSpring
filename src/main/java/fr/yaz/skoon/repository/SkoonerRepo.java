package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yaz.skoon.model.Skooner;

@Repository

public interface SkoonerRepo extends JpaRepository<Skooner, Integer>{
	
	Skooner findSkoonerByNom(String nom);
    Skooner findSkoonerByPrenom(String prenom);
    Skooner findSkoonerByPseudo (String pseudo);
    Skooner findSkoonerByAge(int age);
    Skooner findSkoonerByMail(String mail);

	
}
