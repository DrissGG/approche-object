package fr.diginamic.recensement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChargerRecensement {

	public static void charger(String nomFichier, Recensement recensement) {
		//Path pathFile = Paths.get("tp 16 - recensement population 2016.csv");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
            String ligne;
            
            // Ignorez la première ligne si elle contient des en-têtes
            reader.readLine();
			
            while((ligne = reader.readLine()) != null) {
            	String[] separateur = ligne.split(";");
            	
            	if(separateur.length >=6) {
            		String codeRegion = separateur[0];
            		String nomRegion = separateur[1];
            		String codeDepartement = separateur[2];
            		String codeCommune = separateur[5];
            		String nomCommune = separateur[6];
            		int populationTotale = Integer.parseInt(separateur[9].replaceAll(" ", ""));
            		
            		Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
                	recensement.getListesVilles().add(ville);
            	}
            	
            	
            }
            reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	

}
