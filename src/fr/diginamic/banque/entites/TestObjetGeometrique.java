package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cercle cercle = new Cercle(3.7);
		Rectangle rectangle = new Rectangle(7, 3.8);
		
		ObjetGeometrique tableauObjet[] = {cercle, rectangle};
		
		for(ObjetGeometrique objet : tableauObjet) {
			System.out.println(objet);
			System.out.println("PERIMETRE = " + objet.perimetre());
			System.out.println("SURFACE = " + objet.surface());
		}

	}

}
