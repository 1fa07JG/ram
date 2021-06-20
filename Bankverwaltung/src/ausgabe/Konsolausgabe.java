package ausgabe;

import java.util.HashMap;

import javax.swing.text.AbstractDocument.Content;

import klassen.Buchung;
import klassen.KontoStamm;

public class Konsolausgabe implements IAusgabe {

	@Override
	public void fehler(KontoStamm k, Buchung b, String fehler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void konten(HashMap<Integer, KontoStamm> konten) {
for (KontoStamm k: konten.values() ) {
	System.out.println(k.getInfo());
}		
	}

}
