import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;
import java.util.Arrays;

public class GraftegnerFest extends JPanel {
	private int[][] data;
	private final int MAXX = 2000;
	private final int MINX = -1;
	private final int MINY = -99;
	private final int MAXY = 1100;
	private final int STEP = 100;
	private int count = 0;

	public GraftegnerFest(int[][] data) {
		this.data = data;
		JFrame vindue = new JFrame("Nyt vindue");
		vindue.add(this);
		vindue.setSize(5000, 500);
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setVisible(true);
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("Ændring: "+count);
		//count++;
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform af = new AffineTransform();
		
		double h = getHeight() - 2;
		double b = getWidth() - 2;
		double deltaX = b / (MAXX - MINX);
		double deltaY = h / (MAXY - MINY);
		double origoX = -(double) MINX*deltaX;
		double origoY = h + (double) (MINY)*deltaY;

		af.setToTranslation(origoX, origoY);
		g2.transform(af);
		af.setToScale(deltaX, -deltaY);
		g2.transform(af);
		
		g2.setColor(Color.BLUE);
		for (int i = (MINX / STEP) * STEP; i <= MAXX; i += STEP) {
			g2.drawLine( i, - 5, i, 5);
		}
		for (int i = (MINY / STEP) * STEP; i <= MAXY; i += STEP) {
			g.drawLine(- 5, i , 5, i );
		}
		g2.drawLine(MINX, 0, MAXX, 0);	
		g2.drawLine(0, MINY, 0, MAXY);
		g2.setColor(Color.BLACK);
		for (int j = 1; j < data.length-1; j++) {
			g2.drawLine((int)((double)data[j - 1][0]),
					(int)(((double)data[j - 1][1])),
					(int)((double)data[j][0]), 
					(int)(((double)data[j][1])));
		}
	}
	
}
