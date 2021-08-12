package fr.yaz.skoon.controller;

import java.util.List;

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
	
  @CrossOrigin("*")
  @GetMapping (value ="/skooner")
  public List<Skooner> findAll() {return skoonerService.findAll();
	
  }
	
  @GetMapping(value="/skooner/{id}")
  public Skooner findSkoonerById(@PathVariable(value="id")int id) {
  return skoonerService.findSkoonerById(id);

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
