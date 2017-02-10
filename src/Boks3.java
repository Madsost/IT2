/** Opgave 2 fra 4.3.2 */
public class Boks3 {
	private double l�ngde;
	private double bredde;
	private double h�jde;
	private double massefylde;
	
	/** Konstrukt�r der opretter en standardboks */
	public Boks3(){
		System.out.println("Standardboks oprettes");
		l�ngde = 10;
		bredde = 10;
		h�jde = 10;
		massefylde = 1;
	}
	
	/** En anden konstrukt�r der f�r bredde, h�jde og l�ngde  */
	public Boks3(double lgd, double b, double h, double m){
		System.out.println("Boks oprettes med lgd="+ lgd+" b="+b+" h="+h);
		s�tM�l(lgd,b,h);
		s�tMasse(m);
	}
	
	/** S�tter boksens bredde, h�jde og l�ngde */
	public void s�tM�l(double lgd, double b, double h){
		if (lgd <=0 || b<=0 || h<=0)
		{
			System.out.println("Ugyldige m�l. Bruger standardm�l");
			l�ngde = 10;
			bredde = 10;
			h�jde = 10;
			massefylde = 1;
		}
		else {
			l�ngde = lgd;
			bredde = b;
			h�jde = h;
		}
		}
	
	/** S�tter boksens massefylde */
	public void s�tMasse(double m){
		if (m<=0) {
			System.out.println("Ugyldig massefylde. Bruger standardm�l");
			massefylde = 1;
		}
		else massefylde = m;
	}
	
	/** udregner boksens rumfang */
	public double volumen(){
		double vol = l�ngde*bredde*h�jde;
		return vol;
	}
	
	/** udregner boksens v�gt */
	public double v�gt(){
		double v�gt = l�ngde*bredde*h�jde*massefylde;
		return v�gt;
	}
	
	/** Klasse til at teste programmet */ 
	public static class BenytBoks3{
		public static void main(String[] args){
			Boks3 enBoks, enAndenBoks;
			enBoks = new Boks3();
			System.out.println("Boks 1 volumen: " + enBoks.volumen());
			System.out.println("Boks 1 v�gt: " + enBoks.v�gt());
			
			enAndenBoks = new Boks3(10,20,10,2);
			System.out.println("Boks 2 volumen: " + enAndenBoks.volumen());
			System.out.println("Boks 2 v�gt: "  + enAndenBoks.v�gt());
		}
	}
}
