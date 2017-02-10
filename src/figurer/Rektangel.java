package figurer;

public class Rektangel extends Figur{
	public int højde = 0;
	public int bredde = 0;
	
	public Rektangel(int højde, int bredde){
		this.højde = højde;
		this.bredde = bredde;
	}
	
	public double beregnAreal(){
		double areal = højde*bredde;
		return areal;
	}
	
	public double beregnOmkreds(){
		double omkreds = 2*højde+2*bredde;
		return omkreds;
	}

}
