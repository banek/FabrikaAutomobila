package dto;

import classes.Cisterna;

public class DtoCisterna extends DtoKamion {
	public double kapacitetTanka;

	public Cisterna castToEntity() {
		Cisterna cisterna = new Cisterna();
		cisterna.setBoja(this.boja);
		cisterna.setBrojOsovina(this.brojOsovina);
		cisterna.setBrojSasije(this.brojSasije);
		cisterna.setKapacitetTanka(this.kapacitetTanka);
		cisterna.setNazivMarke(this.nazivMarke);
		cisterna.setTipVozila(this.tipVozila);
		cisterna.setTipBoje(this.tipBoje);
		cisterna.setTipDodatneOpreme(this.tipDodatneOpreme);
		cisterna.setTipKlime(this.tipKlime);
		cisterna.setTipMotora(this.tipMotora);
		return cisterna;
	}
}
