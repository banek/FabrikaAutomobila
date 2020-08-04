package dto;

import classes.Cisterna;

public class DtoCisterna extends DtoKamion {
	public double kapacitetTanka;

	public Cisterna castoToEntity() {
		Cisterna cisterna = new Cisterna();
		cisterna.setBoja(this.boja);
		cisterna.setBrojOsovina(this.brojOsovina);
		cisterna.setBrojSasije(this.brojSasije);
		cisterna.setKapacitetTanka(this.kapacitetTanka);
		cisterna.setNazivMarke(this.nazivMarke);
		cisterna.setTipVozila(this.tipVozila);
		return cisterna;
	}
}
