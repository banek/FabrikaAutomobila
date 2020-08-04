package classes;

public class GradskiAutobus extends Autobusi {
	private boolean zglobni;

	public GradskiAutobus() {
		super();
		povrsinaUM2=30;
	}

	public GradskiAutobus(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2, int brojMestaZaSedenje,
			int brojMestaZaStajanje, boolean zglobni) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2, brojMestaZaSedenje, brojMestaZaStajanje);
		this.zglobni = zglobni;
		povrsinaUM2=30;
	}

	public boolean isZglobni() {
		return zglobni;
	}

	public void setZglobni(boolean zglobni) {
		this.zglobni = zglobni;
	}

	@Override
	public String toString() {
		if (zglobni) {
			return "Gradski autobus je zglobni.";
		} else {
			return "Gradski autobus nije zglobni.";
		}
	}

}
