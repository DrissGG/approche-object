package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> setsCountry = new HashSet<>();
		setsCountry.add("USA");
		setsCountry.add("France");
		setsCountry.add("Allemagne");
		setsCountry.add("UK");
		setsCountry.add("ITALIE");
		setsCountry.add("Japon");
		setsCountry.add("Chine");
		setsCountry.add("Russie");
		setsCountry.add("Inde");
		
		int maxLetters = 0;
		String lenghtCountry = "";
		
		for(String country : setsCountry) {
			if(country.length() > maxLetters) {
				maxLetters = country.length();		
				lenghtCountry = country;
			}
		}
		System.out.println("le pays avec le plus grand nombre de lettre : "+lenghtCountry);
		setsCountry.remove(lenghtCountry);

		System.out.println("tous les pays :");
		for(String country : setsCountry) {
			System.out.println(country);
		}
		
		

	}

}
