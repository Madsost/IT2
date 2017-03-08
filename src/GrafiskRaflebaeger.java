import java.awt.Graphics;

public class GrafiskRaflebaeger extends Raflebaeger implements Tegnbar{

	public GrafiskRaflebaeger() {
		super(0);

	}

	public void sætPosition(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void tegn(Graphics g) {
		g.drawOval(80, 20, 90, 54);
		g.drawLine(150, 115, 170, 50);
		g.drawLine(100,115,80,50);
		g.drawArc(100, 100, 50, 30, 180, 180);
		
	}
	

}
