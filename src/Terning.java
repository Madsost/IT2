import java.util.ArrayList;

/** En klasse der beskriver 6-sidede terninger */
public class Terning {
	public int v�rdi;
	
	/** konstrukt�r der opretter en terning */
	public Terning(){
		kast();
	}
	
	/** Kaster terningen, s� den f�r en anden v�rdi */
	public void kast(){
		// find en tilf�ldig side
		double tilf�ldigtTal = Math.random();
		if(tilf�ldigtTal==1.0) v�rdi = 6;
		else v�rdi = (int) (tilf�ldigtTal * 6) + 1;
	}
	
	/** Giver en beskrivelse af terningen som en streng */
	public String toString(){
		String svar = ""+v�rdi;
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
					if (t.v�rdi == 6) antalSeksere++;
				}
				antalKast++;
				int sum = 0;
				for (Terning t : terninger){
					sum += t.v�rdi;
				}
				System.out.println(terninger.toString());
				System.out.print("Slag nr: " + antalKast +", ");
				System.out.println("summen af �jnene i slaget var: " + sum);
				System.out.println("Antal seksere: "+antalSeksere +" \n");
				antalSeksere = 0;
			}
		}
	}
}
