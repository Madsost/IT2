import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class Bold extends JPanel implements KeyListener {

	private int radius = 100;
	private float speedX = 4;
	private float speedY = 6;
	private float x = radius + 50;
	private float y = radius + 20;
	private Color color;

	public Bold() {
		super();
		setFocusable(true);
		addKeyListener(this);
		this.setPreferredSize(new Dimension(640, 480));

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				repaint();
				try {
					Thread.sleep(1000 / 20);
				} catch (Exception e) {
				}
			}
		}, 0, 40);
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			speedY -= 1;
			break;
		case KeyEvent.VK_DOWN:
			speedY += 1;
			break;
		case KeyEvent.VK_LEFT:
			speedX -= 1;
			break;
		case KeyEvent.VK_RIGHT:
			speedX += 1;
			break;
		default:
			;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		/* blah */

	}

	@Override
	public void keyTyped(KeyEvent e) {
		/* mere blah */

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		AffineTransform af = new AffineTransform();
		int b = getWidth() - 2;
		int h = getHeight() - 2;

		x += speedX;
		y += speedY;

		if ((x - radius) < 0) {
			speedX = -speedX;
			x = radius;
		} else if ((x + radius) > b) {
			speedX = -speedX;
			x = b - radius;
		}

		if ((y - radius) < 0) {
			speedY = -speedY;
			y = radius;
		} else if ((y + radius) > h) {
			speedY = -speedY;
			y = h - radius;
		}

		g2.setColor(Color.BLUE);
		af.translate(x - radius, y - radius);
		g2.transform(af);
		g2.fillOval(0, 0, (int) 2 * radius, (int) 2 * radius);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("En hoppende bold");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new Bold();
		p.requestFocus();
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
	}

}