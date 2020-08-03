package classes;

public class ServiceFabrika {

	PraviVoziloFactory fabrikaVozila = PraviVoziloFactory.vratiInstancu();

	public PrevoznoSredstvo KreirajIParkirajVozilo(TipVozila tipVozila) {

		PrevoznoSredstvo ps = fabrikaVozila.napraviVozilo(tipVozila);

		ps.setTipVozila(tipVozila);
//		ps.setBoja("plava");
//		ps.setPovrsinaUM2(2);

		if (parkirajVoziloNaParking(ps)) {
			System.out.println("Vozilo uspesno " + ps.tipVozila +" parkirano!");
			return ps;
		} else {
			System.out.println("Nije moguce parkirati vozilo!");
			return null;
		}
	}

	private boolean parkirajVoziloNaParking(PrevoznoSredstvo ps) {
		switch (ps.getTipVozila()) {
		case KABRIOLET:
		case AUTOMOBIL_SA_KLASICNIM_KROVOM:
			if (smestiNaParking(0, ps)) {
				return true;
			}
			return false;
		case CISTERNA:
		case SLEPER:
		case GRADSKI_AUTOBUS:
		case MEDJUGRADSKI_AUTOBUS:
			if (smestiNaParking(1, ps)) {
				return true;
			}
			return false;
		}
		return false;
	}

	private boolean smestiNaParking(int index, PrevoznoSredstvo psPrijem) {
		for (int index1 = index; index1 < fabrikaVozila.getListaParkinga().size(); index1++) {
			if (fabrikaVozila.getListaParkinga().get(index1).slobodnaPovrsinaParkinga() >= psPrijem.getPovrsinaUM2()) {
				fabrikaVozila.getListaParkinga().get(index1).dodavanjePrevoznogSredstva(psPrijem);
				return true;
			}
		}
		return false;
	}
}
