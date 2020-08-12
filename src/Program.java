import classes.Servis;
import classes.TipVozila;
import dto.DtoAutomobilSaKlasicnimKrovom;
import dto.DtoCisterna;

public class Program {

	public static void main(String[] args) {
		
		Servis s = new Servis();

		DtoCisterna dtoCisterna1 = new DtoCisterna();
		dtoCisterna1.boja = "Plava";
		dtoCisterna1.brojOsovina = 3;
		dtoCisterna1.kapacitetTanka = 150;
		dtoCisterna1.nazivMarke = "VW";
		dtoCisterna1.tipVozila = TipVozila.CISTERNA;
		
		s.PrimiPorudzbinuIKreiraj(TipVozila.CISTERNA, dtoCisterna1);

		DtoAutomobilSaKlasicnimKrovom dtoKlKr = new DtoAutomobilSaKlasicnimKrovom();
		s.PrimiPorudzbinuIKreiraj(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM, dtoKlKr);
//		s.PrimiPorudzbinuIKreiraj(TipVozila.KABRIOLET);
	
		s.ispisiPodatke();
		
		
	}

}
