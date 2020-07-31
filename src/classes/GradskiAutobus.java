package classes;

public class GradskiAutobus extends Autobusi {
	private boolean zglobni;

	public GradskiAutobus() {
		super();
	}

	public GradskiAutobus(String boja, String nazivMarke, int povrsinaUM2, int brojMestaZaSedenje,
			int brojMestaZaStajanje, boolean zglobni) {
		super(boja, nazivMarke, povrsinaUM2, brojMestaZaSedenje, brojMestaZaStajanje);
		this.zglobni = zglobni;
	}

	public boolean isZglobni() {
		return zglobni;
	}

	public void setZglobni(boolean zglobni) {
		this.zglobni = zglobni;
	}

	@Override
	public String toString() {
		if(zglobni) {
			return "Gradski autobus je zglobni.";
		}else {
			return "Gradski autobus nije zglobni.";
		}
	}

	
}
