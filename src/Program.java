import classes.Parking;
import classes.PraviVoziloFactory;
import classes.TipParkinga;

public class Program {

	public static void main(String[] args) {
		
		PraviVoziloFactory fabrikaVozila = PraviVoziloFactory.vratiInstancu();
		
		Parking otvoreniParking = new Parking();
		otvoreniParking.setTipParkinga(TipParkinga.OTVOREN);
		otvoreniParking.setPovrsinaParkinga(1000);
		
	}

}
