package classes;

public class Servis {
	
	PraviVoziloFactory pvf = PraviVoziloFactory.vratiInstancu();
	
	
	public void PrimiPorudzbinuIKreiraj(TipVozila tipVozila) {
		PrevoznoSredstvo ps = pvf.napraviVozilo(tipVozila);
		ps.setTipVozila(tipVozila);
		smestiVoziloUParking(ps);
		
	}
	public void smestiVoziloUParking(PrevoznoSredstvo ps) {
		if(ps instanceof Automobil) {
			for (Parking parking : pvf.getListaParkinga() ) {
				if(parking.dodavanjePrevoznogSredstva(ps)) {
					System.out.println("Uspesno ste parkirali " + ps.getTipVozila() + " na parking");
					break;
				}
			}
		}else if(ps instanceof Kamion || ps instanceof Autobusi ) {
			for (Parking parking : pvf.getListaParkinga() ) {
				if(parking.getVisinaParkinga() > 2) {
					if(parking.dodavanjePrevoznogSredstva(ps)) {
						System.out.println("Uspesno ste parkirali " + ps.getTipVozila()  + " na parking");
						break;
					}	
				}
			}
		}else {
			System.out.println("Trenutno neam mesta ni na jednom parkingu");
		}
	}
	
	public void ispisiPodatke() {
		int i = 1;
		
		for (Parking parking : pvf.getListaParkinga()) {
			System.out.println("Parking " + i + " (" + parking.getListaParkiranihPrevoznihSredstava().size() +")");	
			for(PrevoznoSredstvo ps : parking.getListaParkiranihPrevoznihSredstava()) {
				System.out.println(" : " + ps.tipVozila);
			}
			i++;
		}
	}
	
}
	
	

