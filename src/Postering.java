import java.util.Date;

public class Postering {
	public String besked = "";
	public int indsatBel�b = 0;
	public Date dato;
	
	public Postering(String besked, int indsatBel�b, Date dato){
		this.besked = besked;
		this.indsatBel�b=indsatBel�b;
		this.dato = dato;
	}
	
	public String toString(){
		return dato.toString()+" "+ besked + " " + indsatBel�b;
	}
}
