package rules;

import classes.PrevoznoSredstvo;

public class RuleTurbina extends Rule {

	@Override
	public void apply(PrevoznoSredstvo ps, Rezultat rezultat) {
		// TODO Auto-generated method stub
		System.out.println(rezultat.cena);
		rezultat.cena *= 1.02;
		listaSledbenika.get(0).apply(ps, rezultat);
	}

}
