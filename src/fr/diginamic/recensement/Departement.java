package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Departement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez saisir le code du département que vous souhaitez consulter :");
		String codeDepartement = scanner.nextLine();

		int populationDepartement = 0;
		// Parcourez la liste des villes et additionnez la population des villes du département spécifié
		for (Ville ville : recensement.getListesVilles()) {
			if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				populationDepartement += ville.getPopulationTotale();
				}
		    }

		    if (populationDepartement > 0) {
		        System.out.println("Population du département " + codeDepartement + " : " + populationDepartement);
		    } else {
		        System.out.println("Le département " + codeDepartement + " n'a pas été trouvé ou a une population de zéro.");
		    }
        
	}
	

    public void traiterTop10Departements(Recensement recensement) {
        Map<String, Integer> populationPerDepartement = new HashMap<>();

        for (Ville ville : recensement.getListesVilles()) {
            String codeDepartement = ville.getCodeDepartement();
            int populationDepartement = populationPerDepartement.getOrDefault(codeDepartement, 0);
            populationPerDepartement.put(codeDepartement, populationDepartement + ville.getPopulationTotale());
        }

        ArrayList<Map.Entry<String, Integer>> sortedDepartements = new ArrayList<>(populationPerDepartement.entrySet());
        sortedDepartements.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int count = 0;
        for (Map.Entry<String, Integer> departementEntry : sortedDepartements) {
            if (count < 10) {
                System.out.println(departementEntry.getKey() + " - Population : " + departementEntry.getValue());
                count++;
            } else {
                break;
            }
        }
    }


}
