package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
	private ArrayList<Ville> listesVilles;

	public Recensement() {
		super();
		listesVilles = new ArrayList<>();
	}

	public ArrayList<Ville> getListesVilles() {
		return listesVilles;
	}

	public void setListesVilles(ArrayList<Ville> listesVilles) {
		this.listesVilles = listesVilles;
	}
	
	//equalsIgnoreCase : rechercher une ville en fonction de son nom, sans vous soucier de la casse.
	public int getPopulation(String nomVille) {
		for(Ville ville : listesVilles) {
			if(ville.getNomCommune().equalsIgnoreCase(nomVille)) {
				return ville.getPopulationTotale();
			}
		}
		return -1;//si la ville n'est pas trouvée
	}
	
	public void chargerDonnees(String nomFichier) {
		ChargerRecensement.charger(nomFichier, this); // "this" représente l'instance actuelle de Recensement
	}
	
}
