package sets;

import java.util.HashSet;

public class Pays {
	private String nom;
	private double nbHabitations;
	private double pibParHabitant;
	
	public Pays(String nom, double nbHabitations, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitations = nbHabitations;
		this.pibParHabitant = pibParHabitant;
	}
	public String getNom() {
		return nom;
	}
	public double getNbHabitations() {
		return nbHabitations;
	}
	public double getPibParHabitant() {
		return pibParHabitant;
	}
	 public double getPibTotal() {
	     return nbHabitations * pibParHabitant;
	    }
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitations=" + nbHabitations + ", pibParHabitant=" + pibParHabitant + "]";
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setNbHabitations(double nbHabitations) {
		this.nbHabitations = nbHabitations;
	}
	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	
	
	
}
