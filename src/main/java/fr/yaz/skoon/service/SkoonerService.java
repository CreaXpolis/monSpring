package fr.yaz.skoon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Skooner;

@Service

public interface SkoonerService {
	
	Skooner createSkooner (Skooner skooner);
	Skooner deleteSkooner (int id);
	
	List<Skooner> findAll();
	Skooner findSkoonerById(int id);
	Skooner getSkoonerByNom(String nom);
    Skooner getSkoonerByPrenom(String prenom);
    Skooner getSkoonerByPseudo (String pseudo);
    Skooner getSkoonerByAge(int age);
    Skooner getSkoonerByMail(String mail);
	

}
