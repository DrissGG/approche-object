package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listeEntiers = new ArrayList<>();
		listeEntiers.add(-1);
		listeEntiers.add(5);
		listeEntiers.add(7);
		listeEntiers.add(3);
		listeEntiers.add(-2);
		listeEntiers.add(4);
		listeEntiers.add(8);
		listeEntiers.add(5);
		
		for(int entier : listeEntiers) {
			System.out.println(entier); // Affichez tous les éléments de la liste			
		}
		
		System.out.println("TAILLE LISTE : " + listeEntiers.size());
		
		int max = Integer.MIN_VALUE;
		for(int nbre : listeEntiers) {
			if(nbre > max) {
				max = nbre;
			}
		}
		System.out.println("Max de la Liste: " + max);
		
//		vaut mieux utiliser integer car il va supprimer la valeur qui est -2
//		si nous mettons (int min) ca va supprimer l'index -2 .
		Integer min = Integer.MAX_VALUE;
		for(int i=0; i<listeEntiers.size();i++) {
			int nb = listeEntiers.get(i);			
			if(nb < min) {
				min = nb;
			}
		}
		listeEntiers.remove(min);		
		System.out.println("La Liste: " + listeEntiers);
		
		for(int i=0; i<listeEntiers.size();i++) {
			int entier = listeEntiers.get(i);	
			if(entier < 0) {
				int res = Math.abs(entier);
				listeEntiers.set(i, res);
			}
			
		}
		System.out.println("La liste positive est : " + listeEntiers);
		

}
}
