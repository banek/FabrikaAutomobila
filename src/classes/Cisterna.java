package classes;

public class Cisterna extends Kamion {
	private double kapacitetTanka;

//konstruktor
	public Cisterna(double kapacitetTanka) {
		super();
		this.kapacitetTanka = kapacitetTanka;
	}

//geteri i seteri
	public double getKapacitetTanka() {
		return kapacitetTanka;
	}

	public void setKapacitetTanka(double kapacitetTanka) {
		this.kapacitetTanka = kapacitetTanka;
	}

}
