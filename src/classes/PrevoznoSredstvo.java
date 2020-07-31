package classes;

public abstract class PrevoznoSredstvo {

	protected String boja;
	protected String nazivMarke;
	protected int povrsinaUM2;

	public PrevoznoSredstvo() {
	}

	public PrevoznoSredstvo(String boja, String nazivMarke, int povrsinaUM2) {
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

	@Override
	public String toString() {
		return "Boja prevoznog sredstva je: " + this.boja + "\nMarka prevoznog sredstva je: " + this.nazivMarke
				+ "\nPovrsina u metrima kvadratnim prevoznog sredstva je: " + this.povrsinaUM2;
	}

}
