package fr.diginamic.essais;
import fr.diginamic.banque.entites.*;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations test1 = new Operations();
		
		System.out.println("a + b = " + test1.calcul(4, 2, '+'));
		System.out.println("a - b = " + test1.calcul(4, 2, '-'));
		System.out.println("a * b = " + test1.calcul(4, 2, '*'));
		System.out.println("a / b = " + test1.calcul(4, 4, '/'));
		
		System.out.println("a / 0 =  " + test1.calcul(4, 0, '/'));
		System.out.println("a & b = "+ test1.calcul(4, 4, '&'));
		

	}

}
