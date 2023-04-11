package entites;

public class AdressePostale {
	
	int numRue ;
	String libelleRue;
	int codePostal;
	String ville;
	
	// Constructeur appeler par new 
	
	AdressePostale(int numRue1,String libelleRue1,int codePostal1,String ville1){
		numRue = numRue1;
		libelleRue = libelleRue1;
		codePostal = codePostal1;
		ville = ville1;
		
	}
	
	
	@Override
	public String toString() {
		return "AdressePostale [numRue=" + numRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}
	
	

}
