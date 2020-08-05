package dto;

import classes.Sleper;

public class DtoSleper extends DtoKamion{
	public double vucnaSnaga;
	
	public Sleper castToEntity() {
		Sleper sleper = new Sleper();
		sleper.setBoja(this.boja);
		sleper.setBrojOsovina(this.brojOsovina);
		sleper.setBrojSasije(this.brojSasije);
		sleper.setVucnaSnaga(this.vucnaSnaga);
		sleper.setNazivMarke(this.nazivMarke);
		sleper.setTipVozila(this.tipVozila);
		sleper.setTipBoje(this.tipBoje);
		sleper.setTipDodatneOpreme(this.tipDodatneOpreme);
		sleper.setTipKlime(this.tipKlime);
		sleper.setTipMotora(this.tipMotora);
		return sleper;
	}
}
