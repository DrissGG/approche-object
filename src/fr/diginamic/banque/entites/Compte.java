package fr.diginamic.banque.entites;

public class Compte {
	 private String numéroCompte;
	 private double soldeCompte;
	 
	 Compte(String numéroCompte1, double soldeCompte1){
		 numéroCompte = numéroCompte1;
		 soldeCompte = soldeCompte1;
	 }
	 public String getNumeroCompte() {
	        return numéroCompte;
	    }

	@Override
	public String toString() {
		return "Compte [numéroCompte=" + numéroCompte + ", soldeCompte=" + soldeCompte + "]";
	}
}
