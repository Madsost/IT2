package brikker;
import java.awt.Toolkit;

public class L�ber extends Brik{

	public L�ber(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_bishop_icon.png");
	}
}
