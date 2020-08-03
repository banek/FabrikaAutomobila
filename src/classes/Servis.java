package classes;

public class Servis {
	PraviVoziloFactory fabrika = PraviVoziloFactory.vratiInstancu();

	public boolean parkirajVozilo(PrevoznoSredstvo ps) {
		if (ps instanceof Automobil) {
			for (Parking parking : fabrika.getListaParkinga()) {
				parking.dodavanjePrevoznogSredstva(ps);
				System.out.println("Dodato vozilo na parking "+parking.getTipParkinga()+"-og tipa");
				return true;
			}
		} else if(ps instanceof Kamion||ps instanceof Autobusi) {
			for (int i = 1; i <= fabrika.getListaParkinga().size(); i++) {
				fabrika.getListaParkinga().get(i).dodavanjePrevoznogSredstva(ps);
				System.out.println("Dodato vozilo na parking "+fabrika.getListaParkinga().get(i).getTipParkinga()+"-og tipa");
				return true;
			}
		}
		return false;
	}

}
