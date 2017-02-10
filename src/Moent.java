/** Klasse, der skal repræsentere en mønt */
public class Moent {
	private int side;
	
	/** Konstruktør, der opretter en mønt og tildeler den en side */
	public Moent(){
		kast();
	}
	
	/** Kaster mønten og tildeler den et tilfældigt tal - enten 1 eller 0 */
	public int kast(){
		double tilfældigtTal = Math.random()*2;
		return side = (int) (tilfældigtTal);
	}
	
	/** Tjekker om mønten landede med krone-siden opad */
	public boolean krone(){
		if (side == 1) return true;
		else if (side == 0) return false;
		return false;
	}
	
	public static void main(String[] args){
		Moent m = new Moent();
		int counter = 0;
		
		for (int i = 0; i<100; i++){
			m.kast();
			if (m.krone() == true){
				//System.out.println("Vi slog krone");
				counter++;
			}
			else if (m.krone() == false); //System.out.println("Vi slog plat");
		}
		System.out.println("Vi slog krone "+counter+" gange.");
	}
}
