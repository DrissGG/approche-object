package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		 System.out.print("Entrez le nom de la ville : ");
	     String nomVille = scanner.nextLine();
	     
	     int population = recensement.getPopulation(nomVille);
	     
	     if(population != -1) {
	    	 System.out.println("la population de " + nomVille + " est de "+ population);
	     }else {
	    	 System.out.println("La ville non trouvée. ");
	     }
		
		
	}

}
