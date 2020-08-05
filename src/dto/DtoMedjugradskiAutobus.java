package dto;

import classes.MedjugradskiAutobus;

public class DtoMedjugradskiAutobus extends DtoAutobusi{
	public int KapacitetPrtljaznogProstora;
	
	public MedjugradskiAutobus castToEntity() {
		MedjugradskiAutobus mdjA = new MedjugradskiAutobus();
		mdjA.setBoja(this.boja);
		mdjA.setBrojMestaZaSedenje(this.brojMestaZaSedenje);
		mdjA.setBrojMestaZaStajanje(this.brojMestaZaStajanje);
		mdjA.setBrojSasije(this.brojSasije);
		mdjA.setKapacitetPrtljaznogProstora(this.KapacitetPrtljaznogProstora);
		mdjA.setNazivMarke(this.nazivMarke);
		mdjA.setTipVozila(this.tipVozila);
		mdjA.setTipBoje(this.tipBoje);
		mdjA.setTipDodatneOpreme(this.tipDodatneOpreme);
		mdjA.setTipKlime(this.tipKlime);
		mdjA.setTipMotora(this.tipMotora);
		return mdjA;
	}
}
