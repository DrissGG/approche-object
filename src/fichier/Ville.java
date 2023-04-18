package fichier;

public class Ville {
	private String name;
	private String codeDepartement;
	private String nameRegion;
	private Double populationTotale;
	
	public Ville(String name, String codeDepartement, String nameRegion, Double populationTotale) {
		super();
		this.name = name;
		this.codeDepartement = codeDepartement;
		this.nameRegion = nameRegion;
		this.populationTotale = populationTotale;
	}

	public String getName() {
		return name;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public Double getPopulationTotale() {
		return populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [name=" + name + ", codeDepartement=" + codeDepartement + ", nameRegion=" + nameRegion
				+ ", populationTotale=" + populationTotale + "]";
	}
	
	
}
