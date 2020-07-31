package classes;

import java.util.ArrayList;

public abstract class Automobil {
	private int brojSedista;
	private ArrayList<String> listaDodatneOpreme;
	
	public Automobil(int brojSedista, ArrayList<String> listaDodatneOpreme) {
		super();
		this.brojSedista = brojSedista;
		this.listaDodatneOpreme = listaDodatneOpreme;
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

}
