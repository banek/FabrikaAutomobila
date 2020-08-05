package rules;

import classes.PrevoznoSredstvo;

public interface IRule {
	void apply(PrevoznoSredstvo ps, Rezultat rezultat);
}
