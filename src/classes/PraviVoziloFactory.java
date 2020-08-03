package classes;

import java.util.ArrayList;
import java.util.List;

public class PraviVoziloFactory {
	private List<Parking> listaParkinga = new ArrayList<>();
	private static PraviVoziloFactory instanca = new PraviVoziloFactory();

	private PraviVoziloFactory() {
		Parking otvorenParking = new Parking(TipParkinga.OTVOREN, 1000, 1000);
		Parking natktivenParking = new Parking(TipParkinga.NATKRIVEN, 1000, 2);
		Parking natktivenParking2 = new Parking(TipParkinga.NATKRIVEN, 50, 5);
		listaParkinga.add(natktivenParking);
		listaParkinga.add(natktivenParking2);
		listaParkinga.add(otvorenParking);
	}

	public static PraviVoziloFactory vratiInstancu() {
		return instanca;
	}

	public PrevoznoSredstvo napraviVozilo(TipVozila tipVozila) {

		if (tipVozila == null) {
			System.out.println("Niste uneli tip vozila!");
			return null;
		} else if (tipVozila.equals(TipVozila.KABRIOLET)) {
			System.out.println("Napravili ste Objekat klase Kabriolet");
			return new Kabriolet();
		} else if (tipVozila.equals(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM)) {
			System.out.println("Napravili ste Objekat klase Automobil sa klasicnim krovom");
			return new AutomobilSaKlasicnimKrovom();
		} else if (tipVozila.equals(TipVozila.CISTERNA)) {
			System.out.println("Napravili ste Objekat klase Cisterna");
			return new Cisterna();
		} else if (tipVozila.equals(TipVozila.SLEPER)) {
			System.out.println("Napravili ste Objekat klase Sleper");
			return new Sleper();
		} else if (tipVozila.equals(TipVozila.GRADSKI_AUTOBUS)) {
			System.out.println("Napravili ste Objekat klase Gradski autobus");
			return new GradskiAutobus();
		} else if (tipVozila.equals(TipVozila.MEDJUGRADSKI_AUTOBUS)) {
			System.out.println("Napravili ste Objekat klase Medjugradskiautobus");
			return new MedjugradskiAutobus();
		} else {
			System.out.println("Uneli ste nepostojeci tip vozila!");
			return null;
		}
	}
	
	//public 

	public List<Parking> getListaParkinga() {
		return listaParkinga;
	}

}
