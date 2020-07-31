package classes;

public class Kabriolet extends Automobil {
	private boolean mogucnostSkidanjaKrova;
	private boolean mogucnostPakovanjaKrovaUPrtljaznik;
	
	public Kabriolet(boolean mogucnostSkidanjaKrova, boolean mogucnostPakovanjaKrovaUPrtljaznik) {
		super();
		this.mogucnostSkidanjaKrova = mogucnostSkidanjaKrova;
		this.mogucnostPakovanjaKrovaUPrtljaznik = mogucnostPakovanjaKrovaUPrtljaznik;
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
	
	
}
