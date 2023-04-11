package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adressepostale;
	
	
	Personne(String nom1, String prenom1){
		nom = nom1;
		prenom = prenom1;
		
	}
	
	Personne(String nom2, String prenom2, AdressePostale adressepostale2){
		nom = nom2;
		prenom = prenom2;
		adressepostale = adressepostale2;		
	}
	
	public String getNom() {
		 return this.nom;
	}
	
	public String getPrenom() {
		 return prenom.toUpperCase();
	}
	public AdressePostale getAdresse() {
		 return this.adressepostale;
	}
	
	public void setPrenom(String nvPrenom) {
		 prenom = nvPrenom;
	}
	
	public void setAdress(AdressePostale nvAdress) {
		adressepostale = nvAdress;
	}
	
	
//	@Override
//	public String toString() {
//		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adressepostale=" + adressepostale + "]";
//	}

}
