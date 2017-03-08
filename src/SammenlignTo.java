import java.util.Comparator;

public class SammenlignTo implements Comparator<String>{
	public int compare(String s1, String s2) {
		int resultat = s1.compareTo(s2);
		if(resultat < 0 ) return 1;
		if(resultat > 0 ) return -1;
		return 0;
	}
}
