package listes;
import java.util.ArrayList;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		ArrayList<String> liste3 = new ArrayList<String>();
		for(String couleur : liste1) {
			liste3.add(couleur);
		}
		for(String couleur : liste2) {
			liste3.add(couleur);
		}
		System.out.println("Liste 3 : " + liste3);

	}

}
