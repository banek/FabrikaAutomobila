package states;

import classes.PrevoznoSredstvo;

public class FinishedState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		ps.setState(new ReadyToBeParkedState());
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		ps.setState(new InConstructionState());
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je ZAVRSENO i spremno za parkiranje");	
	}

}
