package fr.diginamic.recensement;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Recensement recensement = new Recensement();
		ChargerRecensement.charger("C:/Users/driss/Documents/recensement.csv", recensement);
		Scanner scanner = new Scanner(System.in);
		
		int choix;
		do {
			//affiche le menu
			 System.out.println("Menu:");
	         System.out.println("1. Population d'une ville donnée");
	         System.out.println("2. Population d'un département donné");
	         System.out.println("3. Population d'une région donnée");
	         System.out.println("4. Afficher les 10 régions les plus peuplées");
	         System.out.println("5. Afficher les 10 départements les plus peuplés");
	         System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
	         System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
	         System.out.println("8. Afficher les 10 villes les plus peuplées de France");
	         System.out.println("9. Sortir");

	         System.out.print("Entrez votre choix: ");
	         choix = scanner.nextInt();
	         scanner.nextLine();
	         
	         switch(choix) {
	         case 1:
                 RecherchePopulationVille recherche = new RecherchePopulationVille();
                 recherche.traiter(recensement, scanner);
                 break;
             case 2:
                 Departement rechercheDepartement = new Departement();
                 rechercheDepartement.traiter(recensement, scanner);
                 break;
             case 3:
                 Region rechercheRegion = new Region();
                 rechercheRegion.traiter(recensement, scanner);
                 break;
             case 4:
            	 Region top10Regions = new Region();
                 top10Regions.traiterTop10Regions(recensement);
                 break;
             case 5:
                 Departement top10Departements = new Departement();
                 top10Departements.traiterTop10Departements(recensement);
                 break;
             case 6:
                  RechercheVillesDepartement villeDepart = new RechercheVillesDepartement();
                  villeDepart.traiter(recensement, scanner);
                 break;
             case 7:
                 RechercheVillesRegion villeD = new RechercheVillesRegion();
                 villeD.traiter(recensement, scanner);
                 break;
             case 8:
                 RecherchesVilleFrance villeFrance = new RecherchesVilleFrance();
                 villeFrance.traiter(recensement, scanner);
                 break;
             case 9:
                 System.out.println("Au revoir !");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Choix invalide. Veuillez sélectionner une option valide.");
	         
	         }
	         
	         
		}while(choix !=9);
		

	}

}
