package fr.diginamic.testenumeration;
import fr.diginamic.*;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Saison saison : Saison.values()) {
			System.out.println(saison.getLibelle());
		}
		String nom = "ETE" ;
		Saison saisonETE = Saison.valueOf(nom);
		System.out.println("libellé de la saison " + nom + " est " + saisonETE.getLibelle());
		
		// retrouver une instance de Saison en fonction du libellé
        String libelle = "Hiver";
        Saison saisonHiver = Saison.getByLibelle(libelle);
        if (saisonHiver == Saison.HIVER) {
            System.out.println("La méthode getByLibelle() a renvoyé HIVER");
        } else {
            System.out.println("Erreur : la méthode getByLibelle() n'a pas renvoyé HIVER");
        }
		
		
		
	}

}
