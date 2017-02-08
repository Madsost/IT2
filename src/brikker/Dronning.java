package brikker;
import java.awt.Toolkit;

public class Dronning extends Brik{

	public Dronning(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 Øvelser/src/Chess_queen_icon.png");
	}
}
