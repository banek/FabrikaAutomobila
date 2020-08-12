package states;

import classes.PrevoznoSredstvo;

public class AbortState implements IVehicleState {

	@Override
	public void next(PrevoznoSredstvo ps) {
		System.out.println("Nema sledeceg stanja");
		
	}

	@Override
	public void prev(PrevoznoSredstvo ps) {
		System.out.println("Nema predhodnog stanja");
		
	}

	@Override
	public void printStatus() {
		System.out.println("Vozilo je u stanju PREKIDA proizvodnje");
		
	}

}
