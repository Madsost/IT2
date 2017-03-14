
import java.util.*;

public class Matadorspil {
	ArrayList<Felt> felter = new ArrayList<>();
	ArrayList<Spiller> spillere = new ArrayList<>();
	int spillersTur = 0;
	
	public Matadorspil(){
		felter.add(new Start(5000));
		felter.add(new Gade("R�dovrevej",10000,400,1000));
		felter.add(new Gade("Hvidovrevej",10000,400,1000));
		felter.add(new Rederi("Maersk",17000,4200));
		felter.add(new Gade("Gade 3",12000,500,1200));
		felter.add(new Gade("Gade 4",12000,500,1200));
		felter.add(new Bryggeri("Tuborg",17000,200));
		felter.add(new Gade("Gade 5",15000,700,1500));
		felter.add(new Helle(15000));
		felter.add(new Gade("Frederiksberg All�",20000,1100,2000));
		felter.add(new Gade("R�dhuspladsen",20000,1100,2000));
	}
}