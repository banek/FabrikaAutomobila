package states;

import classes.PrevoznoSredstvo;

public class InConstructionState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		ps.setState(new FinishedState());
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		ps.setState(new OrderState());
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je u stanju IZRADE");
	}
	
}
