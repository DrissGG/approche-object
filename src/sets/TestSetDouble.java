package sets;

import java.util.HashSet;

public class TestSetDouble {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		for(Double sets : set) {
			System.out.println(sets);
		}
		
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		
		for(Double sets : set) {
			// affiche le plus grand élément de la liste 
			if(sets > max) {
				max = sets;
			}
			//affiche le plus petit élément de la liste
			if(sets < min) {
				min = sets;
			}
			}
		set.remove(min);
		

		System.out.println("le max de la liste set : " +max);
		System.out.println("le min de la liste set : " +min);
		for(Double sets : set) {
			System.out.println("listes modifiee :"+sets);
		}
	}
}
