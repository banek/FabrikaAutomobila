package classes;

import java.util.ArrayList;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public abstract class Automobil extends PrevoznoSredstvo {
	private int brojSedista;
	private ArrayList<String> listaDodatneOpreme;
	private final int POVRSINAAUTOMOBIL= 8;


	public Automobil() {
		super();
		povrsinaUM2 = POVRSINAAUTOMOBIL;
	}

	public Automobil(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			int brojSedista, ArrayList<String> listaDodatneOpreme) {
		super(tipVozila, tipMotora, tipKlime, tipBoje, tipDodatneOpreme, boja, nazivMarke, povrsinaUM2, brojSasije);
		this.brojSedista = brojSedista;
		this.listaDodatneOpreme = listaDodatneOpreme;
		povrsinaUM2 = POVRSINAAUTOMOBIL;
	}

	public int getBrojSedista() {
		return brojSedista;
	}

	public void setBrojSedista(int brojSedista) {
		this.brojSedista = brojSedista;
	}

	public ArrayList<String> getListaDodatneOpreme() {
		return listaDodatneOpreme;
	}

	public void setListaDodatneOpreme(ArrayList<String> listaDodatneOpreme) {
		this.listaDodatneOpreme = listaDodatneOpreme;
	}

	@Override
	public String toString() {

		StringBuilder ispis = new StringBuilder();
		ispis.append("Automobil ima " + brojSedista + " i ovo mu je lista dodatne opreme:");
		for (String listItem : listaDodatneOpreme) {
			ispis.append(listItem + "\n");
		}

		return ispis.toString();

	}
}
