package classes;
import classes.TipVozila;


public class PraviVoziloFactory {

	private static PraviVoziloFactory instanca = new PraviVoziloFactory();

	private PraviVoziloFactory() {
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
	

}
