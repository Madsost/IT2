import java.awt.Graphics;

public class GrafiskTerning extends Terning implements Tegnbar{
	
	int x,y;
	
	public void sætPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void ci(Graphics g, int i, int j){
		g.fillOval(x+1+10*i,y+1+10*j,8,8);
	}

	public void tegn(Graphics g) {
		int ø = værdi;
		g.drawRect(x, y, 30, 30);
		
		if(ø == 1) ci(g,0,0);
		if(ø == 2){ ci(g,0,0); ci(g,2,2);}
		if(ø == 3){ ci(g,0,0); ci(g,1,1); ci(g,2,2);}
		if(ø == 4){ ci(g,0,0); ci(g,0,2); ci(g,2,0); ci(g,2,2);}
		if(ø == 5){ ci(g,0,0); ci(g,0,2); ci(g,2,0); ci(g,2,2); ci(g,1,1);}
		else { ci(g,0,0); ci(g,0,1); ci(g,0,2); ci(g,2,0); ci(g,2,1); ci(g,2,2);}
	}

}
