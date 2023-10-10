package fr.diginamic.formes;

public class Cercle extends Formes {
	private double rayon; 
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}	

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(rayon,2);
	}

	@Override
	public double calculerPerimetre() {
		return 2*Math.PI*rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	

}
