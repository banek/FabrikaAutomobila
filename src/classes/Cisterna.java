package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class Cisterna extends Kamion {
	private double kapacitetTanka;
	private final int POVRSINACISTERNA = 20;

//konstruktor
	public Cisterna() {
		super();
		povrsinaUM2 = POVRSINACISTERNA;
	}

	public Cisterna(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena, int brojOsovina, double kapacitetTanka) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
				pocetnaCena, brojOsovina);
		this.kapacitetTanka = kapacitetTanka;
		povrsinaUM2 = POVRSINACISTERNA;
	}

	// geteri i seteri
	public double getKapacitetTanka() {
		return kapacitetTanka;
	}

	public void setKapacitetTanka(double kapacitetTanka) {
		this.kapacitetTanka = kapacitetTanka;
	}

	@Override
	public String toString() {
		return "Kapacitet tanka cisterne: " + kapacitetTanka;
	}

}
