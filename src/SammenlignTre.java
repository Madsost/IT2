import java.util.Comparator;

public class SammenlignTre implements Comparator<String>{
	public int compare(String s1, String s2) {
		String obj1 = s1.substring(1);
		String obj2 = s2.substring(1);
		int resultat = obj1.compareTo(obj2);
		if(resultat > 0 ) return 1;
		if(resultat < 0 ) return -1;
		return 0;
	}
}
