package fr.yaz.skoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import fr.yaz.skoon.model.Skooner;
import fr.yaz.skoon.service.SkoonerService;


@RestController
@CrossOrigin("*")
public class SkoonerController {
	
	@Autowired 
	SkoonerService skoonerService;
	
  @GetMapping(value="/skooner/{id}")
  public Skooner getSkoonerById(@PathVariable(value="id")int id) {
  return skoonerService.getSkoonerById(id);
}

  @GetMapping (value ="/skooner/{nom}")
  public Skooner getSkoonerByNom(@PathVariable (value="nom") String nom) {
  	return skoonerService.getSkoonerByNom(nom);
  }
  
  
  @GetMapping (value ="/skooner/{prenom}")
  public Skooner getSkoonerByPrenom(@PathVariable (value="prenom") String prenom) {
  	return skoonerService.getSkoonerByPrenom(prenom);
  }
  
  @GetMapping (value ="/skooner/{pseudo}")
  public Skooner getSkoonerByPseudo(@PathVariable (value="pseudo") String pseudo) {
  	return skoonerService.getSkoonerByPseudo(pseudo);
  }
  
  @GetMapping (value ="/skooner/{email}")
  public Skooner getSkoonerByMail(@PathVariable (value="mail") String mail) {
  	return skoonerService.getSkoonerByMail(mail);
  }
  
  @PostMapping(value="/skooner/{id}")
  @ResponseBody
  public Skooner createSkooner(@RequestBody Skooner skooner) {
  	return skoonerService.createSkooner(skooner) ;
  }
  
  @DeleteMapping(value="/skooner/{id}")
  public Skooner deleteSkooner(@PathVariable(value="id") int id) {
  	return skoonerService.deleteSkooner(id);
  }
  
  
  
  
  
  
  
  
}
