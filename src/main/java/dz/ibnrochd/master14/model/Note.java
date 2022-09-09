package dz.ibnrochd.master14.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	
        @Column(name = "etudiant_id")
	    int etudiantId;

	    @Column(name = "module_id")
	    int moduleId;
	    
	    @Column(name = "note")
	    float note;
	    
	    public Note() {
			
		}

		public Note(int id, int etudiantId, int moduleId, float note) {
			super();
			this.id = id;
			this.etudiantId = etudiantId;
			this.moduleId = moduleId;
			this.note = note;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getEtudiantId() {
			return etudiantId;
		}

		public void setEtudiantId(int etudiantId) {
			this.etudiantId = etudiantId;
		}

		public int getModuleId() {
			return moduleId;
		}

		public void setModuleId(int moduleId) {
			this.moduleId = moduleId;
		}

		public float getNote() {
			return note;
		}

		public void setNote(float note) {
			this.note = note;
		}

		

		
		}
		
		
	   
