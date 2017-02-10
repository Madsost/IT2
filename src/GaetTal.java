
public class GaetTal {
	public static void main(String[] args){
		//Scanner tastatur = new Scanner(System.in);
		boolean found = false;
		int tilfTal = (int) (Math.random()*20+1);
		int brugerGaet = 0;
		int antalGaet = 1;
		
		System.out.println("Gæt på et tal mellem 1 og 20!");
		while(!found){
			String str = javax.swing.JOptionPane.showInputDialog("Gæt et tal"); // Anvendelse af JOptionPane
			brugerGaet=Integer.parseInt(str);
			if(brugerGaet<tilfTal){
				System.out.println("Jeg tænker på et tal der er højere.");
				antalGaet++;
			}
			if(brugerGaet>tilfTal){
				System.out.println("Jeg tænker på et tal der er lavere.");
				antalGaet++;
			}
			if(brugerGaet==tilfTal){
				found=true;
				System.out.println("Du gættede rigtigt! Du brugte "+antalGaet+" gæt.");
				//tastatur.close();
			}
			
		}
		
	}

}
