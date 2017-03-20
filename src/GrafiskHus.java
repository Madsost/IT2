import java.awt.Graphics;

public class GrafiskHus implements Tegnbar{
	int x,y;
	
	public void sætPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void tegn(Graphics g) {
		g.drawRect(x, y, 50, 50);
		g.drawLine(x-5, y, x+55, y);
		g.drawLine(x-5, y, x+25, y-25);
		g.drawLine(x+55, y, x+25, y-25);
		g.fillRect(x+20, y+30, 10, 20);
	}

}
