package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesDepartement extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Veuillez saisir le code du département :");
        String codeDepartement = scanner.nextLine();

        // Créez une liste des villes du département spécifié
        List<Ville> villesDansDepartement = new ArrayList<>();
        for (Ville ville : recensement.getListesVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
                villesDansDepartement.add(ville);
            }
        }

        // Triez les villes par population de manière décroissante
        Collections.sort(villesDansDepartement, (v1, v2) -> v2.getPopulationTotale().compareTo(v1.getPopulationTotale()));

        // Affichez les 10 villes les plus peuplées du département
        int count = 0;
        for (Ville ville : villesDansDepartement) {
            if (count < 10) {
                System.out.println("Ville : " + ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
                count++;
            } else {
                break;
            }
        }
		
	}

}
