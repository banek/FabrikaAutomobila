package classes;

import java.util.ArrayList;

public abstract class Automobil extends PrevoznoSredstvo {
	private int brojSedista;
	private ArrayList<String> listaDodatneOpreme;
	private final int POVRSINAAUTOMOBIL= 8;


	public Automobil() {
		super();
		povrsinaUM2 = POVRSINAAUTOMOBIL;
	}

	public Automobil(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2, int brojSedista,
			ArrayList<String> listaDodatneOpreme) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2);
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
