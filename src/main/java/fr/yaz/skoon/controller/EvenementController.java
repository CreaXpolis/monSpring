package fr.yaz.skoon.controller;

import java.util.List;
import java.util.Optional;

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
  
 @CrossOrigin("*")
 @GetMapping (value ="/evenement")
 public List<Evenement> findAll() {return evenementService.findAll();}
 
@CrossOrigin("*")
@GetMapping (value ="/evenement/{id}")
public Evenement findEvenementById(@PathVariable(value="id") int id) {
	return evenementService.findEvenementById(id);
}

@CrossOrigin("*")
@PostMapping(value="/evenement")
@ResponseBody
public Evenement createEvenement(@RequestBody Evenement evenement) {
	return evenementService.createEvenement(evenement);
}

@DeleteMapping(value="/evenement/id/{id}")
public Evenement deleteEvenement(@PathVariable(value="id") int id) {
	return evenementService.deleteEvenement(id);
}




}