package classes;

public abstract class Kamion {
	private int brojOsovina;
	
//konstruktor
	public Kamion() {
		super();
	}
	
	public Kamion(int brojOsovina) {
		super();
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
