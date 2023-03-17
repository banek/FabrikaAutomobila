package classes;

import dto.DtoPrevoznoSredstvo;

public class Servis {

	PraviVoziloFactory pvf = PraviVoziloFactory.vratiInstancu();

	public void PrimiPorudzbinuIKreiraj(TipVozila tipVozila, DtoPrevoznoSredstvo dtoPS) {
		PrevoznoSredstvo ps = pvf.napraviVozilo(tipVozila, dtoPS);
		ps.setTipVozila(tipVozila);
		smestiVoziloUParking(ps);

	}

	public void smestiVoziloUParking(PrevoznoSredstvo ps) {
		if (ps instanceof Automobil) {
			for (Parking parking : pvf.getListaParkinga()) {
				if (parking.dodavanjePrevoznogSredstva(ps)) {
					System.out.println("Uspesno ste parkirali " + ps.getTipVozila() + " na parking");
					break;
				}
			}
		} else if (ps instanceof Kamion || ps instanceof Autobusi) {
			for (Parking parking : pvf.getListaParkinga()) {
				if (parking.getVisinaParkinga() > 2) {
					if (parking.dodavanjePrevoznogSredstva(ps)) {
						System.out.println("Uspesno ste parkirali " + ps.getTipVozila() + " na parking");
						break;
					}
				}
			}
		} else {
			System.out.println("Trenutno neam mesta ni na jednom parkingu");
		}
	}

	public void ispisiPodatke() {
		int i = 1;
		System.out.println("------------------------------------");
		for (Parking parking : pvf.getListaParkinga()) {
			System.out.println(parking.getTipParkinga() + " parking " + i + " sa sledecim borjem vozila("
					+ parking.getListaParkiranihPrevoznihSredstava().size() + ")" + " i povrsinom "
					+ parking.getPovrsinaParkinga() + "m2 sadrzi:");
			for (PrevoznoSredstvo ps : parking.getListaParkiranihPrevoznihSredstava()) {
				System.out.println(ps.tipVozila+" koje ima povrsinu " +ps.getPovrsinaUM2() );
			}
			i++;
			System.out.println("Preostala slobodna povrsina parkinga je " + parking.slobodnaPovrsinaParkinga());
			System.out.println("------------------------------------");
		}
	}

}
