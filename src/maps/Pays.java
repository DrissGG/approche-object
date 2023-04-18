package maps;

public class Pays {
	String nom;
	Integer nombreHabitants;
	String continent;
	public Pays(String nom, Integer nombreHabitants, String continent) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
		this.continent = continent;
	}
	public String getNom() {
		return nom;
	}
	public Integer getNombreHabitants() {
		return nombreHabitants;
	}
	public String getContinent() {
		return continent;
	}
	
	
	
	
	
}
