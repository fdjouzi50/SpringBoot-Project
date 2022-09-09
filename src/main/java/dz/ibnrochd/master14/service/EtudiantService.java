package dz.ibnrochd.master14.service;

import java.util.List;

import dz.ibnrochd.master14.model.Etudiant;

public interface EtudiantService {
	public Etudiant saveEtudiant(Etudiant etudiant);
	public List<Etudiant> getAllEtudiants();
	public void deleteEtudiant(int id);
	public void Update(Etudiant etudiant);
	public void deleteById(int id);

}
