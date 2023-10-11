package sets;

import java.util.HashSet;

public class TestSetPays {

	public static void main(String[] args) {
		
		HashSet<Pays> paysSet = new HashSet<>();
		paysSet.add(new Pays("Usa", 331000000, 63039.99));
        paysSet.add(new Pays("France", 67100000, 44099.99));
        paysSet.add(new Pays("Allemagne", 83100000, 55664.99));
        paysSet.add(new Pays("Uk", 66650000, 40412.99));
        paysSet.add(new Pays("Italie", 60360000, 34261.99));
        paysSet.add(new Pays("Japon", 126800000, 40849.99));
        paysSet.add(new Pays("Chine", 1444216107, 10429.99));
        paysSet.add(new Pays("Russie", 145912025, 11216.99));
        paysSet.add(new Pays("Inde", 1380004385, 2309.99));
        
        // Recherche du pays avec le PIB par habitant le plus important
        Pays paysAvecMeilleurPIBParHabitant = null;
        double meilleurPIBParHabitant = Double.MIN_VALUE;

        for (Pays pays : paysSet) {
            if (pays.getPibParHabitant() > meilleurPIBParHabitant) {
                meilleurPIBParHabitant = pays.getPibParHabitant();
                paysAvecMeilleurPIBParHabitant = pays;
            }
        }System.out.println(paysAvecMeilleurPIBParHabitant);

        // Recherche du pays avec le PIB total le plus important
        Pays paysAvecMeilleurPIBTotal = null;
        double meilleurPIBTotal = Double.MIN_VALUE;

        for (Pays pays : paysSet) {
            if (pays.getPibTotal() > meilleurPIBTotal) {
                meilleurPIBTotal = pays.getPibTotal();
                paysAvecMeilleurPIBTotal = pays;
            }
        }System.out.println(paysAvecMeilleurPIBTotal);
        
     // Modification du contenu du HashSet pour mettre en majuscule le pays avec le PIB total le plus petit
        Pays paysAvecPlusPetitPIBTotal = null;
        double plusPetitPIBTotal = Double.MAX_VALUE;

        for (Pays pays : paysSet) {
            if (pays.getPibTotal() < plusPetitPIBTotal) {
                plusPetitPIBTotal = pays.getPibTotal();
                paysAvecPlusPetitPIBTotal = pays;
            }
        }

        if (paysAvecPlusPetitPIBTotal != null) {
            paysSet.remove(paysAvecPlusPetitPIBTotal);
            paysAvecPlusPetitPIBTotal.setNom(paysAvecPlusPetitPIBTotal.getNom().toUpperCase());
            paysSet.add(paysAvecPlusPetitPIBTotal);
        }

        // Suppression du pays avec le PIB total le plus petit
        paysSet.remove(paysAvecPlusPetitPIBTotal);

        // Affichage de l'ensemble des pays ainsi modifiés
        for (Pays pays : paysSet) {
            System.out.println("Nom : " + pays.getNom() + ", Habitants : " + pays.getNbHabitations() + ", PIB total : " + pays.getPibTotal());
        }
    }
	}


