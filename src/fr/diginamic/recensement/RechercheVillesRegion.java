package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez saisir le nom de la région :");
        String nomRegion = scanner.nextLine();

        List<Ville> villesDansRegion = new ArrayList<>();

        // Parcourez la liste des villes et ajoutez celles de la région spécifiée
        for (Ville ville : recensement.getListesVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                villesDansRegion.add(ville);
            }
        }

        // Triez les villes par population de manière décroissante
        Collections.sort(villesDansRegion, (v1, v2) -> v2.getPopulationTotale().compareTo(v1.getPopulationTotale()));

        int count = 0;
        for (Ville ville : villesDansRegion) {
            if (count < 10) {
                System.out.println("Ville : " + ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
                count++;
            } else {
                break;
            }
        }
    }
}

