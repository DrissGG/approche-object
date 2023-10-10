package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maMaison = new Maison(4);
		Piece p1 = new Chambre(73, 1);
		Piece p2 = new Salon(63, 0);
		Piece p3 = new Wc(23, 1);
		Piece p4 = new Cuisine(93, 0);
		
		
		
		maMaison.ajoutPiece(p1);
		maMaison.ajoutPiece(p2);
		maMaison.ajoutPiece(p3);
		
		
		// Calcul de la superficie totale
        System.out.println("Superficie totale de la maison : " + maMaison.getSuperficieTotale());

        // Calcul de la superficie du premier étage
        System.out.println("Superficie du 1er étage : " + maMaison.getSuperficieParEtage(0));
		
        //maMaison.ajoutPiece(null);
        //Piece p5 = new SalleDeBain(-13, 1);
        
        
        // Calcul de la superficie des chambres
        double superficieChambres = maMaison.calculerSuperficieTypePiece(Chambre.class);
        System.out.println("Superficie des chambres : " + superficieChambres);

        // Compter le nombre de chambres
        int nombreChambres = maMaison.compterPiecesType(Chambre.class);
        System.out.println("Nombre de chambres : " + nombreChambres);
	}

}
