package states;

import classes.PrevoznoSredstvo;

public class OrderState implements IVehicleState{

	@Override
	public void next(PrevoznoSredstvo ps) {
		
		if(ps.getBoja().equalsIgnoreCase("ZELENA")) {
			System.out.println("Ne proizvodimo vozila zelene boje");
			ps.setState(new AbortState());
		}else {
			ps.setState(new InConstructionState());
		}
		
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		System.out.println("Ovo je pocetno stanje!");
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je u ORDERED stanju");
	}
	
}