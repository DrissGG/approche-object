package tri;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();

        villes.add(new Ville("New York", 8623000, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 2148000, Continent.EUROPE));
        villes.add(new Ville("Pékin", 21710000, Continent.ASIE));
        villes.add(new Ville("Moscou", 11920000, Continent.EUROPE));
        villes.add(new Ville("Berlin", 3748000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 4630000, Continent.OCEANIE));
        villes.add(new Ville("Sao Paulo", 12180000, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 1088000, Continent.AFRIQUE));

        for (Ville ville : villes) {
            System.out.println(ville.toString());
        }
    }
}
