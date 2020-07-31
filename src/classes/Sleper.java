package classes;

public class Sleper extends Kamion {
	private double vucnaSnaga;

//konstruktor
	public Sleper(double vucnaSnaga) {
		super();
		this.vucnaSnaga = vucnaSnaga;
	}

//geteri i seteri
	public double getVucnaSnaga() {
		return vucnaSnaga;
	}

	public void setVucnaSnaga(double vucnaSnaga) {
		this.vucnaSnaga = vucnaSnaga;
	}

}
