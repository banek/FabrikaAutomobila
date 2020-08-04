package dto;

import classes.Sleper;

public class DtoSleper extends DtoKamion{
	public double vucnaSnaga;
	
	public Sleper castoToEntity() {
		Sleper sleper = new Sleper();
		sleper.setBoja(this.boja);
		sleper.setBrojOsovina(this.brojOsovina);
		sleper.setBrojSasije(this.brojSasije);
		sleper.setVucnaSnaga(this.vucnaSnaga);
		sleper.setNazivMarke(this.nazivMarke);
		sleper.setTipVozila(this.tipVozila);
		return sleper;
	}
}
