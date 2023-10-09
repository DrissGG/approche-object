package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class Cercle implements ObjetGeometrique{
	private double rayon;
	
	public Cercle(double rayon) {
        this.rayon = rayon;
    }
	
	public double perimetre() {
		return 2*Math.PI*rayon;
		
	}
	public double surface() {
		return Math.PI*rayon*rayon;
	}
	
	public double getPerimetre() {
		return perimetre();
	}
	public double getSurface() {
		return surface();
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	public double getRayon() {
		return rayon;
	}

	
}
