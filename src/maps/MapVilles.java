package maps;
import java.util.*;
import fichier.Ville;

import fichier.*;

public class MapVilles {

	public static void main(String[] args) {
		
		Ville city1 = new Ville("Marseille", "13", "Bouches-du-Rhône", 344.000);
		Ville city2 = new Ville("Montpellier", "34", "Occitanie", 244.000);
		Ville city3 = new Ville("Nantes", "44", "Pays de la Loire", 600.000);
		Ville city4 = new Ville("Paris", "75", "Ile de France", 2258371.0);
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put(city1.getName(), city1);
		mapVilles.put(city2.getName(), city2);
		mapVilles.put(city3.getName(), city3);
		mapVilles.put(city4.getName(), city4);
		
//		System.out.println("Affichage des villes " + mapVilles);
		int minhab = Integer.MAX_VALUE;
		double villemoinsHabitant =0;
		String keyCity = "";
		
		for(String name : mapVilles.keySet() ){	
			Ville city = mapVilles.get(name);
			
			if(city.getPopulationTotale() < minhab) {
				villemoinsHabitant = city.getPopulationTotale();	
				keyCity = name;
			}			
		}
		mapVilles.remove(keyCity);
		System.out.println(mapVilles);
		System.out.println(mapVilles.size());		
		 

	}

}
