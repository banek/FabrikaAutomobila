package classes;

public class Cisterna extends Kamion {
	private double kapacitetTanka;
	private final int POVRSINACISTERNA = 20;

	
//konstruktor
	public Cisterna() {
		super();
		povrsinaUM2=POVRSINACISTERNA;
	}

	public Cisterna(TipVozila tipVozila, String boja, String nazivMarke, int povrsinaUM2, int brojOsovina, double kapacitetTanka) {
		super(tipVozila, boja, nazivMarke, povrsinaUM2,brojOsovina);
		this.kapacitetTanka = kapacitetTanka;
		povrsinaUM2=POVRSINACISTERNA;
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
