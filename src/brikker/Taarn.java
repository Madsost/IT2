package brikker;
import java.awt.Toolkit;

public class Taarn extends Brik{
	
	public Taarn(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_rook_icon.PNG");
	}

	public boolean kanFlytteTil(int xNy, int yNy){
		/*
		 * Et tårn kan flytte langs x eller y-aksen. 
		 */
		return false;
	}

}
