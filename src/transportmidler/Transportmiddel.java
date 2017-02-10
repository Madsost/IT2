package transportmidler;
/**
 * Superklasse, der repr�senterer et transportmiddel.
 */

/**
 * @author Mads. 
 *
 */
public class Transportmiddel {

	public String navn = "";
	public String farve = "";
	public int tilbagelagtKm = 0;
	public double pris = 0;
	
	public void bev�g(int antalKilometer){
		tilbagelagtKm += antalKilometer;
	}
	
	public double pris(){
		return pris;
	}
	
	public String toString(){
		String km = ""+tilbagelagtKm;
		String pris = ""+this.pris;
		return "Navn: "+navn+"\nFarve: "+farve+"\nPris: "+pris+"\nTilbagelagte kilometer: "+km;
	}
}
