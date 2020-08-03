import classes.Parking;
import classes.PraviVoziloFactory;
import classes.ServiceFabrika;
import classes.TipVozila;

public class Program {

	public static void main(String[] args) {
		ServiceFabrika sf = new ServiceFabrika();

		sf.KreirajIParkirajVozilo(TipVozila.KABRIOLET);
		sf.KreirajIParkirajVozilo(TipVozila.CISTERNA);
		sf.KreirajIParkirajVozilo(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM);

		PraviVoziloFactory pv = PraviVoziloFactory.vratiInstancu();
		for(Parking p: pv.getListaParkinga()) {
			System.out.println(p.getListaParkiranihPrevoznihSredstava().size());
		}

	}

}
