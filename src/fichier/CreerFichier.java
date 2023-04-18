package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import fichier.*;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFile = Paths.get("C:/Users/driss/Documents/recensement.csv"); // emplacement du fichier 
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		for(int i=0;i<100; i++) {
			System.out.println(lines.get(i));			
		}
		
		
		
	}

}
