package brikker;

import java.awt.Toolkit;

public class Konge extends Brik{

	public Konge(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		billede = Toolkit.getDefaultToolkit().getImage(
				"src/Chess_king_icon.png");
	}
}
