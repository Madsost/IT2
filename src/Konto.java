import java.util.ArrayList;
import java.util.Date;

public class Konto {
	public int saldo;
	public Person ejer;
	public ArrayList<Postering> posteringer = new ArrayList<Postering>();
	
	public Konto(Person ejeren){
		ejer = ejeren;
		ejer.konti.add(this);
		saldo=0;
	}
	
	public void overførsel(int kroner){
		saldo = saldo + kroner;
		Postering p = new Postering("Besked",kroner,new Date());
		posteringer.add(p);
	}
	
	public String toString(){
		return ejer+" har "+saldo+" kr.";
	}
	
	public void udskrivPosteringer(){
		for(Postering p : posteringer){
			System.out.println(p.toString());
		}
	}
	
}
