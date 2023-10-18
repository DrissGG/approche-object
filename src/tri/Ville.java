package tri;

public class Ville implements Comparable<Ville>{
	
	private String nom;
	private Integer nbHabitants;
	private Continent continent;
	
	public Ville(String nom, Integer nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
//		this.continent = continent;
	}
	  
	

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
//		return this.nom.compareTo(o.getNom());
		return this.nbHabitants.compareTo(o.getNbHabitants());
		
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants +"]";
	}
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
			}
			Ville other = (Ville) object;
			return nom.equals(other.getNom());
	}
	

	public Continent getContinent() {
		return continent;
	}



	/** Getters
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setters
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getters
	 * @return the nbHabitants
	 */
	public Integer getNbHabitants() {
		return nbHabitants;
	}



	/** Setters
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}



	/** Setters
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	
	
	
	
}
