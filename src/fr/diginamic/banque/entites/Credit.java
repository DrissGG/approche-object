package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	Credit(String dateOpération, double montantOpération){
		super(dateOpération, montantOpération);
	}
	
	 @Override
	    public String getType() {
	        return "CREDIT";
	    }
}
