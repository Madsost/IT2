/** Opgave 2 fra 4.3.2 */
public class Boks3 {
	private double længde;
	private double bredde;
	private double højde;
	private double massefylde;
	
	/** Konstrukt�r der opretter en standardboks */
	public Boks3(){
		System.out.println("Standardboks oprettes");
		længde = 10;
		bredde = 10;
		højde = 10;
		massefylde = 1;
	}
	
	/** En anden konstrukt�r der f�r bredde, h�jde og l�ngde  */
	public Boks3(double lgd, double b, double h, double m){
		System.out.println("Boks oprettes med lgd="+ lgd+" b="+b+" h="+h);
		sætMål(lgd,b,h);
		sætMasse(m);
	}
	
	/** S�tter boksens bredde, h�jde og l�ngde */
	public void sætMål(double lgd, double b, double h){
		if (lgd <=0 || b<=0 || h<=0)
		{
			System.out.println("Ugyldige mål. Bruger standardm�l");
			længde = 10;
			bredde = 10;
			højde = 10;
			massefylde = 1;
		}
		else {
			længde = lgd;
			bredde = b;
			højde = h;
		}
		}
	
	/** S�tter boksens massefylde */
	public void sætMasse(double m){
		if (m<=0) {
			System.out.println("Ugyldig massefylde. Bruger standardm�l");
			massefylde = 1;
		}
		else massefylde = m;
	}
	
	/** udregner boksens rumfang */
	public double volumen(){
		double vol = længde*bredde*højde;
		return vol;
	}
	
	/** udregner boksens v�gt */
	public double vægt(){
		double vægt = længde*bredde*højde*massefylde;
		return vægt;
	}
	
	/** Klasse til at teste programmet */ 
	public static class BenytBoks3{
		public static void main(String[] args){
			Boks3 enBoks, enAndenBoks;
			enBoks = new Boks3();
			System.out.println("Boks 1 volumen: " + enBoks.volumen());
			System.out.println("Boks 1 v�gt: " + enBoks.vægt());
			
			enAndenBoks = new Boks3(10,20,10,2);
			System.out.println("Boks 2 volumen: " + enAndenBoks.volumen());
			System.out.println("Boks 2 v�gt: "  + enAndenBoks.vægt());
		}
	}
}
