package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville>{
	

	@Override
	public int compare(Ville o1, Ville o2) {
		return o1.getNbHabitants().compareTo(o2.getNbHabitants());
	}

}
