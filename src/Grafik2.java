import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grafik2 {
	public static void main(String[] args) {
		File ind = new File("C:/Users/madso/Dropbox/Semesterprojekt 1/Datafiler/CaseC/Rå data.txt");
		try{ Scanner input = new Scanner(new FileReader(ind));
		ArrayList<Double> inddata = new ArrayList<>();
		while(input.hasNext()){
			inddata.add(Double.parseDouble(input.nextLine()));
		}
		
		int[][] data = new int[5000][2];
		for(int i = 1; i<data.length; i++){
			data[i-1][0] = i-1;
			data[i-1][1] = (int) (inddata.get(i-1)/5*1024);
		}
		
		//System.out.println(Arrays.deepToString(data));
		GraftegnerFest tegning = new GraftegnerFest(data);
		
		} catch(IOException e){ e.printStackTrace();}
	}
}
