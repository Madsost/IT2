import java.util.ArrayList;

/** Repræsenterer et raflebæger med flere terninger i */
public class Raflebaeger {

	public ArrayList<Terning> terninger;
	
	/** Konstruktør der laver et raflebæger med et antal terninger i */
	public Raflebaeger(int antalTerninger){
		terninger = new ArrayList<Terning>();
		for (int i=0; i<antalTerninger; i++){
			Terning t;
			t = new Terning();
			tilføj(t);
		}
	}
	
	/** Tilføjer en terning til bægeret */
	public void tilføj(Terning t){
		terninger.add(t);
	}
	
	/** Ryster bægeret, så alle terninger bliver kastet */
	public void ryst(){
		for (Terning t : terninger){
			t.kast();
		}
	}
	
	/** Finder summen af terningernes værdier */
	public int sum(){
		int resultat=0;
		for (Terning t : terninger){
			resultat += t.værdi;
		}
		return resultat;
	}
	
	/** finder antallet af terninger, der viser en bestemt værdi */
	public int antalDerViser(int værdi){
		int resultat=0;
		for (Terning t : terninger){
			if (t.værdi == værdi){
				resultat++;
			}
		}
		return resultat;
	}
	
	/** beskriver bægerets indhold som en streng */
	public String toString(){
		if(toEns()&&!treEns()&&!toPar()) System.out.print("Et par: ");
		if(treEns()&&!fireEns()&&!hus()) System.out.print("Tre ens: ");
		if(fireEns()&&!femEns()) System.out.print("Fire ens: ");
		if(femEns()) System.out.print("Fem ens: ");
		if(toPar()) System.out.print("To par: ");
		if(hus()) System.out.print("Hus: ");
		else if(!toEns()&&!treEns()&&!hus()&&!fireEns()&&!toPar()) System.out.print("Ingenting: ");
		return terninger.toString();
	}
	
	public boolean toEns(){
		for(int i = 1;i<=6;i++){
			if(antalDerViser(i)==2){
				return true;
			}
		}
		return false;
	}
	public boolean treEns(){
		for(int i = 1;i<=6;i++){
			if(antalDerViser(i)==3){
				return true;
			}
		}
		return false;
	}
	public boolean fireEns(){
		for(int i = 1;i<=6;i++){
			if(antalDerViser(i)==4){
				return true;
			}
		}
		return false;
	}
	public boolean femEns(){
		for(int i = 1;i<=6;i++){
			if(antalDerViser(i)==5){
				return true;
			}
		}
		return false;
	}
	public boolean toPar(){
		if(toEns()){
			int count = 0;
			for(int i = 1;i<=6;i++){
				if(antalDerViser(i)==2){
					count++;
				}
			}
			if(count==2) return true;
		}
		return false;
	}
	public boolean hus(){
		if(toEns() && treEns()) return true;
		return false;
	}
	
	/*public static void main(String[] args){
		Raflebaeger r = new Raflebaeger(4);
		int antalSeksere = 0;
		int antalKast = 0;
		while ( antalSeksere < 3 && antalSeksere < 4 ){
			r.ryst();
			antalKast++;
			System.out.println("På slag nr " + antalKast + " blev der slået "+r.toString());
			antalSeksere = r.antalDerViser(6);
			System.out.println("Der blev slået " + antalSeksere + " seksere\n");
		}
		System.out.println("Vi slog "+antalSeksere+" seksere på " +antalKast +". forsøg\n");
		
		System.out.println("Nu prøver vi at slå 10 gange med 16 terninger: \n");
		antalKast = 0;
		Raflebaeger r2 = new Raflebaeger(16);
		for (int i = 0; i<10; i++){
			r2.ryst();
			antalKast++;
			antalSeksere = r2.antalDerViser(6);
			System.out.println("På slag nr " + antalKast + " blev der slået "+ r2.toString());
			System.out.println("Summen af terningerne er: " +r2.sum());
			System.out.println("Der blev slået " + antalSeksere + " seksere\n");
		}
	}*/
}
