package classes;

import java.util.ArrayList;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class AutomobilSaKlasicnimKrovom extends Automobil {
	private double nosivostKrovaUKg;

	public AutomobilSaKlasicnimKrovom() {
		super();
	}

	

	public AutomobilSaKlasicnimKrovom(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			int brojSedista, ArrayList<String> listaDodatneOpreme, double nosivostKrovaUKg) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
				brojSedista, listaDodatneOpreme);
		this.nosivostKrovaUKg = nosivostKrovaUKg;
	}



	public double getNosivostKrovaUKg() {
		return nosivostKrovaUKg;
	}

	public void setNosivostKrovaUKg(double nosivostKrovaUKg) {
		this.nosivostKrovaUKg = nosivostKrovaUKg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Nosivost krova automobila je " + nosivostKrovaUKg + "Kg";

	}
}
