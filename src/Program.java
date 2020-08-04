import classes.Parking;
import classes.PraviVoziloFactory;
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
		s.PrimiPorudzbinuIKreiraj(TipVozila.GRADSKI_AUTOBUS);
		s.PrimiPorudzbinuIKreiraj(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM);

		IspisiPodatkeOParkinzima(fabrikaVozila);
	}

	public static void IspisiPodatkeOParkinzima(PraviVoziloFactory fabrikaVozila) {
		System.out.println("--------------------------------");
		for (int i = 0; i < fabrikaVozila.getListaParkinga().size(); i++) {
			System.out.println("Parking " + i + ": \n" + fabrikaVozila.getListaParkinga().get(i).toString());
		}
	}
}
