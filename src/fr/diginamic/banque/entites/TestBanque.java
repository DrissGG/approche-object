package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte moncompte =  new Compte("343", 23.3444);
		System.out.println(moncompte);
		
		
		Compte compteNormal = new Compte("N°22", 3422.232);
		CompteTaux compteTaux = new CompteTaux("N°19", 23.8, 11.3);
		
		Compte tabCompte[] = {compteNormal,compteTaux};
		
		for(int i=0; i<2; i++){
			System.out.println(tabCompte[i]);
		}		

	}

}
