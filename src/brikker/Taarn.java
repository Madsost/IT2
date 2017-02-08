package brikker;
import java.awt.Toolkit;

public class Taarn extends Brik{
	
	public Taarn(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 Øvelser/src/Chess_rook_icon.PNG");
	}

	public boolean kanFlytteTil(int xNy, int yNy){
		/*
		 * Et tårn kan flytte langs x eller y-aksen. 
		 */
		return false;
	}

}
