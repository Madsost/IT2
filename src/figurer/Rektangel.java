package figurer;

public class Rektangel extends Figur{
	public int h�jde = 0;
	public int bredde = 0;
	
	public Rektangel(int h�jde, int bredde){
		this.h�jde = h�jde;
		this.bredde = bredde;
	}
	
	public double beregnAreal(){
		double areal = h�jde*bredde;
		return areal;
	}
	
	public double beregnOmkreds(){
		double omkreds = 2*h�jde+2*bredde;
		return omkreds;
	}

}
