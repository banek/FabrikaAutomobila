package classes;

import Enum.Boja;
import Enum.KonstrukcijaMotora;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;
import states.IVehicleState;
import states.OrderState;

public abstract class PrevoznoSredstvo {

	protected TipVozila tipVozila;
	public TipMotora tipMotora;
	public TipKlime tipKlime;
	public Boja tipBoje;
	public TipDodatneOpreme tipDodatneOpreme;
	public KonstrukcijaMotora konstrukcijaMotora;
	protected String boja;
	protected String nazivMarke;
	protected int povrsinaUM2;
	protected String brojSasije;
	protected double pocetnaCena;
	protected double ukupnaCena;
	
	IVehicleState state = new OrderState();
	

	public PrevoznoSredstvo() {
		this.brojSasije = Helper.generisiBrojSasije();
		this.printState();
	}


	public PrevoznoSredstvo(TipVozila tipVozila, TipMotora tipMotora, TipKlime tipKlime, Boja tipBoje,
			TipDodatneOpreme tipDodatneOpreme, String boja, String nazivMarke, int povrsinaUM2, String brojSasije,
			double pocetnaCena) {
		this.tipVozila = tipVozila;
		this.tipMotora = tipMotora;
		this.tipKlime = tipKlime;
		this.tipBoje = tipBoje;
		this.tipDodatneOpreme = tipDodatneOpreme;
		this.konstrukcijaMotora = KonstrukcijaMotora.TURBINA;
		this.boja = boja;
		this.nazivMarke = nazivMarke;
		this.povrsinaUM2 = povrsinaUM2;
		this.brojSasije = Helper.generisiBrojSasije();
		this.pocetnaCena = pocetnaCena;
		this.printState();
	}
	
	public void printState() {
		this.state.printStatus();
	}
	
	public void nextState() {
		this.state.next(this);
	}
	
	public void previousState() {
		this.state.prev(this);
	}


	public IVehicleState getState() {
		return state;
	}


	public void setState(IVehicleState state) {
		this.state = state;
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
