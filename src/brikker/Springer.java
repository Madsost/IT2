package brikker;

import java.awt.Toolkit;

public class Springer extends Brik{

	public Springer(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_knight_icon.png");
	}

}
