package fr.diginamic.dates;

import java.util.*;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy ");
		Date date = new Date();
		System.out.println("Date du jour : " + formateur.format(date));
		
		Date date1 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Date spécifiée : " + formateur1.format(date1));

		Date date3 = new Date();
		
		System.out.println("Date du systeme : " +(formateur1.format(date3)));
	}

}
