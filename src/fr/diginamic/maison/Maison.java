package fr.diginamic.maison;

public class Maison {
	private Piece[] tabPieces;
	private int nombrePiece;
	
	public Maison(int capciteMaxPiece) {
		super();
		this.tabPieces = new Piece[capciteMaxPiece];
		nombrePiece = 0;
	}
	
	public void ajoutPiece(Piece piece) {
	
		if(piece!=null ){
			if(nombrePiece< tabPieces.length ) {
				tabPieces[nombrePiece] = piece;
				nombrePiece++;
			}else {
			System.out.println("La maison est pleine, impossible d'ajouter une nouvelle pièce.");
			}
		}else {
	        System.out.println("La pièce à ajouter est null, veuillez fournir une pièce valide.");
	    }
	}
	
	public double getSuperficieTotale() {
		double superficietotale = 0;
		
		for(int i=0;i<nombrePiece;i++) {
			superficietotale +=tabPieces[i].getSuperficie();
		}
		return superficietotale;
	}
	
	public double getSuperficieParEtage(int etage) {
		double superficieEtage = 0;
		
		for(int i=0;i<nombrePiece;i++) {
			if(tabPieces[i].getNumEtage() == etage) {
				superficieEtage +=tabPieces[i].getSuperficie();				
			}
		}
		return superficieEtage;
	}
	
	 public double calculerSuperficieTypePiece(Class<?> typePiece) {
		 double superficieTypePiece = 0.0;
	       for (int i = 0; i < nombrePiece; i++) {
	    	   if (typePiece.isInstance(tabPieces[i])) {
	    		   superficieTypePiece += tabPieces[i].getSuperficie();
	    		   }
	    	   }
	       return superficieTypePiece;
	 }
	 
	 public int compterPiecesType(Class<?> typePiece) {
		 int nombrePiecesType = 0;
	     for (int i = 0; i < tabPieces.length; i++) {
	    	 if (tabPieces[i] !=null && typePiece.equals(tabPieces[i].getClass())) {
	    		 nombrePiecesType++;
	    	 }
	     }
	     return nombrePiecesType;
	 }
	
	
}

