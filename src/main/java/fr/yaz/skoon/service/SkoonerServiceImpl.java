package fr.yaz.skoon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Skooner;
import fr.yaz.skoon.repository.SkoonerRepo;

@Service

public class SkoonerServiceImpl implements SkoonerService {
	
	@Autowired
	private SkoonerRepo skoonerRepo;

	
	@Override
	public Skooner createSkooner(Skooner skooner) {
		return skoonerRepo.save(skooner);
	}
	

	@Override
	public Skooner deleteSkooner(int id)  {
	    Optional<Skooner> skooner = skoonerRepo.findById(id);
	    if(skooner.isPresent()){
	    skoonerRepo.delete(skooner.get());
	    }
	      return null;
	}

	@Override
	public Skooner findSkoonerById(int id) {
		return skoonerRepo.findSkoonerById(id);
	}
	
	@Override
	public Skooner getSkoonerByNom(String nom) {
		return skoonerRepo.findSkoonerByNom(nom);
	}

	@Override
	public Skooner getSkoonerByPrenom(String prenom) {
		return skoonerRepo.findSkoonerByPrenom(prenom);
	}

	@Override
	public Skooner getSkoonerByPseudo(String pseudo) {
		return skoonerRepo.findSkoonerByPseudo(pseudo);
	}

	@Override
	public Skooner getSkoonerByAge(int age) {
		return skoonerRepo.findSkoonerByAge(age);
	}

	@Override
	public Skooner getSkoonerByMail(String mail) {
		return skoonerRepo.findSkoonerByMail(mail);
	}


	@Override
	public List<Skooner> findAll() {
		return skoonerRepo.findAll();
	}


	
}

