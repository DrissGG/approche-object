package fr.diginamic.jdr;

import java.util.Random;

public class Creature {
	private int force;
    private int pointsDeVie;

    public Creature(int force, int pointsDeVie) {
        this.force = force;
        this.pointsDeVie = pointsDeVie;
    }
    
    public int attaquer() {
    	return this.force + new Random().nextInt(10);
    }

	public int getForce() {
		return force;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

}
