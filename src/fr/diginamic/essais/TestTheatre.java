package fr.diginamic.essais;
import fr.diginamic.banque.entites.*;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre th1 = new Theatre("louvre", 60);
		
		th1.inscrire(30, 10);
		System.out.println("Total clients inscrits : " + th1.getTotalClientsInscrits());
		System.out.println("Recette totale : " + th1.getRecettetotalEtablissement());
		
		th1.inscrire(10, 10);
		System.out.println("Total clients inscrits : " + th1.getTotalClientsInscrits());
		System.out.println("Recette totale : " + th1.getRecettetotalEtablissement());
		
		th1.inscrire(70, 10);
		System.out.println("Total clients inscrits : " + th1.getTotalClientsInscrits());
		System.out.println("Recette totale : " + th1.getRecettetotalEtablissement());
		
		
	}

}
