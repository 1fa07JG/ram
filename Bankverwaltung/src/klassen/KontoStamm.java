package klassen;

import java.util.ArrayList;
import java.util.Date;

public class KontoStamm {
	
	private Date datum;
	private String kontoinhaber;
	private int kontonummer;
	private double saldo;
	private ArrayList <Buchung>buchungen=new ArrayList<>();
	
	
	

	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public String getKontoinhaber() {
		return kontoinhaber;
	}
	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}
	public int getKontonummer() {
		return kontonummer;
	}
	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getInfo()
	{
		String s = "\n";
		s+="---------------------------------\n";
		s+="Kontonr\t\t: "+this.kontonummer+"\n";
		
		s+="Art\t\t: "+this.getClass().getSimpleName()+"\n";
		s+="Inhaber \t: "+this.kontoinhaber+"\n";
		s+="Saldo\t\t: "+this.saldo+"\n\n";
		
		
		return s;
	}

	
}
