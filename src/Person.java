import java.util.ArrayList;

public class Person {
	public String fornavn = "";
	public String efternavn ="";
	public int alder=0;
	public ArrayList<Konto> konti;
	public Bil bil;
	
	public Person(String fornavn, String efternavn, int alder){
		this.fornavn=fornavn;
		this.efternavn=efternavn;
		this.alder=alder;
		konti = new ArrayList<Konto>();
	}
	
	public String toString(){
		return fornavn+" "+efternavn+" ("+alder+" �r)";
	}
	
	public void pr�sentation(){
		if (alder<5) System.out.println("agyyy!");
		else System.out.println("Jeg hedder "+fornavn+" og jeg er "+alder+" �r.");
	}
	
	public void hils(Person andenPerson){
		if (alder < 5) System.out.println("ma ma.. ");
		else if (alder < 60) System.out.println("Hej "+andenPerson.fornavn+". ");
		else System.out.println("Goddag, hr. "+andenPerson.efternavn+". ");
	}
	
	public void tilf�jNyKonto(Person p){
		new Konto(p);
	}
	
	public int formue(){
		int total=0;
		int antalKonti = 0;
		for(Konto k : konti){
			total += k.saldo;
			antalKonti++;
			System.out.println(antalKonti + ": "+k.saldo);
		}
		if(bil!=null){
			System.out.println("Der var ogs� en bil med v�rdien " +bil.pris);
			total+=bil.pris;
		}
		return total;
	}
	
	public static class TestPerson{
		public static void main(String[] args){
			Person p = new Person("Anders","Henriksen",28);
			Konto k = new Konto(p);
			p.formue();
			k.overf�rsel(1000);
			p.formue();
			Konto k2 = new Konto(p);
			Konto k3 = new Konto(p);
			k2.overf�rsel(500);
			k3.overf�rsel(483);
			for(Konto a : p.konti){
				a.udskrivPosteringer();
			}
			p.bil = new Bil("VOLVO","r�d",12000);
			System.out.println(p.bil.toString());
			int i = p.formue();
			System.out.println("Saldo er " +i);
		}
	}
	
	
	
}
