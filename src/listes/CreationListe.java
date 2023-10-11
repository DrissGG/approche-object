package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listEntier = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			
			listEntier.add(i); 
			System.out.println(listEntier.get(i-1));
		}
		
		System.out.println("Taille : "+listEntier.size());
	}

}
