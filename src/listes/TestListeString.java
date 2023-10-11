package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listeVille = new ArrayList<>();
		listeVille.add("Nice");
		
		listeVille.add("Carcassonne");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Tarbes");
		
		String villeLongue = "";
		for (String ville : listeVille) {
            if (ville.length() > villeLongue.length()) {
            	villeLongue = ville;
            }
        }
		System.out.println("villes avec le plus grand nombre de lettres: "  + villeLongue);
		
		for(int i=0; i<listeVille.size(); i++) {
			System.out.println("Villes en Maj: " + listeVille.get(i).toUpperCase() );
		}
		
	
		Iterator<String> iter = listeVille.iterator();
		while(iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
            	iter.remove();
            }
		}
		System.out.println("Les villes affiche le nom commence par la lettre N: " + listeVille);
		
	}

}
