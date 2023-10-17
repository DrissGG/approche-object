package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendrier = Calendar.getInstance();
		calendrier.set(Calendar.DAY_OF_MONTH, 19);
		calendrier.set(Calendar.MONTH, 4);
		calendrier.set(Calendar.YEAR, 2016);
		calendrier.set(Calendar.HOUR_OF_DAY, 23);
		calendrier.set(Calendar.MINUTE, 59);
		calendrier.set(Calendar.SECOND, 30);
		
		Date date = calendrier.getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy ");
		System.out.println("date  : "+ format.format(date));
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyy/MM/dd  HH:mm:ss");
		System.out.println("date  : "+ format2.format(date));
		
		SimpleDateFormat formatFr = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		System.out.println("date en FR  : "+ formatFr.format(date));
		
		
		SimpleDateFormat formatRusse = new SimpleDateFormat("EEEEE dd MMMMM yyyy", new Locale("ru"));		
		System.out.println("date en Russe : "+ formatRusse.format(date));
		
		SimpleDateFormat formatChinois = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINA);		
		System.out.println("date en Chinois : "+ formatChinois.format(date));
		
		SimpleDateFormat formatAllemand = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN);		
		System.out.println("date en Allemand : "+ formatAllemand.format(date));
		
		
	}

}
