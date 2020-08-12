package state;

import classes.PrevoznoSredstvo;

public class ProductionState implements IVehicleState{

	@Override
	public void next(PrevoznoSredstvo ps) {
		 ps.setState(new FinishedState());
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
		 ps.setState(new OrderState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
        System.out.println("Vozilo je u stanju IZRADE");
	}

}
