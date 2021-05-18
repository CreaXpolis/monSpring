package fr.yaz.skoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Role;
import fr.yaz.skoon.repository.RoleRepo;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	
private RoleRepo roleRepo;

	@Override
	public Role getRoleByNom(String nom_role) {
		return roleRepo.findRoleByNom(nom_role);
	}
	
	
	
}
