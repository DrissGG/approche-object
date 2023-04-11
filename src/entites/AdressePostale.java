package entites;

public class AdressePostale {
	
	int numRue ;
	String libelleRue;
	int codePostal;
	String ville;
	
	// Constructeur appeler par new 
	
	AdressePostale(){
		System.out.println("coucou");
	}
	
	@Override
	public String toString() {
		return "AdressePostale [numRue=" + numRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}
	
	

}
