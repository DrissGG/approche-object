package fr.diginamic.banque.entites;

public class Theatre {
	
	private String nom;
	private int  capaciteMax;
	private int totalClientsInscrits;
	private double recettetotalEtablissement;
	
	public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0;
        this.recettetotalEtablissement = 0;
    }
	public void inscrire(int nbClients, double prixPlace) {
		if(capaciteMax > totalClientsInscrits + nbClients) {
			
			totalClientsInscrits += nbClients;
			recettetotalEtablissement += nbClients * prixPlace;
			
		}else {
			System.out.println("La capacite max du theatre est depasser");
		}
	}
	public int getTotalClientsInscrits() {
		return totalClientsInscrits;
	}
	public double getRecettetotalEtablissement() {
		return recettetotalEtablissement;
	}
	
}
