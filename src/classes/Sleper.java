package classes;

public class Sleper extends Kamion {
	private double vucnaSnaga;

//konstruktor
	public Sleper() {
		super();
	}

	public Sleper(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2, int brojOsovina,
			double vucnaSnaga) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2, brojOsovina);
		this.vucnaSnaga = vucnaSnaga;
	}

	// geteri i seteri
	public double getVucnaSnaga() {
		return vucnaSnaga;
	}

	public void setVucnaSnaga(double vucnaSnaga) {
		this.vucnaSnaga = vucnaSnaga;
	}

	@Override
	public String toString() {
		return "Vucna snaga slepera:" + vucnaSnaga;
	}
}
