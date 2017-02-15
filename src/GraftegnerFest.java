import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraftegnerFest extends JPanel {
	private int[][] data;
	private final int MAXX = 5000;
	private final int MINX = -10;
	private final int MINY = -99;
	private final int MAXY = 1025;
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
		double h = getHeight() - 2;
		double b = getWidth() - 2;
		double deltaX = b / (MAXX - MINX);
		double deltaY = h / (MAXY - MINY);
		double origoX = -(double) MINX * deltaX;
		double origoY = h + (double) (MINY * deltaY);
		g.drawLine((int) origoX, 0, (int) origoX, (int) h - 1);
		g.drawLine(0, (int) origoY, (int) b - 1, (int) origoY);
		for (int i = (MINX / STEP) * STEP; i <= MAXX; i += STEP) {
			g.drawLine((int) (origoX + ((double) i * deltaX)), (int) origoY - 5, (int) (origoX + ((double) i * deltaX)),
					(int) origoY + 5);
		}
		for (int i = (MINY / STEP) * STEP; i <= MAXY; i += STEP) {
			g.drawLine((int) (origoX - 5), (int) (origoY - (double) i * deltaY), (int) origoX + 5,
					(int) (origoY - ((double) i * deltaY)));
		}
		g.setColor(Color.BLUE);
		for (int j = 1; j < data.length-1; j++) {
			g.drawLine((int)((double)data[j - 1][0] * deltaX+origoX),
					(int)(origoY-((double)data[j - 1][1] * deltaY)),
					(int)((double)data[j][0] * deltaX+origoX), 
					(int)(origoY-((double)data[j][1] * deltaY)));
		}
	}
}
