
public class GrafTegnerSimpel {

	public static void main(String[] args) {
		int yAkse = 50; // y-aksens top
		int yAkseBund = 0; // y-aksens bund
		double y = 0; // y-værdi
		int xAkse = 11; // Den ønskede x-akse -1
		double x = 0; // x-værdi
		double skalar = 1; // skalering af funktion
		
		for(; yAkse>yAkseBund;yAkse--){ // Definition af y-aksen
			if(yAkse>=100) System.out.print(yAkse + "|");
			if(yAkse>=10 && !(yAkse==100)) System.out.print(yAkse + " |");
			if(yAkse<10 && yAkse>=0) System.out.print(yAkse + "  |");
			if(yAkse<0) System.out.print(yAkse + " |");
			for(x = -10;x<xAkse;x++){ // Definition af x-aksen
				y = skalar*(5*x*x+x); // Funktion 
				if(y<yAkse){
					System.out.print(" ");
				}
				if(y>=yAkse){
					System.out.print("*");
				}
				if(x==(xAkse-1)) System.out.println();
			}
		}
	}
}
