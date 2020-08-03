package classes;

public abstract class Kamion extends PrevoznoSredstvo {
	private int brojOsovina;
	
//konstruktor
	public Kamion() {
		super();
	}
	
	public Kamion(String boja, String nazivMarke, int povrsinaUM2, int brojOsovina) {
		super(boja, nazivMarke, povrsinaUM2);
		this.brojOsovina = brojOsovina;
	}

//geteri i seteri
	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}

	@Override
	public String toString() {
		return "Broj osovina kamiona:" + brojOsovina;
	}
}
