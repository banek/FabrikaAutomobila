package classes;

public class Cisterna extends Kamion {
	private double kapacitetTanka;

//konstruktor
	public Cisterna() {
		super();
	}

	public Cisterna(int brojOsovina, double kapacitetTanka) {
		super(brojOsovina);
		this.kapacitetTanka = kapacitetTanka;
	}

//geteri i seteri
	public double getKapacitetTanka() {
		return kapacitetTanka;
	}

	public void setKapacitetTanka(double kapacitetTanka) {
		this.kapacitetTanka = kapacitetTanka;
	}

	@Override
	public String toString() {
		return "Kapacitet tanka cisterne: " + kapacitetTanka;
	}

}
