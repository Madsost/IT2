
public class LudoTerning extends Terning {
	
	/** Giver en beskrivelse af terningen som en streng */
	public String toString(){
		String svar = ""+værdi;
		if (værdi == 3) svar = "*";
		if (værdi == 4) svar = "globus";
		return svar;
	}
	public static class TestLudoTerning{
		public static void main(String[] args){
			LudoTerning l = new LudoTerning();
			LudoTerning l2 = new LudoTerning();
			System.out.println("Terning 1: "+l+"\tTerning 2: "+l2);
			l.kast();
			l2.kast();
			System.out.println("Terning 1: "+l+"\tTerning 2: "+l2);
		}
	}
}
