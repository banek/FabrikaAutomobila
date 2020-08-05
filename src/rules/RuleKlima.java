package rules;

import classes.PrevoznoSredstvo;

public class RuleKlima extends Rule {

	@Override
	public void apply(PrevoznoSredstvo ps, Rezultat rezultat) {
		// TODO Auto-generated method stub
		if (ps.tipKlime != null) {
			switch (ps.tipKlime) {
			case AUTOMATSKA_KLIMA:
				rezultat.cena *= 1.03;
				rezultat.cena *= 1.02;
				break;
			case MANUELNA_KLIMA:
				rezultat.cena *= 1.03;
				break;
			}
		}
		
	}

}
