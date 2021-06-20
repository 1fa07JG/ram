package ausgabe;

import java.util.HashMap;

import klassen.Buchung;
import klassen.KontoStamm;

public class FXAusgabeEinfach implements IAusgabe {

	@Override
	public void fehler(KontoStamm k,Buchung b,String fehler) {
		
	}

	@Override
	public void konten(HashMap<Integer, KontoStamm> konten) {
		
	}

}
