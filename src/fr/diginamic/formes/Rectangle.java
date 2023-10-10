package fr.diginamic.formes;

public class Rectangle extends Formes{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return largeur*longueur;
	}

	@Override
	public double calculerPerimetre() {
		return (longueur+largeur)*2;
	}

}
