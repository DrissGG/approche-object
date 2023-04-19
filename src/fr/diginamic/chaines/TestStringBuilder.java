package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder build = new StringBuilder();
		long debut = System.currentTimeMillis();
		
		 for (int i = 1; i <= 100000; i++) {
			 build.append(i); 
		    
	        }
		 // Code à chronométrer
	     long fin = System.currentTimeMillis();	    
	     System.out.println(build.toString());
	     System.out.println("Temps mis avec StringBuilder en millisecondes :" + (fin - debut));
	     
	  // Chronométrage avec la classe String et l'opérateur +
	        long startTime2 = System.currentTimeMillis();
	        String s = "";
	        for (int i = 1; i <= 100000; i++) {
	            s += i;
	        }
	        long endTime2 = System.currentTimeMillis();
	        System.out.println("Temps mis avec String et l'opérateur + : " + (endTime2 - startTime2) + " ms");
	   
	     
		
	}

}
