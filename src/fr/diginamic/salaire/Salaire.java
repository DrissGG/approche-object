package fr.diginamic.salaire;

public class Salaire extends Intervenant{
	
	private double salaireMensuel;
	private String statut;

	public Salaire(String nom, String prenom, double salaireMensuel, String statut) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
        this.statut = statut;
    }

	@Override
	public double getSalaire() {
		return salaireMensuel;		
	}
	

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return statut;
	}
	
	
	

}
