package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class MedjugradskiAutobus extends Autobusi {
	private int KapacitetPrtljaznogProstora;
	private final int POVRSINAMEDJUGRADSKI = 15;

	public MedjugradskiAutobus() {
		super();
		povrsinaUM2 = POVRSINAMEDJUGRADSKI;
	}

	public MedjugradskiAutobus(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena, int brojMestaZaSedenje, int brojMestaZaStajanje, int kapacitetPrtljaznogProstora) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
				pocetnaCena, brojMestaZaSedenje, brojMestaZaStajanje);
		KapacitetPrtljaznogProstora = kapacitetPrtljaznogProstora;
		povrsinaUM2 = POVRSINAMEDJUGRADSKI;
	}

	public int getKapacitetPrtljaznogProstora() {
		return KapacitetPrtljaznogProstora;
	}

	public void setKapacitetPrtljaznogProstora(int kapacitetPrtljaznogProstora) {
		KapacitetPrtljaznogProstora = kapacitetPrtljaznogProstora;
	}

	@Override
	public String toString() {
		return "Kapacitet prljaznog prostora medjugradskog autobusa je: " + this.KapacitetPrtljaznogProstora;
	}

}
