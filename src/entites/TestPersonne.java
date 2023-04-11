package entites;
import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne person1 = new Personne();
		
		
		person1.nom = "Driss";
		person1.prenom = "solo grande";
		
		person1.adressepostale = new AdressePostale();
		person1.adressepostale.codePostal = 74;
		person1.adressepostale.libelleRue = "rue du four ";
		person1.adressepostale.numRue = 22;
		person1.adressepostale.ville = "Paris";
		
		System.out.println(person1);
		
		
		

	}

}
