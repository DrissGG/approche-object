package fr.diginamic.banque.entites;

public class Debit extends Operation{

	Debit(String dateOpération, double montantOpération) {
		super(dateOpération, montantOpération);
		
	}
	 @Override
	    public String getType() {
	        return "DEBIT";
	    }
	

}
