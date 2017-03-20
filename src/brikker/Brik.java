package brikker;
import java.awt.Image;

/** Superklasse til et skak-spil */
public class Brik {
	public int posX = 0;
	public int posY = 0;
	public String farve = "";
	public Image billede = null;
	public static int sqrtHeight = 0;
	public static int sqrtWidth = 0;
	public static int origoX = 0;
	public static int origoY = 0;
	
	public Brik(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public static void setValues(int højde, int bredde, int x, int y){
		sqrtHeight = højde;
		sqrtWidth = bredde;
		origoX = x;
		origoY = y;
	}
	
	public int getX(){
		return posX;
	}
	
	public int getY(){
		return posY;
	}
	
	public boolean kanFlytteTil(int xNy, int yNy){
		boolean x = false;
		boolean y = false;
		if(xNy >= 1 && xNy <= 8) x=true;
		if(yNy >= 1 && yNy <= 8) y=true;
		if(x && y) return true;
		return false;
	}
	
	public void flytBrik(int x, int y){
		this.posX += x * sqrtWidth;
		this.posY += y * sqrtHeight;
	}
}
