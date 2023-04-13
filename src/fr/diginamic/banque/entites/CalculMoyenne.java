package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;
import java.util.*;

public class CalculMoyenne {
	private double[] tab;
    private int taille;

    public CalculMoyenne() {
    	tab = new double[0];
        taille = 0;
    }

    public void ajout(double valeur) {
        if (taille >= tab.length) {
        	tab = Arrays.copyOf(tab, tab.length + 1);
        }
        tab[taille] = valeur;
        taille++;
    }
	
	public double calcul() {
        double somme = 0;
        for (double valeur : tab) {
            somme += valeur;
        }
        return somme / taille;
    }
	
}
