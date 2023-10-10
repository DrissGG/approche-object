package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salaire;

public class TestIntervenant {

	public static void main(String[] args) {
		Salaire salarie1 = new Salaire("Gzz", "Driss", 20000.3,"CDI");
		Pigiste pig1 = new Pigiste("DOREE", "Chloe", 10, 100.0);
		
//		System.out.println("Salaire du salarié : " + salarie1.getSalaire()); 
//		System.out.println("Salaire du pigiste : " +pig1.getSalaire());
		
		System.out.println("Données du salarié :");
		salarie1.afficherDonnees();
		System.out.println("\nDonnées du pigiste :");
		pig1.afficherDonnees();
		

	}

}
