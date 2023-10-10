package utils;
import fr.diginamic.banque.entites.*;

public class CercleFactory {
	
	public static Cercle createdCercle(double rayon) {
		return new Cercle(rayon);
		
	}
}
