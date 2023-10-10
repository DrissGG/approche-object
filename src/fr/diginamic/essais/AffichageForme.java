package fr.diginamic.essais;

import fr.diginamic.formes.Formes;

public class AffichageForme {
	
	public void Afficher(Formes form1) {
		System.out.println("Le perimetre de la forme "+form1.calculerPerimetre()); 
		System.out.println("La surface de la forme "+form1.calculerSurface());
	}

}
