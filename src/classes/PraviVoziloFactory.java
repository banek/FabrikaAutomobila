package classes;

import java.util.ArrayList;
import java.util.List;

import dto.DtoAutomobilSaKlasicnimKrovom;
import dto.DtoCisterna;
import dto.DtoGradskiAutobus;
import dto.DtoKabriolet;
import dto.DtoMedjugradskiAutobus;
import dto.DtoPrevoznoSredstvo;
import dto.DtoSleper;

public class PraviVoziloFactory {
	private List<Parking> listaParkinga = new ArrayList<>();
	private static PraviVoziloFactory instanca = new PraviVoziloFactory();

	private PraviVoziloFactory() {
		Parking otvorenParking = new Parking(TipParkinga.OTVOREN, 1000, 1000);
		Parking natktivenParking = new Parking(TipParkinga.NATKRIVEN, 30, 2);
		Parking natktivenParking2 = new Parking(TipParkinga.NATKRIVEN, 50, 5);
		listaParkinga.add(natktivenParking);
		listaParkinga.add(natktivenParking2);
		listaParkinga.add(otvorenParking);
	}

	public static PraviVoziloFactory vratiInstancu() {
		return instanca;
	}

	public PrevoznoSredstvo napraviVozilo(TipVozila tipVozila, DtoPrevoznoSredstvo dtoPS) {

		if (tipVozila == null) {
			System.out.println("Niste uneli tip vozila!");
			return null;
		} else if (tipVozila.equals(TipVozila.KABRIOLET)) {
			System.out.println("Napravili ste Objekat klase Kabriolet");
			DtoKabriolet dtoKab = (DtoKabriolet) dtoPS;
			return dtoKab.castToEntity();
		} else if (tipVozila.equals(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM)) {
			System.out.println("Napravili ste Objekat klase Automobil sa klasicnim krovom");
			DtoAutomobilSaKlasicnimKrovom dtoKlasicni = (DtoAutomobilSaKlasicnimKrovom) dtoPS;
			return dtoKlasicni.castToEntity();
		} else if (tipVozila.equals(TipVozila.CISTERNA)) {
			System.out.println("Napravili ste Objekat klase Cisterna");
			DtoCisterna dtoCisterna = (DtoCisterna) dtoPS;
			return dtoCisterna.castToEntity();
		} else if (tipVozila.equals(TipVozila.SLEPER)) {
			System.out.println("Napravili ste Objekat klase Sleper");
			DtoSleper dtoSleper = (DtoSleper) dtoPS;
			return dtoSleper.castToEntity();
		} else if (tipVozila.equals(TipVozila.GRADSKI_AUTOBUS)) {
			System.out.println("Napravili ste Objekat klase Gradski autobus");
			DtoGradskiAutobus dtoGradski = (DtoGradskiAutobus) dtoPS;
			return dtoGradski.castToEntity();
		} else if (tipVozila.equals(TipVozila.MEDJUGRADSKI_AUTOBUS)) {
			System.out.println("Napravili ste Objekat klase Medjugradskiautobus");
			DtoMedjugradskiAutobus dtoMedjugradski = (DtoMedjugradskiAutobus) dtoPS;
			return dtoMedjugradski.castToEntity();
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
