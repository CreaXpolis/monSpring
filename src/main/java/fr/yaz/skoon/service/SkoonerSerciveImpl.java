package fr.yaz.skoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Skooner;
import fr.yaz.skoon.repository.SkoonerRepo;

@Service

public class SkoonerSerciveImpl implements SkoonerService {
	
	@Autowired
	private SkoonerRepo skoonerRepo;

	@Override
	public Skooner getSkoonerByNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skooner getSkoonerByPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skooner getSkoonerByPseudo(String pseudo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skooner getSkoonerByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skooner getSkoonerByMail(String mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
