package classes;

public class Cisterna extends Kamion {
	private double kapacitetTanka;

//konstruktor
	public Cisterna() {
		super();
		povrsinaUM2=20;
	}

	public Cisterna(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2, int brojOsovina, double kapacitetTanka) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2,brojOsovina);
		this.kapacitetTanka = kapacitetTanka;
		povrsinaUM2=20;
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
