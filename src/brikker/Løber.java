package brikker;
import java.awt.Toolkit;

public class Løber extends Brik{

	public Løber(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_bishop_icon.png");
	}
}
