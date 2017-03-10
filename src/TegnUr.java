import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class TegnUr extends JPanel{
	
	private String tid = "";
	private double h = 0;
	private double b = 0;
	private double delta = 0;
	private double r = 0;
	private double origoX = 0;
	private double origoY = 0;
	private final int URX = 20;
	private final int URY = 30;
	
	/**
	 * Konstruktør, der opretter et JFrame-objekt. <br>
	 * Sørger for, at der bliver åbnet et vindue, hvori grafikken kan tegnes.
	 */
	public TegnUr(){
		JFrame vindue = new JFrame("SE TIDEN HER");
		vindue.add(this);
		vindue.setSize(500, 500);
		vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vindue.setVisible(true);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				repaint();
			}
		
		}, 0, 40);
	}
	
	/**
	 * Tegner minutterne på skiven, fremhæver hvert kvarter og skriver timerne.</br>
	 * </br> Det er også denne metode, som definerer origo for resten af klassen.</br>
	 * Anvender samme beregningsmetoder som <code>tegnVisere</code>
	 * 
	 * @param g Det grafik-objekt som skal tegne stregerne.
	 */
	public void tegnTid(Graphics g){
		origoX = URX+(b/2);
		origoY = URY+(h/2);
		
		r = b/2;
		int n = 1;
		
		// Skriv timer
		for(int s = 0; s<60; s++){
			if(s%5 == 0){
				g.setColor(Color.BLUE);
				double x3 = origoX+((r+15)*Math.sin(2*Math.PI*s/60));
				double y3 = origoY-((r+15)*Math.cos(2*Math.PI*s/60));
				String time = ""+(n++);
				if(s==0) {
					time = "12"; 
					n--;
				}
				g.drawString(time, (int)x3, (int)y3);
			}
			// tegn kvarter
			g.setColor(Color.BLACK);
			if(s%15==0){
				double x1 = origoX+((r)*Math.sin(2*Math.PI*s/60));
				double y1 = origoY-((r)*Math.cos(2*Math.PI*s/60));
				double x2 = origoX+((r-15)*Math.sin(2*Math.PI*s/60));
				double y2 = origoY-((r-15)*Math.cos(2*Math.PI*s/60));
				g.setColor(Color.BLUE);
				g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
			}
			else{ // tegn minutter
				g.setColor(Color.BLACK);
				double x1 = origoX+((r)*Math.sin(2*Math.PI*s/60));
				double y1 = origoY-((r)*Math.cos(2*Math.PI*s/60));
				double x2 = origoX+((r-5)*Math.sin(2*Math.PI*s/60));
				double y2 = origoY-((r-5)*Math.cos(2*Math.PI*s/60));
				g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
			}
		}
	}
	/**
	 * Tegner viserne på uret ved hjælp af LocalTime-klassen.</br>
	 * Placeringen af viserne bestemmes vha funktionen</br>
	 * <code>radius * sin (2*PI*s/60) </code> </br>
	 * for sekunder og det samme for minutter og timer.
	 * @param g Det grafik-objekt, som tegner viserne.
	 */
	public void tegnVisere(Graphics g){
		int s = LocalTime.now().getSecond();
		int m = LocalTime.now().getMinute();
		int t = LocalTime.now().getHour();
		
		double xS = origoX+((r-8)*Math.sin(2*Math.PI*s/60));
		double yS = origoY-((r-8)*Math.cos(2*Math.PI*s/60));
		double xM = origoX+((r-25)*Math.sin(2*Math.PI*m/60));
		double yM = origoY-((r-25)*Math.cos(2*Math.PI*m/60));
		double xT = origoX+((r-50)*Math.sin(2*Math.PI*t/12));
		double yT = origoY-((r-50)*Math.cos(2*Math.PI*t/12));
		
		g.setColor(Color.red);
		g.drawLine((int) origoX, (int) origoY, (int) xS, (int) yS);
		g.setColor(Color.blue);
		g.drawLine((int) origoX, (int) origoY, (int) xM, (int) yM);
		g.setColor(Color.DARK_GRAY);
		g.drawLine((int) origoX, (int) origoY, (int) xT, (int) yT);
	}
	
	/**
	 * Her tegnes urskiven, og størrelsen på uret beregnes. <br>
	 * Metoderne <code>tegnTid()</code> og <code>tegnVisere()</code> kaldes herfra og tiden skrives også digitalt her.
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//System.out.println("HEJ");
		
		h = getHeight()-50;
		b = getWidth()-50;
		delta = h / b;
		b *= delta;
				
		g.drawOval(URX,URY, (int)b, (int)h);
		g.drawOval((int)origoX-5, (int)origoY-5, 10, 10);
		tegnTid(g);
		tegnVisere(g);
		
		g.setColor(Color.BLACK);
		tid = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		int place = tid.length();
		place *= 3;
		g.drawString(tid, (int)origoX-place, (int)origoY-20);
	}
	
	public static void main(String[] args) {
		TegnUr nu = new TegnUr();
		/*for(int i = 0; i<40000; i++){
			nu.repaint();
			try{ Thread.sleep(10); } catch(Exception e){ System.err.println("Der skete en fejl"); }
		}*/
	}
}
