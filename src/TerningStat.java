import java.util.Scanner;

public class TerningStat {
	public static void main(String[] args){
	int[] stat = new int[100];
	Scanner tastatur = new Scanner(System.in);
	System.out.println("Indtast et antal terninger at udføre statistik på: ");
	int antalTerninger = tastatur.nextInt();
	
	Raflebaeger rafle = new Raflebaeger(antalTerninger);
	
	for(int i = 0; i<100; i++){
		rafle.ryst();
		int sum = rafle.sum();
		stat[sum]=stat[sum]+1;
	}
	for (int n=antalTerninger; n<=(6*antalTerninger); n++){
		System.out.println(n + ": " + stat[n]);
	}
	tastatur.close();
}
}