
public class YatzySpil {

	public static void main(String[] args) {
		Raflebaeger r = new Raflebaeger(5);
		while(!r.hus()){
			r.ryst();
			System.out.println(r);
		}

	}

}
