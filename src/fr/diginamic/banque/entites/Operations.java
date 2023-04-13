package fr.diginamic.banque.entites;

public class Operations {
	
	public static double calcul(double a, double b, char operateur) {
		double resultat=0;
		
		switch(operateur) {
		case '+':
			resultat =  (a+b);
			break;
		case '-':
			resultat =  (a-b);
			break;
		case '*':
			resultat =  (a*b);
			break;
		case '/':
			if(b==0) {
				System.out.println("impossible de diviser par 0");
			}
			else {
				resultat = a / b;
			}
			break;
		 default:
             System.out.println("Opérateur non reconnu");			
		
		}
		return resultat;
	}
}
