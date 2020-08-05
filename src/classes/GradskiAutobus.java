package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class GradskiAutobus extends Autobusi {
	private boolean zglobni;
	private final int POVRSINAGRADSKOG = 30;

	public GradskiAutobus() {
		super();
		povrsinaUM2 = POVRSINAGRADSKOG;
	}

	public GradskiAutobus(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena, int brojMestaZaSedenje, int brojMestaZaStajanje, boolean zglobni) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
				pocetnaCena, brojMestaZaSedenje, brojMestaZaStajanje);
		this.zglobni = zglobni;
		povrsinaUM2 = POVRSINAGRADSKOG;
	}

	public boolean isZglobni() {
		return zglobni;
	}

	public void setZglobni(boolean zglobni) {
		this.zglobni = zglobni;
	}

	@Override
	public String toString() {
		if (zglobni) {
			return "Gradski autobus je zglobni.";
		} else {
			return "Gradski autobus nije zglobni.";
		}
	}

}
