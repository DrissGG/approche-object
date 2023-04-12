package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class CompteTaux extends Compte{
	private double tauxRemuneration;
	
	CompteTaux(String numéroCompte, double soldeCompte, double tauxRemuneration){
		super(numéroCompte,soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
		
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return  super.toString() + " tauxRemuneration = " + tauxRemuneration ;
	}
	
}
