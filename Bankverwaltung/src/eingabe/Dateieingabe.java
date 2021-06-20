package eingabe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import klassen.*;

public class Dateieingabe implements IEingabe {
	private String dateiname = "C:\\Users\\bfz\\Downloads\\Bankdaten.txt";

	@Override
	public ArrayList<Buchung> buchungen() {
		ArrayList<Buchung> buchungsliste=new ArrayList<Buchung>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(dateiname));
			String eingabe = "";
			while ((eingabe = bf.readLine()) != null) {
				String[] tab = eingabe.split(";");
				if (tab[0].toLowerCase().equals("buchung")) {
					Buchung b= new Buchung();
					b.setKontonummer(Integer.parseInt(tab[1]));
					b.setBetrag(Integer.parseInt(tab[1]));
					b.setDatum(new Date());
					buchungsliste.add(b);
				}

			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public HashMap<Integer, KontoStamm> konten() {
		// TODO Auto-generated method stub
		HashMap<Integer, KontoStamm> konten = new HashMap<>();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(dateiname));
			String eingabe = "";
			while ((eingabe = bf.readLine()) != null) {
				System.out.println(eingabe);
				String[] tab = eingabe.split(";");

				if (tab[0].toLowerCase().equals("neuesgirokonto")) {
					GiroKonto gk = new GiroKonto();
					gk.setKontonummer(Integer.parseInt(tab[1]));
					gk.setKontoinhaber(tab[2]);
					gk.setDispo(Double.parseDouble(tab[3]));
					gk.setSollzins(Double.parseDouble(tab[4]));
					gk.setDatum(new Date());
					konten.put(gk.getKontonummer(), gk);
				} else if (tab[0].toLowerCase().equals("neuessparkonto")) {
					Sparkonto sk = new Sparkonto();
					sk.setKontonummer(Integer.parseInt(tab[1]));
					sk.setKontoinhaber(tab[2]);
					sk.setDatum(new Date());
					sk.setKuendenbetrag(Double.parseDouble(tab[3]));
					sk.setKuendedatum(new Date());
					sk.setHabenzins(Double.parseDouble(tab[5]));
					 konten.put(sk.getKontonummer(), sk);
				}else if (tab[0].toLowerCase().equals("neuesdarlehenskonto")) {
					Dahrlehnskonto dk = new Dahrlehnskonto();
					dk.setKontonummer(Integer.parseInt(tab[1]));
					dk.setKontoinhaber(tab[2]);
					dk.setDatum(new Date());
					dk.setRate((Double.parseDouble(tab[3])));
					 konten.put(dk.getKontonummer(), dk);
				}

			}
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return konten;
		
	}

}
