import java.awt.List;
import java.util.*;

public class BrugSammenligning {
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>(Arrays.asList("Henrik", "Anders", "Brian", "Lars", "Susanne", "Stine", "Jes", "Jacob","Siv","Ida","Anne"));
		SammenlignEt comp = new SammenlignEt();
		SammenlignTo comp2 = new SammenlignTo();
		SammenlignTre comp3 = new SammenlignTre();
		Collections.sort(liste,comp);
		System.out.println("Sorteret alfabetisk:");
		for(String s : liste){
			System.out.println(s);
		}
		Collections.sort(liste,comp2);
		System.out.println("Sorteret omvendt alfabetisk:");
		for(String s : liste){
			System.out.println(s);
		}
		Collections.sort(liste,comp3);
		System.out.println("Sorteret alfabetisk efter andet tegn:");
		for(String s : liste){
			System.out.println(s);
		}
	}
}
