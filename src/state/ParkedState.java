package state;

import classes.PrevoznoSredstvo;

public class ParkedState implements IVehicleState{

	@Override
	public void next(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
        System.out.println("Ovo je poslednje stanje");
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
		ps.setState(new FinishedState());	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
        System.out.println("Vozilo je PARKIRANO");
	}

}
