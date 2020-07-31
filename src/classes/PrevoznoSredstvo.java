package classes;

public abstract class PrevoznoSredstvo {

	protected String boja;
	protected String nazivMarke;
	protected int povrsinaUM2;

	public PrevoznoSredstvo() {
		super();
	}

	public PrevoznoSredstvo(String boja, String nazivMarke, int povrsinaUM2) {
		super();
		this.boja = boja;
		this.nazivMarke = nazivMarke;
		this.povrsinaUM2 = povrsinaUM2;
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

	public void setPovrsinaUM2(int povrsinaUM2) {
		this.povrsinaUM2 = povrsinaUM2;
	}

}
