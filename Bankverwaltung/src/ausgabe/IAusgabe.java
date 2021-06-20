package ausgabe;

import java.util.HashMap;

import klassen.Buchung;
import klassen.KontoStamm;

public interface IAusgabe {
	
	void fehler(KontoStamm k, Buchung b, String fehler);
	void konten(HashMap<Integer, KontoStamm> konten);

}
