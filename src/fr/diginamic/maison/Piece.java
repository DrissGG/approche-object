package fr.diginamic.maison;

import javax.print.DocFlavor.STRING;

public abstract class Piece {
	private double superficie;
	private int numEtage;
	
	public Piece(double superficie, int numEtage) {
		super();
		if (superficie >= 0 && numEtage >= 0) {
			this.superficie = superficie;
			this.numEtage = numEtage;
		}else {
            throw new IllegalArgumentException("La superficie et l'étage doivent être positifs ou nuls.");
        }
	}
	
	public abstract String getType();

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

}
