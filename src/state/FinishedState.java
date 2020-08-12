package state;

import classes.PrevoznoSredstvo;

public class FinishedState implements IVehicleState{

	@Override
	public void next(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
		 ps.setState(new ParkedState());
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
		 ps.setState(new ProductionState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
        System.out.println("Vozilo je ZAVRSENO i spremno za parkiranje");    
	}

}
