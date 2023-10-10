package utils;
import fr.diginamic.banque.entites.*;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(3);
		
		Cercle cercle2 = new Cercle(8.6);
		
		System.out.println("Perimetre : " + cercle1.getPerimetre() + " Surface : " + cercle1.getSurface());
		System.out.println("Perimetre : " + cercle2.getPerimetre() + " Surface : " + cercle2.getSurface());
		
		System.out.println("   Test de la class static CercleFactory :  ");
		Cercle nouveauCercle = CercleFactory.createdCercle(23.2);
		
		System.out.println("Rayon : " + nouveauCercle.getRayon() + " /" +" Perimetre : " + nouveauCercle.getPerimetre() + " Surface : " + nouveauCercle.getSurface());
		
	}

}
