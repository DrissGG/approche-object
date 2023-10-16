package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Region extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez saisir le nom de la région que vous souhaitez consulter :");
        String nomRegion = scanner.nextLine();

        double populationRegion = 0;

        // Parcourez la liste des villes et ajoutez la population des villes de la région spécifiée
        for (Ville ville : recensement.getListesVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationRegion += ville.getPopulationTotale();
            }
        }

        if (populationRegion > 0) {
            System.out.println("Population de la région " + nomRegion + " : " + populationRegion);
        } else {
            System.out.println("La région " + nomRegion + " n'a pas été trouvée ou a une population de zéro.");
        }
	   
		
	}
	
	public void traiterTop10Regions(Recensement recensement) {
        Map<String, Integer> populationPerRegion = new HashMap<>();

        for (Ville ville : recensement.getListesVilles()) {
            String nomRegion = ville.getNomRegion();
            int populationRegion = populationPerRegion.getOrDefault(nomRegion, 0);
            populationPerRegion.put(nomRegion, populationRegion + ville.getPopulationTotale());
        }

        ArrayList<Map.Entry<String, Integer>> sortedRegions = new ArrayList<>(populationPerRegion.entrySet());
        sortedRegions.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int count = 0;
        for (Map.Entry<String, Integer> regionEntry : sortedRegions) {
            if (count < 10) {
                System.out.println(regionEntry.getKey() + " - Population : " + regionEntry.getValue());
                count++;
            } else {
                break;
            }
        }
	}
	
	
}
