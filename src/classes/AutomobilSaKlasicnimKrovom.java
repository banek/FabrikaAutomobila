package classes;

public class AutomobilSaKlasicnimKrovom extends Automobil {
	 private double nosivostKrovaUKg;

	public AutomobilSaKlasicnimKrovom(double nosivostKrovaUKg) {
		super();
		this.nosivostKrovaUKg = nosivostKrovaUKg;
	}

	public double getNosivostKrovaUKg() {
		return nosivostKrovaUKg;
	}

	public void setNosivostKrovaUKg(double nosivostKrovaUKg) {
		this.nosivostKrovaUKg = nosivostKrovaUKg;
	}
	 
}
