import javax.swing.*;
import brikker.*;
import java.awt.*;
import java.util.ArrayList;

public class SkakSpil extends JPanel {

	private static int sqrtHeight = 0;
	private static int sqrtWidth = 0;
	private static double h = 0;
	private static double b = 0;
	private static int origoX = 0;
	private static int origoY = 0;
	private static ArrayList<Brik> brikker = new ArrayList<>();

	public SkakSpil() {
		JFrame vindue = new JFrame("Nyt vindue");
		vindue.add(this);
		vindue.setSize(500, 500);
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setVisible(true);
	}

	public void tegnBrik(Brik brik, Graphics g) {
		g.drawImage(brik.billede, brik.getX(), brik.getY(), sqrtWidth, sqrtHeight, this);
	}

	public void tegnBræt(Graphics g) {
		int n = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (n % 2 == 0)
					g.setColor(Color.GRAY);
				else
					g.setColor(Color.WHITE);
				n++;
				g.fillRect(origoX + (j * sqrtWidth), origoY + (i * sqrtHeight), sqrtWidth, sqrtHeight);
			}
			n = 1 + i;
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		h = getHeight() - 50;
		b = getWidth() - 50;

		origoX = 25;
		origoY = 25;

		sqrtWidth = (int) b / 8;
		sqrtHeight = (int) h / 8;


		// Tegner et skakbræt
		tegnBræt(g);
		Brik.setValues(sqrtHeight, sqrtWidth, origoX, origoY);
		
		for (Brik p : brikker) {
			tegnBrik(p, g);
		}	
	}

	public static void main(String[] args) {
		SkakSpil spil = new SkakSpil();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		brikker = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			brikker.add(new Bonde((origoX + (i * sqrtWidth)), origoY + sqrtHeight));
		}
		
		brikker.add(new Taarn(origoX,origoY));
		brikker.add(new Taarn(origoX + 7*sqrtWidth,origoY));
		brikker.add(new Springer(origoX+1*sqrtWidth,origoY));
		brikker.add(new Springer(origoX+6*sqrtWidth,origoY));
		brikker.add(new Løber(origoX+2*sqrtWidth,origoY));
		brikker.add(new Løber(origoX+5*sqrtWidth,origoY));
		brikker.add(new Dronning(origoX+3*sqrtWidth,origoY));
		brikker.add(new Konge(origoX+4*sqrtWidth,origoY));
		
		spil.repaint();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		brikker.get(2).flytBrik(0, 1);
		spil.repaint();
	}
}
