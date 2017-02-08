package brikker;

import java.awt.Toolkit;

public class Konge extends Brik{

	public Konge(int posX, int posY) {
		super(posX, posY);
		// TODO Auto-generated constructor stub
		billede = Toolkit.getDefaultToolkit().getImage(
				"C:/Users/madso/Documents/!Privat/DTU 2016-2020/Java_workspace/IT2 Øvelser/src/Chess_king_icon.png");
	}
}
