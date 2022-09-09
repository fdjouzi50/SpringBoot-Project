package dz.ibnrochd.master14.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master14.model.Etudiant;
import dz.ibnrochd.master14.service.EtudiantService;

@RestController
@RequestMapping("/Etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantService etudiantService;
	
	@PostMapping("/add")
	public String add(@RequestBody Etudiant etudiant) {
		etudiantService.saveEtudiant(etudiant);
		return "Etudiant ajouté";
	}
	@GetMapping("/getAll")
	public List<Etudiant> getALLEtudiants(){
		return etudiantService.getAllEtudiants();
	}
	
	@DeleteMapping("/Etudiant/{id}")  
	private void deleteEtudiant(@PathVariable int id)   
	{  
	etudiantService.deleteById(id);  
	}
	
	@PutMapping("/Etudiants")  
	private Etudiant update(@RequestBody Etudiant etudiant)   
	{  
	etudiantService.Update(etudiant);  
	return etudiant;  
	}
	
}

