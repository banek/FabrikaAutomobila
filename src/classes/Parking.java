package classes;

import java.util.ArrayList;



public class Parking {
	private TipParkinga tipParkinga;
	private int povrsinaParkinga;
	private int visinaParkinga;
	ArrayList<PrevoznoSredstvo> listaParkiranihPrevoznihSredstava = new ArrayList<PrevoznoSredstvo>();

	public Parking() {
	}

	public Parking(TipParkinga tipParkinga, int povrsinaParkinga, int visinaParkinga) {
		
		this.tipParkinga = tipParkinga;
		this.povrsinaParkinga = povrsinaParkinga;
		this.visinaParkinga = visinaParkinga;
	}

	public ArrayList<PrevoznoSredstvo> getListaParkiranihPrevoznihSredstava() {
		return listaParkiranihPrevoznihSredstava;
	}

	public void setListaParkiranihPrevoznihSredstava(ArrayList<PrevoznoSredstvo> listaParkiranihPrevoznihSredstava) {
		this.listaParkiranihPrevoznihSredstava = listaParkiranihPrevoznihSredstava;
	}

	public TipParkinga getTipParkinga() {
		return tipParkinga;
	}

	public void setTipParkinga(TipParkinga tipParkinga) {
		this.tipParkinga = tipParkinga;
	}

	public int getPovrsinaParkinga() {
		return povrsinaParkinga;
	}

	public void setPovrsinaParkinga(int povrsinaParkinga) {
		this.povrsinaParkinga = povrsinaParkinga;
	}

	public int getVisinaParkinga() {
		return visinaParkinga;
	}

	public void setVisinaParkinga(int visinaParkinga) {
		this.visinaParkinga = visinaParkinga;
	}
	public boolean dodavanjePrevoznogSredstva(PrevoznoSredstvo prevoznoSredstvo) {
	
		for(PrevoznoSredstvo ps :listaParkiranihPrevoznihSredstava) {
			if(ps.equals(prevoznoSredstvo)) {
				System.out.println("Prevozno sredstvo vec postoji");
				return false;
			}
		}
		if(slobodnaPovrsinaParkinga()<prevoznoSredstvo.getPovrsinaUM2()) {
			System.out.println("Nema dovoljno mesta da bi se vozilo ubacilo");
			return false;
		}else {
		listaParkiranihPrevoznihSredstava.add(prevoznoSredstvo);
		return true;
		}
	}
	public int slobodnaPovrsinaParkinga() {
		int zazetapovrsina=0;
		for(PrevoznoSredstvo ps: listaParkiranihPrevoznihSredstava) {
			
			zazetapovrsina+=ps.getPovrsinaUM2();
		}
		return povrsinaParkinga-zazetapovrsina;
		
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(tipParkinga+" parking ima " +listaParkiranihPrevoznihSredstava.size()+" vozila i to su:");
		for(PrevoznoSredstvo ps : listaParkiranihPrevoznihSredstava) {
			str.append(ps.getTipVozila()+", ");
		}
		return str.toString();
	}
}
