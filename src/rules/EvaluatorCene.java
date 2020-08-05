package rules;

import classes.PrevoznoSredstvo;

public class EvaluatorCene {
	private RuleMotor rMotor;
	
	public EvaluatorCene() {
		//instanciranje pravila
		rMotor = new RuleMotor();
		RuleTurbina rTurbina = new RuleTurbina();
		RuleKatalizator rKatalizator = new RuleKatalizator();
		RuleKlima rKlima = new RuleKlima();
		
		//povezivanje pravila
		rMotor.listaSledbenika.add(rTurbina); // 0 za dizel
		rMotor.listaSledbenika.add(rKatalizator); // 1 za benzinac
		
		rTurbina.listaSledbenika.add(rKlima);
		rKatalizator.listaSledbenika.add(rKlima);
	}
	
	public void evaluiraj(PrevoznoSredstvo ps, Rezultat rezultat) {
		rMotor.apply(ps, rezultat);
	}
}
