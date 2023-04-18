package maps;
import java.util.*;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("Clés dans la map :");
		for(Integer cley : mapVilles.keySet()) {
			System.out.println(cley);
		}
		
		System.out.println("Valeurs dans la map :");
		for(String valeurs : mapVilles.values()) {
			System.out.println(valeurs);
		}
		
		System.out.println("Taille de la map : " + mapVilles.size());
		
	}

}
