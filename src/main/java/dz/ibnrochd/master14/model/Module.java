package dz.ibnrochd.master14.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name = "module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@ManyToMany(mappedBy = "note_module")
	Set<Etudiant> etud;
	
public Module() {
		
	}

	public Module(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Etudiant> getEtud() {
		return etud;
	}

	public void setEtud(Set<Etudiant> etud) {
		this.etud = etud;
	}
	
	

}
