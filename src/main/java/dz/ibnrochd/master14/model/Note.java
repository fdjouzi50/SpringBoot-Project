package dz.ibnrochd.master14.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Note {


	    @Column(name = "etudiant_id")
	    int etudiantId;

	    @Column(name = "module_id")
	    int moduleId;
	    
	    @Column(name = "note")
	    float note;
	    
	    public Note() {
			
		}

		public Note(int etudiantId, int moduleId, float note) {
			super();
			this.etudiantId = etudiantId;
			this.moduleId = moduleId;
			this.note = note;
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
		
		
	   
