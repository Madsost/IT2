package brikker;
import java.awt.Image;
import java.awt.Toolkit;

public class Bonde extends Brik{
	
	public Bonde(int posX, int posY){
		super(posX,posY);
		this.billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 Øvelser/src/Chess_pawn_icon.png");
	}
	
	
	public boolean kanFlytteTil(int xNy, int yNy){
		/*
		 * En bonde kan flytte til sin y-position+1 (alt efter om den er hvid eller sort)
		 * Hvis den har mulighed for at tage en anden brik kan den flytte til sin x-position+1 og
		 * y-position+-1
		 *
		 */
		boolean x = false;
		boolean y = false;
		if(xNy < 7 && xNy > 0) x = true;
		if(yNy < 7 && yNy > 0 && yNy == (posY+(1*sqrtHeight))) y = true;
		// Mangler: når bonden tager en anden brik. 
		if (x && y) return true;
		return false;
	}
}
