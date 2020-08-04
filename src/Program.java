import classes.Servis;
import classes.TipVozila;

public class Program {

	public static void main(String[] args) {
		
		Servis s = new Servis();
		
		s.PrimiPorudzbinuIKreiraj(TipVozila.CISTERNA);
		s.PrimiPorudzbinuIKreiraj(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM);
		s.PrimiPorudzbinuIKreiraj(TipVozila.KABRIOLET);
		
		s.ispisiPodatke();
		
		
	}

}
