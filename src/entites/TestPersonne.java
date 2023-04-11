package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale adr1 = new AdressePostale(12, "avenue du moulin", 34000, "Montpellier" );
		Personne person1 = new Personne("hakim", "zyech", adr1);
		
		person1.setPrenom("Driss");
		person1.setAdress(adr1);
		
		
		
		System.out.println(person1.getNom());
		System.out.println(person1.getPrenom());
		System.out.println(person1.getAdresse());
		
		
		
		
		

	}

}
