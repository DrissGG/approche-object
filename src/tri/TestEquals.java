package tri;
import tri.Ville;
public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Marseille",850700);
		Ville v3 = new Ville("Nice", 343000);
		
		@Override
		public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
		return false;
		}
		Ville other = (Ville) object;
		return nom.equals(other.getNom());
		}
		
		System.out.println("### Test equals ###");
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		
		
		System.out.println("### Test == ###");
		System.out.println(v1==(v2));
		Ville v4 = v2;
		System.out.println(v2==(v4));
		
		
	}

}
