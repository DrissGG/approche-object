package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String dateOpération;
	private double montantOpération;
	
	public Operation(String dateOpération, double montantOpération) {
		super();
		this.dateOpération = dateOpération;
		this.montantOpération = montantOpération;
	}

	public String getDateOpération() {
		return dateOpération;
	}

	public void setDateOpération(String dateOpération) {
		this.dateOpération = dateOpération;
	}

	public double getMontantOpération() {
		return montantOpération;
	}

	public void setMontantOpération(double montantOpération) {
		this.montantOpération = montantOpération;
	}
	public abstract String getType();
	@Override
	public String toString() {
		return "Operation [dateOpération=" + dateOpération + ", montantOpération= " + montantOpération + ", TYPE : " + getType() + " ]";
	}
	
	
	
}
