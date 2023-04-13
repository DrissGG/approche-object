package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class CercleFactory {
	
	public static Cercle createdCercle(double rayon) {
		return new Cercle(rayon);
	}
}
