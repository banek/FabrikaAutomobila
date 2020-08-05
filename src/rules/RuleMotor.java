package rules;

import classes.PrevoznoSredstvo;

public class RuleMotor extends Rule{

	@Override
	public void apply(PrevoznoSredstvo ps, Rezultat rezultat) {
		// TODO Auto-generated method stub
		if (ps.tipMotora != null) {
			switch (ps.tipMotora) {
			case DIZEL_SA_TURBINOM:
				rezultat.cena *= 1.05;
				listaSledbenika.get(0).apply(ps, rezultat);
				break;
			case BENZIN:
				rezultat.cena *= 1.03;
				listaSledbenika.get(1).apply(ps, rezultat);
			}
		}
	}

	
	

}
