package fr.diginamic.formes;

import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle(4);
		Rectangle rect1 = new Rectangle(6, 4);
		Carre carr1 = new Carre(4);
		
		AffichageForme forme = new AffichageForme();
		forme.Afficher(cercle1);
		forme.Afficher(rect1);
		forme.Afficher(carr1);
		

	}

}
