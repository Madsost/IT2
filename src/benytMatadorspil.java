

public class benytMatadorspil 
{
	public static void main(String[] args){
		Matadorspil spil = new Matadorspil();
		spil.spillere.add(new Spiller("Søren",50000));
		spil.spillere.add(new Spiller("Lars",50000));
		
		// løb gennem 20 runder
		for(spil.spillersTur=0; spil.spillersTur<40; spil.spillersTur++)
		{
			// tag skiftevis Søren og Lars
			Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
			sp.slag = (int) (Math.random()*6)+1;
			System.out.println("***** "+sp.navn+" på felt "+sp.feltnr+" slår "+sp.slag);
			
			for(int i = 1; i<=sp.slag; i++)					// nu rykkes der
			{
				// gå til næste felt. Hvis vi når over antal felter, så tæl fra nul
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
