package classes;

public class MedjugradskiAutobus extends Autobusi {
	private int KapacitetPrtljaznogProstora;

	public MedjugradskiAutobus() {
		super();
		povrsinaUM2 = 15;
	}

	public MedjugradskiAutobus(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2,
			int brojMestaZaSedenje, int brojMestaZaStajanje, int kapacitetPrtljaznogProstora) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2, brojMestaZaSedenje, brojMestaZaStajanje);
		KapacitetPrtljaznogProstora = kapacitetPrtljaznogProstora;
		povrsinaUM2 = 15;
	}

	public int getKapacitetPrtljaznogProstora() {
		return KapacitetPrtljaznogProstora;
	}

	public void setKapacitetPrtljaznogProstora(int kapacitetPrtljaznogProstora) {
		KapacitetPrtljaznogProstora = kapacitetPrtljaznogProstora;
	}

	@Override
	public String toString() {
		return "Kapacitet prljaznog prostora medjugradskog autobusa je: " + this.KapacitetPrtljaznogProstora;
	}

}
