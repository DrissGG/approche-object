package fr.diginamic.maison;

import javax.print.DocFlavor.STRING;

public class Chambre extends Piece{

	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String getType() {
		return "Chambre";
	}

}
