package fichier;
import fichier.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Ville> villes = new ArrayList<>();
		
		Path pathFile = Paths.get("C:/Users/driss/Documents/recensement.csv");  
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		System.out.println(lines);
		
		
		ArrayList<Ville> villesDePlusDe25000Habitants = new ArrayList<>() ; 
		
		for(int i=1; i<lines.size(); i++) {

			String[] separateur = lines.get(i).split(";");			
			Ville laVille = new Ville(separateur[6],separateur[2],separateur[0],Double.parseDouble(separateur[7].replaceAll(" ","")));
			
			
			if(laVille.getPopulationTotale() > 25000) {
				villesDePlusDe25000Habitants.add(laVille);
			}
		}
		System.out.println(villesDePlusDe25000Habitants.size());
			
		ArrayList<String> fichierSortie = new ArrayList<>();
		
		for(int i=0; i<villesDePlusDe25000Habitants.size() ;i++) {
			fichierSortie.add(villesDePlusDe25000Habitants.get(i).toString());
		}
		
		Path pathDest = Paths.get("C:/Users/driss/Documents/fichiersortieVille.txt");
		Files.write(pathDest, fichierSortie);
		
	}

	

}
