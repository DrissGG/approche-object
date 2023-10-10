package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	private int nbJoursTravailleeDurantLeMois;
	private double montantJournalier;
	
	
	public Pigiste(String nom, String prenom, int nbJoursTravailleeDurantLeMois, double montantJournalier) {
		super(nom, prenom);
		this.nbJoursTravailleeDurantLeMois = nbJoursTravailleeDurantLeMois;
		this.montantJournalier = montantJournalier;
	}

	public double getSalaire() {
		return montantJournalier*nbJoursTravailleeDurantLeMois;		
	}

	public int getNbJoursTravailleeDurantLeMois() {
		return nbJoursTravailleeDurantLeMois;
	}

	public void setNbJoursTravailleeDurantLeMois(int nbJoursTravailleeDurantLeMois) {
		this.nbJoursTravailleeDurantLeMois = nbJoursTravailleeDurantLeMois;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}
}
