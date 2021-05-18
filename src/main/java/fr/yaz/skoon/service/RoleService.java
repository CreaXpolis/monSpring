package fr.yaz.skoon.service;

import org.springframework.stereotype.Service;

import fr.yaz.skoon.model.Role;

@Service

public interface RoleService {
	
	Role getRoleByNom (String nom_role);

}
