package classes;

public class Cisterna extends Kamion {
	private double kapacitetTanka;

//konstruktor
	public Cisterna() {
		super();
	}

	public Cisterna(String boja, String nazivMarke, int povrsinaUM2, int brojOsovina, double kapacitetTanka) {
		super(boja, nazivMarke, povrsinaUM2,brojOsovina);
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
