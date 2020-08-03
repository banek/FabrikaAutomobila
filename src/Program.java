import classes.Parking;
import classes.PraviVoziloFactory;
import classes.PrevoznoSredstvo;
import classes.Servis;
import classes.TipVozila;

public class Program {

	public static void main(String[] args) {

		PraviVoziloFactory fabrikaVozila = PraviVoziloFactory.vratiInstancu();

		/*Parking otvoreniParking = new Parking();
		otvoreniParking.setTipParkinga(TipParkinga.OTVOREN);
		otvoreniParking.setPovrsinaParkinga(1000);*/
		Servis s = new Servis();
		
		PrevoznoSredstvo prevoznosredstvo = s.PrimiPorudzbenicuIKreiraj(TipVozila.CISTERNA);
		s.parkirajVozilo(prevoznosredstvo);
		
		PrevoznoSredstvo cist = fabrikaVozila.napraviVozilo(TipVozila.CISTERNA);
		s.parkirajVozilo(cist);
		PrevoznoSredstvo kab = fabrikaVozila.napraviVozilo(TipVozila.KABRIOLET);
		s.parkirajVozilo(kab);
		PrevoznoSredstvo autobus = fabrikaVozila.napraviVozilo(TipVozila.MEDJUGRADSKI_AUTOBUS);
		s.parkirajVozilo(autobus);
		for (Parking parking : fabrikaVozila.getListaParkinga()) {
			System.out.println(parking.getListaParkiranihPrevoznihSredstava().size());
		}

	}

}
