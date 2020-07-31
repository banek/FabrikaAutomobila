import classes.PraviVoziloFactory;
import classes.TipVozila;

public class Program {

	public static void main(String[] args) {
		
		PraviVoziloFactory ps = PraviVoziloFactory.vratiInstancu();
		ps.napraviVozilo(TipVozila.KABRIOLET);
		
		
		
	}

}
