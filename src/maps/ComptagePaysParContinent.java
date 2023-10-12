package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		
		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France",65000000, "Europe"));
		listePays.add(new Pays("Allemagne",80000000, "Europe"));
		listePays.add(new Pays("Belgique",10000000, "Europe"));
		listePays.add(new Pays("Russie",150000000, "Asie"));
		listePays.add(new Pays("Chine",1400000000, "Asie"));
		listePays.add(new Pays("Indonesie",220000000 , "Oceanie"));
		listePays.add(new Pays("Australie",20000000, "Oceanie"));
		
		HashMap<String, Integer> mapPays = new HashMap<>();
		
		for(Pays pays : listePays) {
			String continent = pays.getContinent();
			
			Integer cpt = mapPays.get(continent);
			
			if(cpt == null) {
				cpt = 1;
				
			}
			else {
				cpt++;
			}
			mapPays.put(continent, cpt);
		}
		System.out.println(mapPays);
		
		
		
		
		
	}

}
