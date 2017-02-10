package matador;

public class Gade extends Grund
{
	int antalHuse = 0;
	double huspris = 0;
	
	public Gade(String navn, double pris, double leje, double huspris)
	{
		super(navn, pris, leje);
		this.huspris = huspris;
		antalHuse = 0;
	}
	
	public double beregnLeje(){
		return grundleje + antalHuse*huspris;
	}
	
	public void landet(Spiller sp)
	{
		super.landet(sp);
		if (hus)
		{
			if (sp==ejer)
			{
				if (antalHuse<5 && sp.konto>huspris && sp.spørgsmål("købe hus for "+huspris))
				{
					ejer.transaktion(huspris);
					antalHuse = antalHuse + 1;
				}
			}
		}
}
}
