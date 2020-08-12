package classes;

import java.util.ArrayList;

public class AutomobilSaKlasicnimKrovom extends Automobil {
	private double nosivostKrovaUKg;

	public AutomobilSaKlasicnimKrovom() {
		super();
	}

	public AutomobilSaKlasicnimKrovom(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2,
			int brojSedista, ArrayList<String> listaDodatneOpreme, double nosivostKrovaUKG) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2, brojSedista, listaDodatneOpreme);
		this.nosivostKrovaUKg = nosivostKrovaUKG;
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
