package state;

import classes.PrevoznoSredstvo;

public class OrderState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		if (ps.getBoja().equalsIgnoreCase("zelena")) {
			System.out.println("Ne prozivodimo zelena vozila\n----------------");
			ps.setState(new AbortState());
		} else if(ps.getNazivMarke().equalsIgnoreCase("peugeot")){
			System.out.println("Ne prozivodimo pezo-e vozila\n----------------");
			ps.setState(new AbortState());
		}
		else {
			ps.setState(new ProductionState());
		}
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		// TODO Auto-generated method stub
		System.out.println("Ovo je pocetno stanje!");
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("Vozilo je u ORDERED stanju");
	}

}
