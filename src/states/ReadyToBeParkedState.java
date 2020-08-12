package states;

import classes.PrevoznoSredstvo;

public class ReadyToBeParkedState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		ps.setState(new ParkedState());
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		ps.setState(new FinishedState());
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je spremno za PARKIRANJE!");
	}

}
