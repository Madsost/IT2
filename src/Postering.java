import java.util.Date;

public class Postering {
	public String besked = "";
	public int indsatBeløb = 0;
	public Date dato;
	
	public Postering(String besked, int indsatBeløb, Date dato){
		this.besked = besked;
		this.indsatBeløb=indsatBeløb;
		this.dato = dato;
	}
	
	public String toString(){
		return dato.toString()+" "+ besked + " " + indsatBeløb;
	}
}
