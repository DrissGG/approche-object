package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		int montant = 0;
		
		Credit cred1 = new Credit("12/10/2023", 3000);
		Credit cred2 = new Credit("23/07/2021", 7800);
		
		Debit deb1 = new Debit("06/01/2023", 100);
		Debit deb2 = new Debit("19/02/2023", 30);
		
		Operation tabOperation[]  = {cred1, deb2, deb1, cred2};
		
		for(Operation op : tabOperation) {
			
			if(op.getType().equals("CREDIT")) {
				 montant += op.getMontantOpération();
			}else {
				montant -= op.getMontantOpération();
			}
			
			System.out.println(op);
			
		}
		
		System.out.println("MONTANT TOTAL DES OPERATIONS = " + montant );

	}

}
