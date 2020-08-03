package classes;

import java.util.ArrayList;

public class Kabriolet extends Automobil {
	private boolean mogucnostSkidanjaKrova;
	private boolean mogucnostPakovanjaKrovaUPrtljaznik;
	
	
	public Kabriolet() {
		super();
	}
	public Kabriolet(String boja, String nazivMarke, int povrsinaUM2, int brojSedista, ArrayList<String> listaDodatneOpreme,boolean mogucnostSkidanjaKrova, boolean mogucnostPakovanjaKrovaUPrtljaznik) {
		super(boja, nazivMarke, povrsinaUM2, brojSedista, listaDodatneOpreme);
		this.mogucnostSkidanjaKrova=mogucnostSkidanjaKrova;
		this.mogucnostPakovanjaKrovaUPrtljaznik=mogucnostPakovanjaKrovaUPrtljaznik;
	}
	public boolean isMogucnostSkidanjaKrova() {
		return mogucnostSkidanjaKrova;
	}
	public void setMogucnostSkidanjaKrova(boolean mogucnostSkidanjaKrova) {
		this.mogucnostSkidanjaKrova = mogucnostSkidanjaKrova;
	}
	public boolean isMogucnostPakovanjaKrovaUPrtljaznik() {
		return mogucnostPakovanjaKrovaUPrtljaznik;
	}
	public void setMogucnostPakovanjaKrovaUPrtljaznik(boolean mogucnostPakovanjaKrovaUPrtljaznik) {
		this.mogucnostPakovanjaKrovaUPrtljaznik = mogucnostPakovanjaKrovaUPrtljaznik;
	}
	
	@Override
	public String toString() {
		StringBuilder ispisi = new StringBuilder();
		if(mogucnostPakovanjaKrovaUPrtljaznik) {
			ispisi.append("Postoji mogucnost pakovanja krova u prtljaznik");
		}else {
			ispisi.append("Ne postoji mogucnost pakovanja krova u prtljaznik");
		}
		if(mogucnostSkidanjaKrova) {
			ispisi.append("Postoji mogucnost skidanja krova u potpunosti");
		}else {
			ispisi.append("Ne postoji mogucnost skidanja krova u potpunosti");
		}
		return ispisi.toString();
	}
}
