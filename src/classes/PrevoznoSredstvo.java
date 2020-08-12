package classes;

import state.IVehicleState;
import state.OrderState;

public abstract class PrevoznoSredstvo {

	protected TipVozila tipVozila;
	protected String boja;
	protected String nazivMarke;
	protected int povrsinaUM2;
	protected String brojSasije;

	private IVehicleState state = new OrderState();

	public PrevoznoSredstvo() {
		this.brojSasije = Helper.generisiBrojSasije();
		printState();
	}

	public PrevoznoSredstvo(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2) {
		this.tipVozila = tipVozila;
		this.boja = boja;
		this.nazivMarke = nazivMarke;
		this.povrsinaUM2 = povrsinaUM2;
		this.brojSasije = Helper.generisiBrojSasije();
		printState();
	}

	private void printState() {
		this.state.printStatus();
	}

	public void nextState() {
		this.state.next(this);
		printState();
	}

	public void previousState() {
		this.state.prev(this);
		printState();
	}

	public IVehicleState getState() {
		return state;
	}

	public void setState(IVehicleState state) {
		this.state = state;
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
