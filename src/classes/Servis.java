package classes;

import dto.DtoPrevoznoSredstvo;
import Enum.Boja;
import Enum.TipDodatneOpreme;
import Enum.TipKlime;
import Enum.TipMotora;

public class Servis {

	PraviVoziloFactory pvf = PraviVoziloFactory.vratiInstancu();

	public void PrimiPorudzbinuIKreiraj(TipVozila tipVozila, DtoPrevoznoSredstvo dtoPS) {
		PrevoznoSredstvo ps = pvf.napraviVozilo(tipVozila, dtoPS);
		ps.setTipVozila(tipVozila);
		obracunajNovuCenu(ps);
		System.out.println("Ukupna cena vozila iznosi: " + ps.getUkupnaCena());
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
				System.out.println(ps.tipVozila + " koje ima povrsinu " + ps.getPovrsinaUM2());
			}
			i++;
			System.out.println("Preostala slobodna povrsina parkinga je " + parking.slobodnaPovrsinaParkinga());
			System.out.println("------------------------------------");
		}
	}

	public void obracunajNovuCenu(PrevoznoSredstvo ps) {
		double Cena = ps.getPocetnaCena();
		if (ps.tipMotora != null) {
			switch (ps.tipMotora) {
			case DIZEL:
				Cena += Cena * 0.05;
				break;
			case BENZIN:
				Cena += Cena * 0.03;
				break;
			case BENZIN_SA_KATALIZATOROM:
				Cena += Cena * 0.05;
				Cena += Cena * 0.025;
				break;
			case DIZEL_SA_TURBINOM:
				Cena += Cena * 0.05;
				Cena += Cena * 0.02;
				break;
			case DIZEL_SA_TURBINOM_I_PDFOM:
				Cena += Cena * 0.07;
				break;
			}
		}

		if (ps.tipBoje != null) {
			switch (ps.tipBoje) {
			case METALIK:
				Cena += Cena * 0.01;
				break;
			case METALIK_MAT:
				Cena += (Cena * 0.01) * 0.01;
				break;
			}
		}

		if (ps.tipDodatneOpreme != null) {
			switch (ps.tipDodatneOpreme) {
			case GPS:
				Cena += Cena * 0.015;
				break;
			case GPS_HUD_SENZOR_ZA_PARKIRANJE:
				Cena += Cena * 0.015;
				Cena += Cena * 0.02;
				Cena += Cena * 0.015;
				break;
			case GPS_I_HUD:
				Cena += Cena * 0.015;
				Cena += Cena * 0.02;
				break;
			case SENZOR_ZA_PARKIRANJE:
				Cena += Cena * 0.07;
				break;
			}
		}

		if (ps.tipKlime != null) {
			switch (ps.tipKlime) {
			case AUTOMATSKA_KLIMA:
				Cena += Cena * 0.03;
				Cena += Cena * 0.02;
				break;
			case MANUELNA_KLIMA:
				Cena += Cena * 0.03;
				break;
			}
		}
		ps.setUkupnaCena(Cena);
	}

}
