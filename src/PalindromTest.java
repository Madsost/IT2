
public class PalindromTest {

	public static void main(String[] args) {
		String test = javax.swing.JOptionPane.showInputDialog("Indtast et ord");
		String s1 = "";
		String s2 = "";
		int n = 0;
		String original = test;
		
		test = test.toLowerCase();
		test = test.replace(",", "");
		test = test.replace(".", "");
		test = test.replace(" ", "");
		
		try{
		while(n<test.length()){
			s1 = test.substring(n, n+1);
			s2 = s1+s2;
			n++;
		}
		if(s2.equals(test)){
			System.out.println(original+" var et palindrom!");
		}
		else System.out.println(original+" var ikke et palindrom!");
		}
		
		catch(Exception e){
			System.out.println("Stop.");
			e.printStackTrace();
		}

	}

}
