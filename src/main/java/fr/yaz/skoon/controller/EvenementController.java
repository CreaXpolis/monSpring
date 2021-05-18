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

import fr.yaz.skoon.model.Adresse;
import fr.yaz.skoon.model.Evenement;
import fr.yaz.skoon.service.EvenementService;

@RestController
@CrossOrigin("*")
public class EvenementController {

    @Autowired
    private EvenementService evenementService;
    
@GetMapping (value ="/evenements/{id}")
public Evenement getEvenementById(@PathVariable(value="id") int id) {
	return evenementService.getEvenementById(id);
}

@GetMapping (value ="/evenements/{nom}")
public Evenement getEvenementByNom(@PathVariable (value="nom") String nom) {
	return evenementService.getEvenementByNom(nom);
}

@GetMapping (value ="/evenements/{description}")
public Evenement getEvenementByDescription(@PathVariable (value="description") String description) {
	return evenementService.getEvenementByDescription(description);
}

@GetMapping (value="/evenement/{adresse}")
public Evenement getEvenementByAdresse(@PathVariable (value="adresse") Adresse adresse) {
	return evenementService.getEvenementByAdresse(adresse);
}

@PostMapping(value="/evenement")
@ResponseBody
public Evenement createEvenement(@RequestBody Evenement evenement) {
	return evenementService.createEvenement(evenement);
}

@DeleteMapping(value="/evenement/{id}")
public Evenement deleteEvenement(@PathVariable(value="id") int id) {
	return evenementService.deleteEvenement(id);
}




}