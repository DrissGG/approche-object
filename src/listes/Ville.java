package listes;


import java.util.ArrayList;
import java.util.Iterator;

public class Ville {
	
	private String nom;
	private double nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	  
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	
}
