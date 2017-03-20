
import java.util.ArrayList;
import transportmidler.Transportmiddel;

public class Bil extends Transportmiddel{

	ArrayList<Person> personerIBil = new ArrayList<Person>(); 
	
	public Bil(String n, String f, double nyPris){
		this.navn = n;
		this.farve = f;
		if(nyPris>=0) this.pris = nyPris;
		else this.pris = 0;
	}
	
	public double pris(){
		System.out.println("Det her er en bil!");
		return this.pris;
	}
	
	public void enSætterSigInd(Person p){
		personerIBil.add(p);
	}
	
	public String hvemSidderIBilen(){
		String personer = "";
		if(personerIBil.isEmpty()) return "Bilen er tom.";
		for(Person p : personerIBil){
			personer += p.fornavn+" ";
		}
		return personer;
	}
	public void alleStigerUd(){
		for(Person p : personerIBil){
			personerIBil.remove(p);
		}
	}
}
