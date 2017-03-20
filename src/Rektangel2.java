import java.awt.Graphics;
import java.awt.Rectangle;

public class Rektangel2 extends Rectangle implements Tegnbar {

	public Rektangel2(int x1, int y1, int width1, int height1){
		super(x1,y1,width1,height1);
	}
	
	public void sætPosition(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public void tegn(Graphics g) {
		g.drawRect(x, y, width, height);
	}

}
