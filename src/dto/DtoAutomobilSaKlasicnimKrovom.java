package dto;

import classes.AutomobilSaKlasicnimKrovom;

public class DtoAutomobilSaKlasicnimKrovom extends DtoAutomobil{
	public double nosivostKrovaUKg;
	
	public AutomobilSaKlasicnimKrovom castToEntity() {
		AutomobilSaKlasicnimKrovom aut = new AutomobilSaKlasicnimKrovom();
		aut.setBoja(this.boja);
		aut.setBrojSasije(this.brojSasije);
		aut.setBrojSedista(this.brojSedista);
		aut.setListaDodatneOpreme(this.listaDodatneOpreme);
		aut.setNazivMarke(this.nazivMarke);
		aut.setNosivostKrovaUKg(this.nosivostKrovaUKg);
		aut.setTipVozila(this.tipVozila);
		return aut;
		
	}
}
