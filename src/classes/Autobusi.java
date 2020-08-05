package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public abstract class Autobusi extends PrevoznoSredstvo {
	protected int brojMestaZaSedenje;
	protected int brojMestaZaStajanje;

	public Autobusi() {
		super();
	}
	
	public Autobusi(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			int brojMestaZaSedenje, int brojMestaZaStajanje) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije);
		this.brojMestaZaSedenje = brojMestaZaSedenje;
		this.brojMestaZaStajanje = brojMestaZaStajanje;
	}

	public int getBrojMestaZaSedenje() {
		return brojMestaZaSedenje;
	}

	public void setBrojMestaZaSedenje(int brojMestaZaSedenje) {
		this.brojMestaZaSedenje = brojMestaZaSedenje;
	}

	public int getBrojMestaZaStajanje() {
		return brojMestaZaStajanje;
	}

	public void setBrojMestaZaStajanje(int brojMestaZaStajanje) {
		this.brojMestaZaStajanje = brojMestaZaStajanje;
	}

	@Override
	public String toString() {
		return "Broj mesta za sedenje u autobusu je: " + this.brojMestaZaSedenje
				+ "\nBroj mesta za stajanje u autobusu je: " + this.brojMestaZaStajanje;
	}

}
