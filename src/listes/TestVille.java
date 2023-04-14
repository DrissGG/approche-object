package listes;

import java.util.ArrayList;
import listes.Ville;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ville> listeVille = new ArrayList<>();
		listeVille.add(new Ville("Nice", 343000));
		listeVille.add(new Ville("Carcassonne", 47800));
		listeVille.add(new Ville("Narbonne", 53400 ));
		listeVille.add(new Ville("Lyon", 484000));
		listeVille.add(new Ville("Foix",9700));
		listeVille.add(new Ville("Pau", 77200));
		listeVille.add(new Ville("Marseille",850700));
		listeVille.add(new Ville("Tarbes",40600));
	}

}
