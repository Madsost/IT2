

public class Spiller {
	String navn = "";
	double konto = 0;
	int feltnr = 0;
	int slag = 0;
	
	/** kontruktør */
	public Spiller(String navn, double konto){
		this.navn = navn;
		this.konto = konto;
		feltnr = 0;
	}
	
	/** en besked til spilleren */
	public void besked(String besked){
		System.out.println(navn+": "+besked);
	}
	
	/** et ja/nej spørgsmål. Svarer brugeren ja returneres true, ellers false */ 
	public boolean spørgsmål(String spørgsmål){
		String spm = navn+": Vil du "+spørgsmål+"?";
		String svar = javax.swing.JOptionPane.showInputDialog(spm, "ja");
		System.out.println(spm+" "+svar);
		if (svar!=null && svar.equals("ja")) return true;
		else return false;
	}
	
	/** modtagelse af penge */
	public void transaktion(double kr){
		konto = konto + kr;
		System.out.println(navn+"s konto lyder nu på "+konto+" kr");
	}
	
	/** sender penge til en anden spiller */
	public void betal(Spiller modtager, double kr){
		System.out.println(navn+" betaler "+modtager.navn+" "+kr+" kr");
		modtager.transaktion(kr);
		transaktion(-kr);
	}
}
