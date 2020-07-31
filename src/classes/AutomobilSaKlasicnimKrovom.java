package classes;

import java.util.ArrayList;

public class AutomobilSaKlasicnimKrovom extends Automobil {
	 private double nosivostKrovaUKg;

	

	public AutomobilSaKlasicnimKrovom(int brojSedista, ArrayList<String> listaDodatneOpreme,double nosivostKrovaUKG) {
		super(brojSedista, listaDodatneOpreme);
		this.nosivostKrovaUKg=nosivostKrovaUKG;
	}

	public double getNosivostKrovaUKg() {
		return nosivostKrovaUKg;
	}

	public void setNosivostKrovaUKg(double nosivostKrovaUKg) {
		this.nosivostKrovaUKg = nosivostKrovaUKg;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "Nosivost krova automobila je " + nosivostKrovaUKg+ "Kg";
		
	}
}
