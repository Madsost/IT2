package figurer;

public class Cirkel extends Figur{
	public double radius = 0;
	
	public Cirkel(double radius){
		this.radius = radius;
	}
	
	public double beregnAreal(){
		double areal = radius*radius*3.14;
		return areal;
	}
	
	public double beregnOmkreds(){
		double omkreds = 2*radius*3.14;
		return omkreds;
	}

}
