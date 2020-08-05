package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class Sleper extends Kamion {
	private double vucnaSnaga;
	private final int POVRSINASLEPER = 15;

	
//konstruktor
	public Sleper() {
		super();
		povrsinaUM2=POVRSINASLEPER;
	}

	

	public Sleper(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
		TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
		int brojOsovina, double vucnaSnaga) {
	super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
			brojOsovina);
	this.vucnaSnaga = vucnaSnaga;
	povrsinaUM2=POVRSINASLEPER;
}



	// geteri i seteri
	public double getVucnaSnaga() {
		return vucnaSnaga;
	}

	public void setVucnaSnaga(double vucnaSnaga) {
		this.vucnaSnaga = vucnaSnaga;
	}

	@Override
	public String toString() {
		return "Vucna snaga slepera:" + vucnaSnaga;
	}
}
