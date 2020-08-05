package rules;

import java.util.ArrayList;
import java.util.List;

public abstract class Rule implements IRule {
	List<IRule> listaSledbenika = new ArrayList<IRule>(); 
}
