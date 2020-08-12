package states;

import classes.PrevoznoSredstvo;

public class ParkedState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		System.out.println("Ovo je poslednje stanje");
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		ps.setState(new ReadyToBeParkedState());
		
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je PARKIRANO!");
	}

}
