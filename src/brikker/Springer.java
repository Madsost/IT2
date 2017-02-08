package brikker;

import java.awt.Toolkit;

public class Springer extends Brik{

	public Springer(int posX, int posY) {
		super(posX, posY);
		billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 Øvelser/src/Chess_knight_icon.png");
	}

}
