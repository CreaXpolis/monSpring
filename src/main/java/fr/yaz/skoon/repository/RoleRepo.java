package fr.yaz.skoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.yaz.skoon.model.Role;

@Repository
public interface RoleRepo extends  JpaRepository<Role, Integer> {
	
	Role findRoleByNom (String nom);
	

}
