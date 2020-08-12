package state;

import classes.PrevoznoSredstvo;

public interface IVehicleState {
	
	void next(PrevoznoSredstvo ps);
	void prev(PrevoznoSredstvo ps);
	void printStatus();

}
