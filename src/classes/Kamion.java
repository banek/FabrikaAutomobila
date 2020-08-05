package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public abstract class Kamion extends PrevoznoSredstvo {
	private int brojOsovina;
	private final double POCETNACENA = 3000; 

//konstruktor
	public Kamion() {
		super();
		pocetnaCena = POCETNACENA;
	}

	public Kamion(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena, int brojOsovina) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije,
				pocetnaCena);
		this.brojOsovina = brojOsovina;
		pocetnaCena = POCETNACENA;
		ukupnaCena = POCETNACENA;
	}

	// geteri i seteri
	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}

	@Override
	public String toString() {
		return "Broj osovina kamiona:" + brojOsovina;
	}
}
