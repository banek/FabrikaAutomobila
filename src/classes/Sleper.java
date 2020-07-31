package classes;

public class Sleper extends Kamion {
	private double vucnaSnaga;

//konstruktor
	public Sleper() {
		super();
	}

	public Sleper(int brojOsovina, double vucnaSnaga) {
		super(brojOsovina);
		this.vucnaSnaga = vucnaSnaga;
	}

	//geteri i seteri
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
