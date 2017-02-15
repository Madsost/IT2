import java.awt.*;
import java.awt.geom.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDimensioner extends JPanel {
	public ToDimensioner(){
		JFrame vindue = new JFrame("Nyt vindue");
		vindue.add(this);
		vindue.setSize(500, 500);
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setVisible(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		System.out.println(g2.getTransform().toString());
		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		path.moveTo(0.0f,0.0f);
		path.lineTo(0.0f,125.0f);
		path.lineTo(225.0f,125.0f);
		path.lineTo(225.0f,0.0f);
		path.closePath();
		g2.draw(path);
		AffineTransform af = new AffineTransform();
		af.scale(2, 2);
		af.translate(5, 5);
		g2.transform(af);
		g2.draw(path);
	}
	
	
	public static void main(String[] args) {
		ToDimensioner to = new ToDimensioner();
	}
}
