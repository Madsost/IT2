import java.util.Arrays;

//import javax.swing.*;
public class Grafik1 {
	
	public static void main(String[] args) {		
		int[][] data = new int[50][2];
		double j = 0;
		for(int i = 1; i<data.length; i+=1){
			data[i-1][0] = i;
			data[i-1][1] = 2*i*i+i*8+8;
			j++;
		}
		//System.out.println(Arrays.deepToString(data));
		
		Graftegner panel = new Graftegner(data);
	}
}
