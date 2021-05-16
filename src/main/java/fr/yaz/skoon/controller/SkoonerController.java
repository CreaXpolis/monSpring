package fr.yaz.skoon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.yaz.skoon.model.Skooner;

@RestController 
@RequestMapping ("/mon-profil")

public class SkoonerController {
	
	@CrossOrigin
	@GetMapping ("/Skooner/")
	
	ResponseEntity<Skooner> getArtistToto() {
        Skooner profil = new Skooner ();
        profil.setAge(19);
        profil.setMail("gtgtgt@gmail.com");
        profil.setName("Rocky");
        profil.setPrenom("Balboa");
        return ResponseEntity.ok().body(profil);
	}
	
}
