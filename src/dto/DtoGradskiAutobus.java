package dto;

import classes.GradskiAutobus;

public class DtoGradskiAutobus extends DtoAutobusi{
	public boolean zglobni;
	
	public GradskiAutobus castToEntity() {
		GradskiAutobus gradski = new GradskiAutobus();
		gradski.setBoja(this.boja);
		gradski.setBrojMestaZaSedenje(this.brojMestaZaSedenje);
		gradski.setBrojMestaZaStajanje(this.brojMestaZaStajanje);
		gradski.setBrojSasije(this.brojSasije);
		gradski.setNazivMarke(this.nazivMarke);
		gradski.setTipVozila(this.tipVozila);
		gradski.setZglobni(this.zglobni);
		return gradski;
	}
}
