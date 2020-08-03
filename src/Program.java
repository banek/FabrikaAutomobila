import classes.Parking;
import classes.PraviVoziloFactory;
import classes.PrevoznoSredstvo;
import classes.Servis;
import classes.TipParkinga;
import classes.TipVozila;

public class Program {

	public static void main(String[] args) {
		
		PraviVoziloFactory fabrikaVozila = PraviVoziloFactory.vratiInstancu();
		
		
		Parking otvoreniParking = new Parking();
		otvoreniParking.setTipParkinga(TipParkinga.OTVOREN);
		otvoreniParking.setPovrsinaParkinga(1000);
		
		Servis s = new Servis();
		
		s.PrimiPorudzbinuIKreiraj(TipVozila.CISTERNA);
		s.PrimiPorudzbinuIKreiraj(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM);
		
		for (Parking  parking : fabrikaVozila.getListaParkinga()) {
			System.out.println(parking.getListaParkiranihPrevoznihSredstava().size());
		}
		
	}

}
