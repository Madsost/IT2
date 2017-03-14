

public class benytMatadorspil 
{
	public static void main(String[] args){
		Matadorspil spil = new Matadorspil();
		spil.spillere.add(new Spiller("S�ren",50000));
		spil.spillere.add(new Spiller("Lars",50000));
		
		// l�b gennem 20 runder
		for(spil.spillersTur=0; spil.spillersTur<40; spil.spillersTur++)
		{
			// tag skiftevis S�ren og Lars
			Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
			sp.slag = (int) (Math.random()*6)+1;
			System.out.println("***** "+sp.navn+" p� felt "+sp.feltnr+" sl�r "+sp.slag);
			
			for(int i = 1; i<=sp.slag; i++)					// nu rykkes der
			{
				// g� til n�ste felt. Hvis vi n�r over antal felter, s� t�l fra nul
				sp.feltnr = (sp.feltnr+1) % spil.felter.size();		
				Felt felt = spil.felter.get(sp.feltnr);
				
				if (i<sp.slag) felt.passeret(sp);
				else felt.landet(sp);
				try { Thread.sleep(300); } catch (Exception e){} 
			}
			try { Thread.sleep(3000); } catch (Exception e){} // tur slut, vent 3 sekunder
		}
	}
}
