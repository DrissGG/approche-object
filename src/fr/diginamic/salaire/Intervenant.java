package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	// Méthode abstraite pour obtenir le statut
	public abstract String getStatut();
	
	public void afficherDonnees() {
		System.out.println("Nom :"+ nom);
		System.out.println("Prenom :"+prenom);
		System.out.println("Salaire :"+getSalaire());
		System.out.println("Statut: " + getStatut());
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
