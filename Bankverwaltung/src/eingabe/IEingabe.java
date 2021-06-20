package eingabe;

import klassen.*;
import java.util.*;

import klassen.Buchung;

public interface IEingabe {
	ArrayList<Buchung> buchungen();
	HashMap<Integer,KontoStamm> konten();

}
