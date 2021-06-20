package klassen;

import java.util.Date;

public class Buchung {
	private double betrag;
	private Date datum;
	private int kontonummer;
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public int getKontonummer() {
		return kontonummer;
	}
	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

}
