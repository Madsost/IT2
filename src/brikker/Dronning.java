package brikker;
import java.awt.Toolkit;

public class Dronning extends Brik{

	public Dronning(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_queen_icon.png");
	}
}
