import Enum.Boja;
import Enum.TipKlime;
import Enum.TipMotora;
import classes.Servis;
import classes.TipVozila;
import dto.DtoCisterna;
import dto.DtoKabriolet;
import rules.EvaluatorCene;

public class Program {

	public static void main(String[] args) {

		Servis s = new Servis();

		DtoCisterna dtoCisterna1 = new DtoCisterna();
		dtoCisterna1.boja = "Zelena";
		dtoCisterna1.brojOsovina = 3;
		dtoCisterna1.kapacitetTanka = 150;
		dtoCisterna1.nazivMarke = "VW";
		dtoCisterna1.tipVozila = TipVozila.CISTERNA;
		dtoCisterna1.tipBoje = Boja.METALIK;
		dtoCisterna1.tipKlime = TipKlime.AUTOMATSKA_KLIMA;
		dtoCisterna1.tipMotora = TipMotora.DIZEL_SA_TURBINOM;
		
		DtoKabriolet dtoKab = new DtoKabriolet();
		dtoKab.tipMotora = TipMotora.DIZEL_SA_TURBINOM;
		
		
		s.PrimiPorudzbinuIKreiraj(TipVozila.CISTERNA, dtoCisterna1);
		
//		s.PrimiPorudzbinuIKreiraj(TipVozila.KABRIOLET, dtoKab);
//		s.PrimiPorudzbinuIKreiraj(TipVozila.AUTOMOBIL_SA_KLASICNIM_KROVOM);
//		s.PrimiPorudzbinuIKreiraj(TipVozila.KABRIOLET);
		s.ispisiPodatke();
		

	}

}
