package figurer;

public class FigurTest {
	public static void main(String[] args){
		Punkt p = new Punkt(1,2);
		Linje l = new Linje(15);
		Cirkel c = new Cirkel(3.2);
		Rektangel r = new Rektangel(2,5);
		System.out.println("Rektangel: "+r.beregnAreal()+"\nRektangel omkreds: "+r.beregnOmkreds());
		System.out.println("Cirkel areal: "+c.beregnAreal()+"\nCirkel omkreds: "+c.beregnOmkreds());
		System.out.println("Linje l�ngde: "+l.længde+"\nLinje omkreds: "+l.beregnOmkreds());
		System.out.println("Punkt ("+p.x+","+p.y+")\n"+"Punkt omkreds: "+p.beregnOmkreds());
	}

}
