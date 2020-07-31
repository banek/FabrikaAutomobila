package classes;

public abstract class Autobusi extends PrevoznoSredstvo {
	protected int brojMestaZaSedenje;
	protected int brojMestaZaStajanje;

	public Autobusi(String boja, String nazivMarke, int povrsinaUM2, int brojMestaZaSedenje, int brojMestaZaStajanje) {
		super(boja, nazivMarke, povrsinaUM2);
		this.brojMestaZaSedenje = brojMestaZaSedenje;
		this.brojMestaZaStajanje = brojMestaZaStajanje;
	}

	public int getBrojMestaZaSedenje() {
		return brojMestaZaSedenje;
	}

	public void setBrojMestaZaSedenje(int brojMestaZaSedenje) {
		this.brojMestaZaSedenje = brojMestaZaSedenje;
	}

	public int getBrojMestaZaStajanje() {
		return brojMestaZaStajanje;
	}

	public void setBrojMestaZaStajanje(int brojMestaZaStajanje) {
		this.brojMestaZaStajanje = brojMestaZaStajanje;
	}

}
