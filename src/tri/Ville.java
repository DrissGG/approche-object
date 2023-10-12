package tri;


import java.util.ArrayList;
import java.util.Iterator;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private Integer nbHabitants;
	private Continent continent;
	
	public Ville(String nom, Integer nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
//		this.continent = continent;
	}
	  
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
//		return this.nom.compareTo(o.getNom());
		return this.nbHabitants.compareTo(o.getNbHabitants());
		
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants +"]";
	}
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
			}
			Ville other = (Ville) object;
			return nom.equals(other.getNom());

	}

	public Continent getContinent() {
		return continent;
	}
	
	
	
	
	
}
