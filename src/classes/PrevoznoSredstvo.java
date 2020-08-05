package classes;

import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public abstract class PrevoznoSredstvo {

	protected TipVozila tipVozila;
	protected TipMotora tipMotora;
	protected TipKlime tipKlime;
	protected Boja tipBoje;
	protected TipDodatneOpreme tipDodatneOpreme;
	protected String boja;
	protected String nazivMarke;
	protected int povrsinaUM2;
	protected String brojSasije;
	protected double pocetnaCena;
	protected double ukupnaCena;
	

	public PrevoznoSredstvo() {
		this.brojSasije = Helper.generisiBrojSasije();
	}


	public PrevoznoSredstvo(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena) {
		this.tipVozila = tipVozila;
		this.tipMotora = tipMotora;
		this.tipKlime = tipKlime;
		this.tipBoje = tipBoje;
		this.tipDodatneOpreme = tipDodatneOpreme;
		this.boja = boja;
		this.nazivMarke = nazivMarke;
		this.povrsinaUM2 = povrsinaUM2;
		this.brojSasije = Helper.generisiBrojSasije();
		this.pocetnaCena = pocetnaCena;
	}


	public TipMotora getTipMotora() {
		return tipMotora;
	}

	public void setTipMotora(TipMotora tipMotora) {
		this.tipMotora = tipMotora;
	}

	public double getPocetnaCena() {
		return pocetnaCena;
	}


	public void setPocetnaCena(double pocetnaCena) {
		this.pocetnaCena = pocetnaCena;
	}


	public double getUkupnaCena() {
		return ukupnaCena;
	}


	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}


	public TipKlime getTipKlime() {
		return tipKlime;
	}

	public void setTipKlime(TipKlime tipKlime) {
		this.tipKlime = tipKlime;
	}

	public Boja getTipBoje() {
		return tipBoje;
	}

	public void setTipBoje(Boja tipBoje) {
		this.tipBoje = tipBoje;
	}

	public TipDodatneOpreme getTipDodatneOpreme() {
		return tipDodatneOpreme;
	}

	public void setTipDodatneOpreme(TipDodatneOpreme tipDodatneOpreme) {
		this.tipDodatneOpreme = tipDodatneOpreme;
	}

	public TipVozila getTipVozila() {
		return tipVozila;
	}

	public void setTipVozila(TipVozila tipVozila) {
		this.tipVozila = tipVozila;
	}

	public String getBrojSasije() {
		return brojSasije;
	}

	public void setBrojSasije(String brojSasije) {
		this.brojSasije = brojSasije;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getNazivMarke() {
		return nazivMarke;
	}

	public void setNazivMarke(String nazivMarke) {
		this.nazivMarke = nazivMarke;
	}

	public int getPovrsinaUM2() {
		return povrsinaUM2;
	}

	@Override
	public String toString() {
		return "Boja prevoznog sredstva je: " + this.boja + "\nMarka prevoznog sredstva je: " + this.nazivMarke
				+ "\nPovrsina u metrima kvadratnim prevoznog sredstva je: " + this.povrsinaUM2;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		PrevoznoSredstvo ps = (PrevoznoSredstvo) o;
		return brojSasije.equals(ps.brojSasije);
	}
	
	
}
