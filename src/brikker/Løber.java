package brikker;
import java.awt.Toolkit;

public class L�ber extends Brik{

	public L�ber(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 �velser/src/Chess_bishop_icon.png");
	}
}
