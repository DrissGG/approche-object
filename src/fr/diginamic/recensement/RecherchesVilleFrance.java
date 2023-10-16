package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RecherchesVilleFrance extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Récupérez la liste de toutes les villes du recensement
        List<Ville> villes = recensement.getListesVilles();

        // Triez les villes par population de manière décroissante
        Collections.sort(villes, (v1, v2) -> v2.getPopulationTotale().compareTo(v1.getPopulationTotale()));

        // Affichez les 10 villes les plus peuplées de France
        System.out.println("Les 10 villes les plus peuplées de France :");
        int count = 0;
        for (Ville ville : villes) {
            if (count < 10) {
                System.out.println("Ville : " + ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
                count++;
            } else {
                break;
            }
        }
    }
}
