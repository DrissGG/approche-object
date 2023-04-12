package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur){
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public double perimetre() {
		return 2*(longueur + largeur);
	}
	public double surface() {
		return largeur*longueur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

}
