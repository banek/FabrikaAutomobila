package dto;

import classes.Kabriolet;

public class DtoKabriolet extends DtoAutomobil{
	public boolean mogucnostSkidanjaKrova;
	public boolean mogucnostPakovanjaKrovaUPrtljaznik;
	
	public Kabriolet castToEntity() {
		Kabriolet kabriolet = new Kabriolet();
		kabriolet.setBoja(this.boja);
		kabriolet.setBrojSasije(this.brojSasije);
		kabriolet.setBrojSedista(this.brojSedista);
		kabriolet.setListaDodatneOpreme(this.listaDodatneOpreme);
		kabriolet.setMogucnostPakovanjaKrovaUPrtljaznik(this.mogucnostPakovanjaKrovaUPrtljaznik);
		kabriolet.setMogucnostSkidanjaKrova(this.mogucnostSkidanjaKrova);
		kabriolet.setNazivMarke(this.nazivMarke);
		kabriolet.setTipVozila(this.tipVozila);
		kabriolet.setTipBoje(this.tipBoje);
		kabriolet.setTipDodatneOpreme(this.tipDodatneOpreme);
		kabriolet.setTipKlime(this.tipKlime);
		kabriolet.setTipMotora(this.tipMotora);
		return kabriolet;
	}
}
