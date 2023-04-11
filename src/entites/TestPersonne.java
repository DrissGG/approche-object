package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale(12, "avenue du moulin", 34000, "Montpellier" );
		Personne person1 = new Personne("hakim", "zyech", adr1);
		
		/*
		person1.nom = "Driss";
		person1.prenom = "solo grande";
		
		person1.adressepostale = new AdressePostale();
		person1.adressepostale.codePostal = 74;
		person1.adressepostale.libelleRue = "rue du four ";
		person1.adressepostale.numRue = 22;
		person1.adressepostale.ville = "Paris"; */
		
		System.out.println(person1);
		
		
		

	}

}
