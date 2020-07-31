package classes;



public class PraviVoziloFactory {

	private static PraviVoziloFactory instanca = new PraviVoziloFactory();

	private PraviVoziloFactory() {
	}

	public static PraviVoziloFactory vratiInstancu() {
		return instanca;
	}

	public PrevoznoSredstvo napraviVozilo(String tipVozila) {

		if (tipVozila == null) {
			System.out.println("Niste uneli tip vozila!");
			return null;
		} else if (tipVozila.equalsIgnoreCase("Kabriolet")) {
			System.out.println("Napravili ste Objekat klase Kabriolet");
			return new Kabriolet();
		} else if (tipVozila.equalsIgnoreCase("KlasicniKrov")) {
			System.out.println("Napravili ste Objekat klase Automobil sa klasicnim krovom");
			return new AutomobilSaKlasicnimKrovom();
		} else if (tipVozila.equalsIgnoreCase("Cisterna")) {
			System.out.println("Napravili ste Objekat klase Cisterna");
			return new Cisterna();
		} else if (tipVozila.equalsIgnoreCase("Sleper")) {
			System.out.println("Napravili ste Objekat klase Sleper");
			return new Sleper();
		} else if (tipVozila.equalsIgnoreCase("GradskiAutobus")) {
			System.out.println("Napravili ste Objekat klase Gradski autobus");
			return new GradskiAutobus();
		} else if (tipVozila.equalsIgnoreCase("MedjugradskiAutobus")) {
			System.out.println("Napravili ste Objekat klase Medjugradskiautobus");
			return new MedjugradskiAutobus();
		} else {
			System.out.println("Uneli ste nepostojeci tip vozila!");
			return null;
		}
	}

}
