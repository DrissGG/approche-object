package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
	private int force;
	private int pointVie;
	private int score;
	public Personnage() {
		super();
		this.force = 0;
		this.pointVie = 0;
		this.score = 0;
	}
	
	public void createdPersonnage() {
		Random random = new Random();
		int randomNumber = random.nextInt(7)+12;
		this.pointVie = random.nextInt(31)+20;
		this.score = 0;
	}
	
	public void combatCreture() {
		
	}
	public int getForce() {
		return force;
	}
	public int getPointVie() {
		return pointVie;
	}
	public int getScore() {
		return score;
	}
	
	
}
