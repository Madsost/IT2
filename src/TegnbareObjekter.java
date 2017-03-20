import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.*;

public class TegnbareObjekter extends JPanel{
	ArrayList<Tegnbar> tegnbare = new ArrayList<>();
	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();
	
	public void sætPositioner(){
		for( Tegnbar t : tegnbare){
			int x = (int) (Math.random()*200);
			int y = (int) (Math.random()*200);
			t.sætPosition(x, y);
		}
	}
	
	public TegnbareObjekter(){
		tegnbare.add(new Rektangel2(10,10,30,30));
		tegnbare.add(new Rektangel2(15,15,20,20));
		tegnbare.add(new GrafiskHus());
		
		GrafiskTerning t;
		t = new GrafiskTerning();
		bæger.tilføj(t);
		tegnbare.add(t);

		t = new GrafiskTerning();
		bæger.tilføj(t);
		tegnbare.add(t);
		
		tegnbare.add(bæger);
		sætPositioner();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		sætPositioner();
		
		for(Tegnbar t: tegnbare) t.tegn(g);
	}
	
	public static void main(String[] args) {
		JFrame vindue = new JFrame( "Tegnbare objekter" );
		vindue.add(new TegnbareObjekter());
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vindue.setSize(300, 300);
		vindue.setVisible(true);
		while(true){
			try{ Thread.sleep(3000);} catch(Exception e){e.printStackTrace();}
			vindue.repaint();
		}
	}
}
