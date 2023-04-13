package fr.diginamic;
import fr.diginamic.banque.entites.*;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne calculMoyenne = new CalculMoyenne();
		calculMoyenne.ajout(10.0);
        calculMoyenne.ajout(20.0);
        calculMoyenne.ajout(30.0);

        System.out.println("Moyenne : " + calculMoyenne.calcul());

        calculMoyenne.ajout(40.0);
        calculMoyenne.ajout(50.0);

        System.out.println("Moyenne : " + calculMoyenne.calcul());
	}

}
