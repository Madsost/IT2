
public class ModuloTest {

	public boolean fortsæt()
	{
		String svar = javax.swing.JOptionPane.showInputDialog("Fortsæt?","ja");
		if (svar.equals("ja")) return true;
		else return false;
	}
	public static void main(String[] args) {
		ModuloTest m = new ModuloTest();
		int i = 0;
		int str = 6;
		boolean fort = true;
		double tal = 4648.31;
		int temp2 = (int) tal/100;
		int temp = (int) tal % 100;
		System.out.println(temp2+","+temp);
		/*while (i < 40)
		{
			int temp = (i + 1) % str;
			System.out.println(i + " " + temp);
			i++;
			//fort = m.fortsæt();
		}
		*/
	}

}
