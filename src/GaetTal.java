
public class GaetTal {
	public static void main(String[] args){
		//Scanner tastatur = new Scanner(System.in);
		boolean found = false;
		int tilfTal = (int) (Math.random()*20+1);
		int brugerGaet = 0;
		int antalGaet = 1;
		
		System.out.println("G�t p� et tal mellem 1 og 20!");
		while(!found){
			String str = javax.swing.JOptionPane.showInputDialog("G�t et tal"); // Anvendelse af JOptionPane
			brugerGaet=Integer.parseInt(str);
			if(brugerGaet<tilfTal){
				System.out.println("Jeg t�nker p� et tal der er h�jere.");
				antalGaet++;
			}
			if(brugerGaet>tilfTal){
				System.out.println("Jeg t�nker p� et tal der er lavere.");
				antalGaet++;
			}
			if(brugerGaet==tilfTal){
				found=true;
				System.out.println("Du g�ttede rigtigt! Du brugte "+antalGaet+" g�t.");
				//tastatur.close();
			}
			
		}
		
	}

}
