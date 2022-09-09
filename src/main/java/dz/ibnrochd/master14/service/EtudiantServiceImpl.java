package dz.ibnrochd.master14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Etudiant;
import dz.ibnrochd.master14.repository.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService{
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	public Etudiant saveEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}
	@Override
	public List<Etudiant> getAllEtudiants(){
		return etudiantRepository.findAll();
	}
	public void deleteEtudiant (int id) {
		etudiantRepository.deleteById(id);
	}
	public void Update(Etudiant etudiant)   
	{  
	etudiantRepository.save(etudiant); 
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	
		
	}

