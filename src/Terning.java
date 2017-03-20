import java.util.ArrayList;

/** En klasse der beskriver 6-sidede terninger */
public class Terning {
	public int værdi;
	
	/** konstrukt�r der opretter en terning */
	public Terning(){
		kast();
	}
	
	/** Kaster terningen, s� den f�r en anden v�rdi */
	public void kast(){
		// find en tilf�ldig side
		double tilfældigtTal = Math.random();
		if(tilfældigtTal==1.0) værdi = 6;
		else værdi = (int) (tilfældigtTal * 6) + 1;
	}
	
	/** Giver en beskrivelse af terningen som en streng */
	public String toString(){
		String svar = ""+værdi;
		return svar;
	}
	
	/** En klasse der benytter terninge-klassen */
	public static class BenytTerning{
		public static void main(String[] args){
			
			int antalKast = 0;
			int antalSeksere = 0;
			
			ArrayList<Terning> terninger = new ArrayList<>();
			
			for (int i=0; i<16; i++){
				Terning tb;
				tb = new Terning();
				terninger.add(tb);
			}
			
			System.out.println(terninger.toString());
			
			while ( true ){
				for (Terning t : terninger){
					t.kast();
					if (t.værdi == 6) antalSeksere++;
				}
				antalKast++;
				int sum = 0;
				for (Terning t : terninger){
					sum += t.værdi;
				}
				System.out.println(terninger.toString());
				System.out.print("Slag nr: " + antalKast +", ");
				System.out.println("summen af øjnene i slaget var: " + sum);
				System.out.println("Antal seksere: "+antalSeksere +" \n");
				antalSeksere = 0;
			}
		}
	}
}
