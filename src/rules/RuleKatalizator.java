package rules;

import classes.PrevoznoSredstvo;

public class RuleKatalizator extends Rule {

	@Override
	public void apply(PrevoznoSredstvo ps, Rezultat rezultat) {
		// TODO Auto-generated method stub
		if (ps.konstrukcijaMotora != null) {
			switch (ps.konstrukcijaMotora) {
			
			case TURBINA:
				rezultat.cena *= 1.03;
				rezultat.cena *= 1.025;
				
				break;
			case KATALIZATOR:
				rezultat.cena *= 1.05;
				rezultat.cena *= 1.02;
				break;
			case PDF:
				rezultat.cena *= 1.07;
				break;
			}
		}
	}

}
